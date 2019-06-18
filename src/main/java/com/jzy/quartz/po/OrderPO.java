package com.jzy.quartz.po;

import lombok.Data;

/**
 * @author : RXK
 * Date : 2019/6/14 11:51
 * Version: V1.0.0
 * Desc: 订单以及交易记录相关
 **/
@Data
public class OrderPO {

	private String orderId;

	private String outTradeNo;

	private String tradeRecordId;

	private String markId;

}
