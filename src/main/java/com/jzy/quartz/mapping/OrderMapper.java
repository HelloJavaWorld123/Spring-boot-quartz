package com.jzy.quartz.mapping;

import com.jzy.quartz.model.Order;
import com.jzy.quartz.model.OrderExample;
import java.util.List;

import com.jzy.quartz.po.OrderPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    long countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

	void batchUpdate(@Param("orderList") List<Order> changeOrderStatusAfter);

    List<Order> selectByStatus(int orderStatus);

	List<OrderPO> findByTypeAndStatus(@Param("orderMethod") int orderMethod, @Param("orderStatus") int orderStatus, @Param("tradeRecordStatus") int tradeRecordStatus, @Param("tradeRecordType") int tradeRecordType);

	void batchUpdateOrderAndTradeRecord(@Param("orderPOS") List<String> orderIds);

	void batchUpdateOrderStatus(@Param("orderIds") List<String> orderIds);

	void batchUpdateTradeRecordStatus(@Param("tradeRecordIds") List<String> tradeRecordIds);
}