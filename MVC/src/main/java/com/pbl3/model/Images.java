package com.pbl3.model;

public class Images {
	private String imagesID;
	private String productID;
	private String imagesPath;
	
	public Images(String imagesID, String productID, String imagesPath) {
		super();
		this.imagesID = imagesID;
		this.productID = productID;
		this.imagesPath = imagesPath;
	}
	public String getImagesID() {
		return imagesID;
	}
	public void setImagesID(String imagesID) {
		this.imagesID = imagesID;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getImagesPath() {
		return imagesPath;
	}
	public void setImagesPath(String imagesPath) {
		this.imagesPath = imagesPath;
	}
	
}