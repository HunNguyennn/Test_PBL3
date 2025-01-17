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
<title>Search User by UserID</title>
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-12">
				<a class="btn btn-primary" href="http://localhost:8080/MVC/show-user">Add new user</a>
				
				<form class="row mt-2 gy-2 gx-3 align-items-center">
				  <div class="col-auto">
				    <label class="visually-hidden" for="autoSizingInput">Name</label>
				    <input type="text" value="<%= request.getParameter("keyword") %>" name="keyword" class="form-control" id="autoSizingInput" placeholder="Enter Keyword">
				  </div>
				  <div class="col-auto">
				  	<button type="submit" class="btn btn-primary">Search</button>
				  </div>
				</form>
				
				<table class="table">
					<thead>
						<tr>
							<th scope="col">userID </th>
							<th scope="col">roleID</th>
							<th scope="col">userName </th>
							<th scope="col">Name </th>
							<th scope="col">Address</th>
							<th scope="col">phoneNumber</th>
							<th scope="col">dateOfBirth</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<% for(User user: (ArrayList<User>)request.getAttribute("users")) {%>
							<tr>
								<th scope="row">
									<%= user.getUserID() %>
								</th>
								<td><%= user.getRoleID() %></td>
								<td><%= user.getUserName() %></td>
								<td><%= user.getName() %></td>
								<td><%= user.getAddress() %></td>
								<td><%= user.getPhoneNumber() %></td>
								<td><%= user.getDateOfBirth() %></td>
							</tr>
						<% } %> 
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>