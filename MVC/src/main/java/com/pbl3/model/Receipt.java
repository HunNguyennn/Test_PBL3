package com.pbl3.model;

import java.sql.Date;

public class Receipt {
	private String receiptID;
	private double Cost;
	private Date Date;
	
	public Receipt(String receiptID, double cost, java.sql.Date date) {
		super();
		this.receiptID = receiptID;
		Cost = cost;
		Date = date;
	}
	public String getReceiptID() {
		return receiptID;
	}
	public void setReceiptID(String receiptID) {
		this.receiptID = receiptID;
	}
	public double getCost() {
		return Cost;
	}
	public void setCost(double cost) {
		Cost = cost;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	
	
}
