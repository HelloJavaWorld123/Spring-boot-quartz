package com.jzy.quartz.service.impl;

import com.jzy.quartz.mapping.OrderMapper;
import com.jzy.quartz.model.Order;
import com.jzy.quartz.po.OrderPO;
import com.jzy.quartz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : RXK
 * Date : 2019/6/13 15:26
 * Version: V1.0.0
 * Desc:
 **/
@Service
public class OrderServiceImpl implements OrderService {

	private final OrderMapper orderMapper;

	public OrderServiceImpl(OrderMapper orderMapper) {
		this.orderMapper = orderMapper;
	}


	@Override
	public List<Order> findByStatus(int orderStatus) {
		return orderMapper.findByStatus(orderStatus);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void batchUpdate(List<Order> changeOrderStatusAfter) {
		orderMapper.batchUpdate(changeOrderStatusAfter);
	}

	@Override
	public List<OrderPO> findByPayTypeAndStatus(int orderMethod, int orderStatus, int tradeRecordStatus, int tradeRecordType) {
		return orderMapper.findByTypeAndStatus(orderMethod,orderStatus,tradeRecordStatus,tradeRecordType);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void batchUpdateOrderStatus(List<String> orderIds) {
		orderMapper.batchUpdateOrderStatus(orderIds);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void batchUpdateTradeRecordStatus(List<String> tradeRecordIds) {
		orderMapper.batchUpdateTradeRecordStatus(tradeRecordIds);
	}
}
