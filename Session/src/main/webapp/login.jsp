<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! int i = 99; %>
	<h1>
		Hello JSP
	</h1>
	<p> <%= i %> </p>
	<p> <% out.write("i = " + i); %> </p>
	<% if(i % 2 == 0){
		out.write(i + " chia hết cho 2 "); 
	}else {
		out.write(i + " không chia hết cho 2"); 
	}
	%>
</body>
</html>