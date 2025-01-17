package com.pbl3.model;

public class ReceiptDetail {
	private String receiptDetailID;
	private String receiptID;
	private String productID;
	private int Quantity;
	
	public ReceiptDetail(String receiptDetailID, String receiptID, String productID, int quantity) {
		super();
		this.receiptDetailID = receiptDetailID;
		this.receiptID = receiptID;
		this.productID = productID;
		Quantity = quantity;
	}
	public String getReceiptDetailID() {
		return receiptDetailID;
	}
	public void setReceiptDetailID(String receiptDetailID) {
		this.receiptDetailID = receiptDetailID;
	}
	public String getReceiptID() {
		return receiptID;
	}
	public void setReceiptID(String receiptID) {
		this.receiptID = receiptID;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
}
