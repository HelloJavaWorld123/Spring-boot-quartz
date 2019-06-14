package com.jzy.quartz.service;

import com.jzy.quartz.model.Order;
import com.jzy.quartz.po.OrderPO;

import java.util.List;

/**
 * @author : RXK
 * Date : 2019/6/13 15:25
 * Version: V1.0.0
 * Desc: 订单相关
 **/
public interface OrderService {

	/**
	 * 查询指定状态的订单
	 * @param orderStatus ：订单的状态 {@see : OrderStatusEnum}
	 * @return : 未支付的订单
	 */
	List<Order> findByStatus(int orderStatus);

	/**
	 * 批量更新订单的状态
	 * @param changeOrderStatusAfter ：改变状态以后的订单
	 */
	void batchUpdate(List<Order> changeOrderStatusAfter);

	/**
	 * 根据状态查询 需要修改退款状态的订单
	 * @param orderMethod ：订单支付类型
	 * @param orderStatus ：订单状态
	 * @param tradeRecordStatus ：交易记录状态
	 * @param tradeRecordType ：交易记录类型
	 * @return ：list
	 */
	List<OrderPO> findByPayTypeAndStatus(int orderMethod, int orderStatus, int tradeRecordStatus, int tradeRecordType);

	/**
	 * 需要更改的订单id
	 * @param orderIds ：订单id
	 */
	void batchUpdateOrderStatus(List<String> orderIds);

	/**
	 * 需要更改的交易记录id
	 * @param tradeRecordIds ：交易记录id
	 */
	void batchUpdateTradeRecordStatus(List<String> tradeRecordIds);
}
