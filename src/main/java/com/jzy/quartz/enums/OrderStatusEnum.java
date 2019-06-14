package com.jzy.quartz.enums;

/**
 * @author : RXK
 * Date : 2019/6/13 15:40
 * Version: V1.0.0
 * Desc: 订单状态枚举
 **/
public enum OrderStatusEnum {
	//未支付
	UNPAY,
	//充值中
	RECHARGING,
	//充值成功
	RECHARGE_SUCCESS,
	//充值失败
	RECHARGE_FAIL,
	//充值关闭
	CLOSE_RECHARGE;
}
