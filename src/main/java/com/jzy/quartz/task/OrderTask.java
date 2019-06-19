package com.jzy.quartz.task;

import com.jzy.quartz.enums.OrderStatusEnum;
import com.jzy.quartz.enums.PayTypeEnum;
import com.jzy.quartz.enums.TradeRecordStatusEnum;
import com.jzy.quartz.enums.TradeRecordTypeEnum;
import com.jzy.quartz.model.Order;
import com.jzy.quartz.po.OrderPO;
import com.jzy.quartz.po.XiMeiResultPO;
import com.jzy.quartz.service.OrderService;
import com.jzy.quartz.utils.LogUtils;
import com.jzy.quartz.utils.XiMeiUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : RXK
 * Date : 2019/6/13 15:27
 * Version: V1.0.0
 * Desc: 处理订单相关的任务
 **/
@Component
public class OrderTask {


	private final OrderService orderService;

	public OrderTask(OrderService orderService) {
		this.orderService = orderService;
	}

	/**
	 * 修改待支付的订单 改成 订单关闭
	 * <p>
	 * 每5秒钟执行一次
	 */
	@Scheduled(cron = "0/5 * * * * *")
	public void closeOrder() {
		LogUtils.infoLog("开始查询状态为0的订单");
		List<Order> orderList = orderService.findByStatus(OrderStatusEnum.UNPAY.ordinal());

		//筛选大于15分钟的订单
		List<Order> orders = moreThenFifteen(orderList);

		//改变订单的状态
		List<Order> changeOrderStatusAfter = changeOrderStatus(orders);

		//数据库批量更新
		if (CollectionUtils.isNotEmpty(changeOrderStatusAfter)) {
			LogUtils.infoLog("开始批量更新数据库中的数据");
			orderService.batchUpdate(changeOrderStatusAfter);
			LogUtils.infoLog("批量更新数据库订单完成");
		}
		LogUtils.infoLog("订单任务执行完成");
	}

	/**
	 * 每天的凌晨5点执行
	 * 请求ximei 查询当前订单 退款是否成功
	 * 成功后改变订单状态 以及 交易记录 表
	 */
//	@Scheduled(cron = "0/2 * * * * *")
	@Scheduled(cron = "0 0 5 * * *")
	public void handleOrderRefund() {
		LogUtils.infoLog("Start ximei支付失败的订单 Task");

		//查询使用ximei支付并且支付失败的订单
		List<OrderPO> orders = orderService.findByPayTypeAndStatus(PayTypeEnum.ICCARD_TYPE.ordinal(), OrderStatusEnum.RECHARGE_FAIL.ordinal(), TradeRecordStatusEnum.WAITED.ordinal(), TradeRecordTypeEnum.REFUND.ordinal());

		if (CollectionUtils.isEmpty(orders)) {
			LogUtils.infoLog("END 暂无需要退款处理的订单");
			return;
		}

		//请求ximei支付 查询当前支付失败的订单  处理结果 并修改订单的状态
		List<OrderPO> orderPos = XiMeiUtils.checkOrder(orders);

		//批量更新订单的状态
		if (CollectionUtils.isEmpty(orderPos)) {
			LogUtils.infoLog("请求ximei后暂无可处理的订单，结束订单任务");
			return;
		}

		List<String> orderIds = orderPos.stream()
										.map(OrderPO::getOrderId)
										.collect(Collectors.toList());

		List<String> tradeRecordIds = orderPos.stream()
											  .map(OrderPO::getTradeRecordId)
											  .collect(Collectors.toList());

		orderService.batchUpdateOrderStatus(orderIds);
		orderService.batchUpdateTradeRecordStatus(tradeRecordIds);

		LogUtils.infoLog("END 处理ximei支付失败的订单 Task");
	}


	private List<Order> changeOrderStatus(List<Order> orders) {
		List<Order> result = null;
		if (CollectionUtils.isNotEmpty(orders)) {
			result = Order.batchBuild(orders);
		}
		return result;
	}

	private List<Order> moreThenFifteen(List<Order> orderList) {
		List<Order> result = null;
		if (CollectionUtils.isNotEmpty(orderList)) {
			result = orderList.stream()
							  .filter(item -> intervalTime(item.getCreateTime()))
							  .collect(Collectors.toList());

		}
		return result;
	}


	private boolean intervalTime(Date createTime) {
		Date now = new Date();
		long diff = now.getTime() - createTime.getTime();
		return diff > 900000;
	}
}
