package com.pbl3.model;

public class Order {
	private String orderID;
	private String userID;
	private String orderStatus;
	private double orderTotal;
	
	public Order(String orderID, String userID, String orderStatus, double orderTotal) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.orderStatus = orderStatus;
		this.orderTotal = orderTotal;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	
}
