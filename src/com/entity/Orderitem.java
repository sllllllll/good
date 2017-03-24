package com.entity;

public class Orderitem {

	private String orderItemId;
	
	private double currPrice;
	
	private int quantity;

	public String getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	public double getCurrPrice() {
		return currPrice;
	}

	public void setCurrPrice(double currPrice) {
		this.currPrice = currPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Orderitem [orderItemId=" + orderItemId + ", currPrice="
				+ currPrice + ", quantity=" + quantity + "]";
	}
	
	
}
