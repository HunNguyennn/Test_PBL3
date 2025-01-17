package com.pbl3.model;

public class Product {
	private String productID;
	private String productName;
	private String Category;
	private String productVariant;
	private int stringNumber;
	private int keyNumber;
	private String Brand;
	private double Price;
	private int Quantity;
	private String description;

	public Product(String productID, String productName, String category, String productVariant, int stringNumber,
			int keyNumber, String brand, double price, int quantity, String description) {
		super();
		this.productID = productID;
		this.productName = productName;
		Category = category;
		this.productVariant = productVariant;
		this.stringNumber = stringNumber;
		this.keyNumber = keyNumber;
		Brand = brand;
		Price = price;
		Quantity = quantity;
		this.description = description;
	}
	public Product(String productName, String category, String productVariant, int stringNumber,
			int keyNumber, String brand, double price, int quantity, String description) {
		super();
		this.productName = productName;
		Category = category;
		this.productVariant = productVariant;
		this.stringNumber = stringNumber;
		this.keyNumber = keyNumber;
		Brand = brand;
		Price = price;
		Quantity = quantity;
		this.description = description;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getProductVariant() {
		return productVariant;
	}
	public void setProductVariant(String productVariant) {
		this.productVariant = productVariant;
	}
	public int getStringNumber() {
		return stringNumber;
	}
	public void setStringNumber(Short stringNumber) {
		this.stringNumber = stringNumber;
	}
	public int getKeyNumber() {
		return keyNumber;
	}
	public void setKeyNumber(Short keyNumber) {
		this.keyNumber = keyNumber;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
