package com.jzy.quartz.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.jzy.quartz.enums.OrderStatusEnum;
import lombok.Data;

/**
*@author : RXK
* DataBase: order
*/
@Data
public class Order {
    /**
    *
    * comment: 主键id
    */
    private String id;

    /**
    *
    * comment: 支付宝/微信订单号
    */
    private String code;

    /**
    *
    * comment: 系统自定义订单号
    */
    private String outTradeNo;

    /**
    *
    * comment: 用户id
    */
    private String userId;

    /**
    *
    * comment: 商品id
    */
    private Long appId;

    /**
    *
    */
    private Long aptId;

    /**
    *
    * comment: sup商品提交分组编号
    */
    private String supNo;

    /**
    *
    * comment: sup商品提交金额
    */
    private BigDecimal supPrice;

    /**
    *
    * comment: sup状态，0未提交1已提交2成功3失败
    */
    private Integer supStatus;

    /**
    *
    * comment: 折扣
    */
    private BigDecimal discount;

    /**
    *
    * comment: 面值价格
    */
    private BigDecimal price;

    /**
    *
    * comment: 购买数量
    */
    private Integer number;

    /**
    *
    * comment: 订单状态0待支付,1充值中,2充值成功,3充值失败,4充值关闭
    */
    private Integer status;

    /**
    *
    * comment: 订单类型:  关联  app_type 表
    */
    private Integer type;

    /**
    *
    * comment: 用户应付总金额
    */
    private BigDecimal totalFee;

    /**
    *
    * comment: 充值类型名称
    */
    private String priceTypeName;

    /**
    *
    * comment: 充值类型单位
    */
    private String priceTypeUnit;

    /**
    *
    * comment: 账号类型名称
    */
    private String accType;

    /**
    *
    * comment: 充值账号
    */
    private String account;

    /**
    *
    * comment: 游戏账号
    */
    private String gameAccount;

    /**
    *
    * comment: 游戏区
    */
    private String gameArea;

    /**
    *
    * comment: 游戏服
    */
    private String gameSery;

    /**
    *
    * comment: 支付方式:微信0,支付宝1,银行卡2
    */
    private Integer tradeMethod;

    /**
    *
    * comment: 支付系统交易号
    */
    private String tradeCode;

    /**
    *
    * comment: 交易金额
    */
    private BigDecimal tradeFee;

    /**
    *
    * comment: 支付状态
    */
    private String tradeStatus;

    /**
    *
    * comment: 是否删除
    */
    private Integer delFlag;

    /**
    *
    * comment: 开票状态
    */
    private Integer invoiceStatus;

    /**
    *
    * comment: 备注
    */
    private String remark;

    /**
    *
    * comment: 商户id
    */
    private Long dealerId;

    /**
    *
    * comment: 创建人id
    */
    private Long creatorId;

    /**
    *
    * comment: 修改人id
    */
    private Long modifierId;

    /**
    *
    * comment: 创建时间
    */
    private Date createTime;

    /**
    *
    * comment: 更新时间
    */
    private Date modifyTime;

    /**
    *
    */
    private Integer rechargeMode;

    /**
    *
    */
    private BigDecimal dealerPrice;

    /**
    *
    */
    private Date payTime;

	/**
	 *
	 */
	private Date finishTime;

	public static List<Order> batchBuild(List<Order> orders) {
		return orders.stream()
					 .peek(item ->{
						 item.setStatus(OrderStatusEnum.CLOSE_RECHARGE.ordinal());
						 item.setModifyTime(new Date());
					 }).collect(Collectors.toList());
	}
}