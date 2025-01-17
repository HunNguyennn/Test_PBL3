package com.pbl3.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import com.pbl3.model.User;

public class AccountService extends BaseService {
	public static ArrayList<User> searchUserByName(String name){
		String sql = "SELECT * FROM user WHERE Name like \"%"+ name +"\"" ;
		ArrayList<User> users = new ArrayList<User>();
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String userID = rs.getString("userID");
				int roleID = rs.getInt("roleID");
				String userName = rs.getString("userName");
				String Password = rs.getString("Password"); 
				String Name = rs.getString("Name"); 
				String Address = rs.getString("Address");
				String phoneNumber = rs.getString("phoneNumber"); 
				LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
				User user = new User(userID, roleID, userName, Password, Name, Address, phoneNumber, dateOfBirth);
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public static User searchUserByPhoneNumber(String phoneNumber) {
		String sql = "SELECT * FROM user WHERE phoneNumber = \""+ phoneNumber +"\"" ;
		User user = new User();
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String userID = rs.getString("userID");
				int roleID = rs.getInt("roleID");
				String userName = rs.getString("userName");
				String Password = rs.getString("Password"); 
				String Name = rs.getString("Name"); 
				String Address = rs.getString("Address");
				LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
				user = new User(userID, roleID, userName, Password, Name, Address, phoneNumber, dateOfBirth);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
//	public static ArrayList<User> all(){
//		return query("");
//	}
	
	public static void addUser(User user) {
		String sql = "INSERT user(roleID,userName,Password,Name,Address,phoneNumber,dateOfBirth) VALUES (?,?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
				PreparedStatement pstmt = connection.prepareStatement(sql);
		){
			pstmt.setInt(1, 1);
			pstmt.setString(2, user.getUserName());
			pstmt.setString(3, "123");
			pstmt.setString(4, user.getName());
			pstmt.setString(5,user.getAddress());
			pstmt.setString(6,user.getPhoneNumber());
			pstmt.setDate(7, Date.valueOf(user.getDateOfBirth()));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	
	public static void editUser(User user) {
		String SQLString = "UPDATE user SET userName = ?, Name = ?, Address = ?, phoneNumber = ?, dateOfBirth =? WHERE userID = \""+ user.getUserID() + "\"" ;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
				PreparedStatement pstmt = connection.prepareStatement(SQLString);
		){
			pstmt.setString(1, user.getUserName());
			pstmt.setString(2, user.getName());
			pstmt.setString(3,user.getAddress());
			pstmt.setString(4,user.getPhoneNumber());
			pstmt.setDate(5, Date.valueOf(user.getDateOfBirth()));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static User searchUser(String user_id) {
		User user = new User();
		String sql = "SELECT * FROM user WHERE userID = \""+ user_id +"\"";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);){
			//extract data 
			if(rs.next()) {
				String userName = rs.getString("userName");
				String name = rs.getString("Name");
				String address = rs.getString("Address");
				String phoneNumber = rs.getString("phoneNumber");
				LocalDate dateOfBirth = rs.getDate("dateOfBirth").toLocalDate();
				
				user.setUserID(user_id);
				user.setUserName(userName);
				user.setName(name);
				user.setAddress(address);
				user.setPhoneNumber(phoneNumber);
				user.setDateOfBirth(dateOfBirth);
			}				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public static void deleteUser(String userID) {
		String SQLString = "DELETE FROM user WHERE userID = \"" + userID + "\"";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt = connection.createStatement();
		){
			stmt.executeUpdate(SQLString);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
