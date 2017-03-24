package com.dao;
import java.util.List;
import com.entity.Order;
import com.entity.Orderitem;
public interface OrderMapper {
	/**
	 * 根据oid查询单条订单
	 */
	Order getOrderByOid(String oid);
	
	
	/**
	 * 根据oid来查询orderitem的列表
	 */
	List<Orderitem> findOrderItemsByOid(String oid);
}
