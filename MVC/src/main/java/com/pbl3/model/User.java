package com.pbl3.model;

import java.sql.Date;
import java.time.LocalDate;

public class User {
	private String userID;
	private int roleID;
	private String userName;
	private String Password; 
	private String Name; 
	private String Address;
	private String phoneNumber; 
	private LocalDate dateOfBirth;
	
	public User(int roleID, String userName, String password, String name, String address,
			String phoneNumber, LocalDate dateOfBirth) {
		super();
		this.roleID = roleID;
		this.userName = userName;
		Password = password;
		Name = name;
		Address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}
	
	public User(String userID, int roleID, String userName, String password, String name, String address,
			String phoneNumber, LocalDate dateOfBirth) {
		super();
		this.userID = userID;
		this.roleID = roleID;
		this.userName = userName;
		Password = password;
		Name = name;
		Address = address;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public int getRoleID() {
		return roleID;
	}
	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
