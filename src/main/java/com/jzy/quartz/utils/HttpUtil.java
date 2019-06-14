package com.jzy.quartz.utils;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.http.HttpEntity;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Map;

/**
 * @author : RXK
 * Date : 2019/6/14 11:08
 * Version: V1.0.0
 * Desc: Http请求工具类
 **/
public class HttpUtil {


	public static String post(String url, Map<String, String> param) {
		Assert.isTrue(!CollectionUtils.isEmpty(param), "参数不能为空");
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Map<String, String>> httpEntity = new HttpEntity<>(param);
		return restTemplate.postForObject(url, httpEntity, String.class);
	}


	public static String httpclientPost(String url, Map<String, String> param) {
		PostMethod mypost = new PostMethod(url);
		mypost.addParameter("interfaceName",param.get("interfaceName"));	// 接口名称 queryOrder
		mypost.addParameter("version", XiMeiUtils.version);	// 版本号,使用值: WAP1.0
		mypost.addParameter("tranData", param.get("tranData"));			// 交易数据密文串
		mypost.addParameter("merSignMsg", param.get("merSignMsg"));			// 签名串
		mypost.addParameter("merchantId", param.get("merchantId"));			// 商户号
		HttpClient client = new HttpClient();
		int result = 0;
		try {
			result = client.executeMethod(mypost);
			return mypost.getResponseBodyAsString();
		} catch (IOException e) {
			System.out.println(e);
		}
		return String.valueOf(result);
	}


}
