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

import com.pbl3.model.Product;
import com.pbl3.model.User;

public class ProductService extends BaseService{
	public static ArrayList<Product> query(String keywordString){
		String sql = "SELECT * FROM product";
		ArrayList<Product> products = new ArrayList<Product>();
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String productID = rs.getString("productID");
				String productName = rs.getString("productName");
				String Category = rs.getString("Category");
				String productVariant = rs.getString("productVariant");
				int stringNumber = rs.getInt("stringNumber");
				int keyNumber = rs.getInt("keyNumber"); 
				String Brand = rs.getString("Brand");
				double Price = rs.getDouble("Price");
				int Quantity = rs.getInt("Quantity");
				String Description = rs.getString("Description");
				Product product = new Product(productID,productName, Category, productVariant, stringNumber, keyNumber, Brand, Price, Quantity, Description); 
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
	
	public static ArrayList<Product> searchProductByName(String keyword){
		String sql = "SELECT * FROM product WHERE productName like \"%"+ keyword +"\""
					+"OR Category like \"%" + keyword +"\""
					+"OR Brand like \"%" + keyword +"\"";
		ArrayList<Product> products = new ArrayList<Product>();
		try {
			Connection connection = getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String productID = rs.getString("productID");
				String productName = rs.getString("productName");
				String Category = rs.getString("Category");
				String productVariant = rs.getString("productVariant");
				int stringNumber = rs.getInt("stringNumber");
				int keyNumber = rs.getInt("keyNumber"); 
				String Brand = rs.getString("Brand");
				double Price = rs.getDouble("Price");
				int Quantity = rs.getInt("Quantity");
				String Description = rs.getString("Description");
				Product product = new Product(productID,productName, Category, productVariant, stringNumber, keyNumber, Brand, Price, Quantity, Description); 
				products.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
	
	public static ArrayList<Product> all(){
		return query("");
	}
	public static void addProduct(Product product) {
		String sql = "INSERT product(productName,Category,productVariant,stringNumber,keyNumber,Brand,Price,Quantity,Description) VALUES (?,?,?,?,?,?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
				PreparedStatement pstmt = connection.prepareStatement(sql);
		){
			pstmt.setString(1, product.getProductName());
			pstmt.setString(2, product.getCategory());
			pstmt.setString(3, product.getProductVariant());
			pstmt.setInt(4, product.getStringNumber());
			pstmt.setInt(5, product.getKeyNumber());
			pstmt.setString(6, product.getBrand());
			pstmt.setDouble(7, product.getPrice());
			pstmt.setInt(8, product.getQuantity());
			pstmt.setString(9, product.getDescription());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	
	public static void editProduct(Product product) {
		String SQLString = "UPDATE product SET productName = ?,Category = ?,productVariant = ?,stringNumber = ?,keyNumber = ?,Brand = ?,Price = ?,Quantity = ?,Description = ? WHERE productID = \""+ product.getProductID()+ "\"" ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
				PreparedStatement pstmt = connection.prepareStatement(SQLString);
		){
			pstmt.setString(1, product.getProductName());
			pstmt.setString(2, product.getCategory());
			pstmt.setString(3, product.getProductVariant());
			pstmt.setInt(4, product.getStringNumber());
			pstmt.setInt(5, product.getKeyNumber());
			pstmt.setString(6, product.getBrand());
			pstmt.setDouble(7, product.getPrice());
			pstmt.setInt(8, product.getQuantity());
			pstmt.setString(9, product.getDescription());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void deleteProduct(Product product) {
		String SQLString = "DELETE FROM product WHERE productID = \""+product.getProductID()+"\"";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
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
