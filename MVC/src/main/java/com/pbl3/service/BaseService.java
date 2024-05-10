package com.pbl3.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseService {
	static final String DB_URL = "jdbc:mysql://localhost:3306/qlnc?useSSL=false";
	static final String USER = "root";
	static final String PASS = "";
	
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
		return connection;
	}
}
