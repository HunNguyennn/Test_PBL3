<%@page import="com.pbl3.model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "com.pbl3.model.User" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>Search Product</title>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-12">
<!-- 				<a class="btn btn-primary" href="http://localhost:8080/MVC/show-user">Add new product</a> -->
				
<!-- 				<form class="row mt-2 gy-2 gx-3 align-items-center"> -->
<!-- 				  <div class="col-auto"> -->
<!-- 				    <label class="visually-hidden" for="autoSizingInput">Name</label> -->
<%-- 				    <input type="text" value="<%= request.getParameter("keyword") %>" name="keyword" class="form-control" id="autoSizingInput" placeholder="Enter Keyword"> --%>
<!-- 				  </div> -->
<!-- 				  <div class="col-auto"> -->
<!-- 				  	<button type="submit" class="btn btn-primary">Search</button> -->
<!-- 				  </div> -->
<!-- 				</form> -->
				
				<table class="table">
					<thead>
						<tr>
							<th scope="col">productID </th>
							<th scope="col">productName</th>
							<th scope="col">Category</th>
							<th scope="col">Variant</th>
							<th scope="col">Brand</th>
							<th scope="col">Price</th>
							<th scope="col">Quantity</th>
							<th scope="col">Description</th>
						</tr>
					</thead>
					<tbody>
						<% for(Product product: (ArrayList<Product>)request.getAttribute("products")) {%>
							<tr>
								<th scope="row">
									<%= product.getProductID() %>
								</th>
								<td><%= product.getProductName() %></td>
								<td><%= product.getCategory() %></td>
								<td><%= product.getProductVariant()%></td>
<%-- 								<%if(product.getStringNumber() > 0){ %> --%>
<%-- 									<td><%= product.getStringNumber()%></td>	 --%>
<%-- 								<% } else { %> --%>
<%-- 									<td><%= product.getKeyNumber()%></td> --%>
<%-- 								<% } %> --%>
								<td><%= product.getBrand() %></td>
								<td><%= product.getPrice() %></td>
								<td><%= product.getQuantity()%></td>
								<td><%= product.getDescription()%></td>
							</tr>
						<% } %> 
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>