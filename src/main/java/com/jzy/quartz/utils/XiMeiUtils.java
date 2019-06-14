package com.jzy.quartz.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jzy.quartz.po.OrderPO;
import com.jzy.quartz.po.XiMeiResultPO;
import com.rrtx.mer.bean.ProcessMessage;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.transform.TransformerFactory;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : RXK
 * Date : 2019/6/14 14:12
 * Version: V1.0.0
 * Desc:
 **/
@Data
@Slf4j
public class XiMeiUtils {


	private static String version;

	private static String merchantId;

	private static String orderQueryUrl;

	private static String keyPassword;

	private static String keyPath;

	private static String orderQueryInterfaceName;


	/**
	 * 请求成功时 ximei 返回的结果时：
	 * {"signData":"H7FpMpX627aqaZtEloS0bQNhXQEX2db/w9r+QBf2JLFHS+j4nUOIafFNqV4czBW/v3eIH5OarafjWVHlxBlaUWTuzuMurzN5LekLJX7iCtWaDtnkTxAkxkWzf/QtF/SIlSzUJSZfpP2e0xwA4KdfsWngpMClVkKyMcw4bV7qDTVTuoyn4HwobCGs0bkpZR4eTVJomHOuWXzpkYAn4aREEMy2+PqwiebLjk/T39VUWKkxyhOr9mCRF1Ojf//8CtgNdNAmBtczwIV/5xtb6UQDSOgnAdCWO582gErp0lQc0bC/Tg5QTTB08v7ljANZCuj1X64m9vIdmbUiwUx34bO0fQ==",
	 * "tranData":"PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz48b3JkZXJSZXNwb25zZT4KPG9yZGVyTm8+MjAxOTA2MTMxMDM0MTEwODg1NDU8L29yZGVyTm8+CjxtZXJjaGFudElkPk0xMDAwMDAwNDA8L21lcmNoYW50SWQ+Cjx0cmFuU3RhdD4zNDwvdHJhblN0YXQ+Cjx0cmFuU2VyaWFsTm8+VEsyMDE5MDYxMzEwMDAwMDA2MjQ8L3RyYW5TZXJpYWxObz4KPGN1clR5cGUgPkNOWTwvY3VyVHlwZSA+Cjx0cmFuRGF0ZT4yMDE5MDYxMzIwMTU0OTwvdHJhbkRhdGU+CjxvcmRlckFtdD4wLjAxPC9vcmRlckFtdD4KPC9vcmRlclJlc3BvbnNlPgo="}
	 * 经过 Base64 解码后：
	 * <?xml version="1.0" encoding="UTF-8"?>
	 * <orderResponse>
	 * <orderNo>20190613103411088545</orderNo>
	 * <merchantId>M100000040</merchantId>
	 * <tranStat>34</tranStat>
	 * <tranSerialNo>TK201906131000000624</tranSerialNo>
	 * <curType >CNY</curType >
	 * <tranDate>20190613201549</tranDate>
	 * <orderAmt>0.01</orderAmt>
	 * </orderResponse>
	 * 其中 tranStat 对照码如下：
	 * 31：退款成功；32：退款失败；33：退款可疑；34：待审核
	 * 35：审核通过;36:审核拒绝；37：打款成功；38：打款失败
	 *
	 *
	 * 参数错误时 返回的结果是：
	 * {"returnCode":"","returnMessage":"订单号和退款订单号无关联"}
	 */
	public static List<OrderPO> checkOrder(List<OrderPO> orderPos) {
		List<OrderPO> successRefund = new ArrayList<>();
		orderPos.stream()
				.filter(XiMeiUtils::isXiMeiOrder)
				.forEach(item -> {
					//组装请求数据
					Map<String, String> param = getPostParam(item);

					//发送post 请求
					String result = HttpUtil.post(getOrderQueryUrl(),param);
					log.info("请求返回的结果是:{}", result);

					//当前是否满足更改状态
					if(needChangeStatus(result)){
						successRefund.add(item);
					}
				});
		return successRefund;
	}

