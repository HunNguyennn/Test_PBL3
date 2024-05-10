package com.pbl3.model;

import java.sql.Time;

public class Comment {
	private String commentID;
	private String userID;
	private String productID;
	private String Content;
	private Time createAt;
	
	public Comment(String commentID, String userID, String productID, String content, Time createAt) {
		super();
		this.commentID = commentID;
		this.userID = userID;
		this.productID = productID;
		Content = content;
		this.createAt = createAt;
	}
	public String getCommentID() {
		return commentID;
	}
	public void setCommentID(String commentID) {
		this.commentID = commentID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public Time getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Time createAt) {
		this.createAt = createAt;
	}
}
