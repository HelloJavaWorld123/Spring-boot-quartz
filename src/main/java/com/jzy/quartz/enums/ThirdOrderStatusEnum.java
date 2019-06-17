package com.jzy.quartz.enums;

/**
 * @author : RXK
 * Date : 2019/6/17 10:53
 * Version: V1.0.0
 * Desc: 第三方订单状态
 **/
public enum  ThirdOrderStatusEnum {
	/**
	 * 	 * 31：退款成功；32：退款失败；33：退款可疑；34：待审核
	 * 	 * 35：审核通过;36:审核拒绝；37：打款成功；38：打款失败
	 */
	XIMEI_REFUND_SUCCESS(31,"退款成功"),
	XIMEI_REFUND_FAIL(32,"退款失败"),
	XIMEI_REFUND_SUSPICIOUS(33,"退款可疑"),
	XIMEI_REFUND_VERIFY(34,"待审核"),
	XIMEI_REFUND_VERIFY_PASSED(35,"审核通过"),
	XIMEI_REFUND_VERIFY_REJECT(36,"审核拒绝"),
	XIMEI_REFUND_REMITTANCE_SUCCESS(37,"打款成功"),
	XIMEI_REFUND_REMITTANCE_FAIL(38,"打款失败"),
	;


	private int state;

	private String desc;

	ThirdOrderStatusEnum(int state, String desc) {
		this.state = state;
		this.desc = desc;
	}

	public int getState() {
		return state;
	}

	public String getDesc() {
		return desc;
	}
}