	private static boolean needChangeStatus(String result) {
		if(StringUtils.isNotBlank(result)){
			XiMeiResultPO po = JSON.parseObject(ProcessMessage.Base64Decode(result), XiMeiResultPO.class);
			if(StringUtils.isNotBlank(po.getTranData())){
				String resultXml = new String(ProcessMessage.Base64Decode(po.getTranData()));
				try {
					String tranStat = getTranStat(resultXml);
					if(StringUtils.isNotBlank(tranStat)){
						int stat = Integer.parseInt(tranStat);
						if(stat == 31){
							return true;
						}
					}
				} catch (DocumentException e) {
					e.printStackTrace();
					log.info("解析String 至XML 出现异常：",e);
					return false;
				}
			}
		}
		return false;
	}

	private static Map<String, String> getPostParam(OrderPO item) {
		//组装请求的数据
		String requestData = String.format(getRequestModel(), getMerchantId(), item.getOutTradeNo(), item.getMarkId());

		//对请求的数据进行签名 以及 base64 编码
		byte[] bytes = ProcessMessage.signMessage(requestData, getKeyPath(), getKeyPassword());
		String merSignMsg = new String(bytes, StandardCharsets.UTF_8);
		String tranDataBase64 = ProcessMessage.Base64Encode(requestData.getBytes());

		Map<String, String> param = new HashMap<>(5);
		param.put("interfaceName", getOrderQueryInterfaceName());
		param.put("tranData", tranDataBase64);
		param.put("merSignMsg", merSignMsg);
		param.put("merchantId", getMerchantId());
		return param;
	}

	private static String getTranStat(String resultXml) throws DocumentException {
		Document document = DocumentHelper.parseText(resultXml);
		Element element = document.getRootElement();
		return element.element("tranStat")
								 .getText();
	}

	private static String getRequestModel() {
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?>")
		  .append("<orderRequest>")
		  .append("<merchantId>").append("%s").append("</merchantId>")
		  .append("<orderNo>").append("%s").append("</orderNo>")
		  .append("<tranSerialNo>").append("%s").append("</tranSerialNo>")
		  .append("</orderRequest>");
		return sb.toString();
	}

	private static boolean isXiMeiOrder(OrderPO item) {
		return StringUtils.startsWith(item.getMarkId(), "TK");
	}

	public static String getVersion() {
		return version;
	}

	@Value("${ximeipay.version}")
	public static void setVersion(String version) {
		XiMeiUtils.version = version;
	}

	public static String getMerchantId() {
		return merchantId;
	}

	@Value("${ximeipay.merchantId}")
	public static void setMerchantId(String merchantId) {
		XiMeiUtils.merchantId = merchantId;
	}

	public static String getOrderQueryUrl() {
		return orderQueryUrl;
	}

	@Value("${ximeipay.orderQueryUrl}")
	public static void setOrderQueryUrl(String orderQueryUrl) {
		XiMeiUtils.orderQueryUrl = orderQueryUrl;
	}

	public static String getOrderQueryInterfaceName() {
		return orderQueryInterfaceName;
	}

	@Value("${ximeipay.orderQueryInterfaceName}")
	public static void setOrderQueryInterfaceName(String orderQueryInterfaceName) {
		XiMeiUtils.orderQueryInterfaceName = orderQueryInterfaceName;
	}


	public static String getKeyPassword() {
		return keyPassword;
	}

	@Value("${ximeipay.keyPassword}")
	public static void setKeyPassword(String keyPassword) {
		XiMeiUtils.keyPassword = keyPassword;
	}

	public static String getKeyPath() {
		return keyPath;
	}

	@Value("${ximeipay.keyPath}")
	public static void setKeyPath(String keyPath) {
		XiMeiUtils.keyPath = keyPath;
	}
}
