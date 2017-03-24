package com.entity;

import java.util.List;

public class Order {

	private String oid;
	
	private String ordertime;
	
	private String address;
	
	private List<Orderitem> orderItemList;

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Orderitem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<Orderitem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", ordertime=" + ordertime + ", address="
				+ address + ", orderItemList=" + orderItemList + "]";
	}
	
	
}
