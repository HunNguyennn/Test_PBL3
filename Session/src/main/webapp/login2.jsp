<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	//ở đây username với password = null vì ban đầu dùng doGet để truy cập, vì thế không thể kiểm tra username.equals(...)
	if(request.getMethod().equals("POST")){
		if(username.equals("admin") && password.equals("admin")){
			session.setAttribute("username",username);
			response.sendRedirect(request.getContextPath() + "/");	
		}
	}
	
%>



<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Document</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
	

</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
	  	<div class="container">
	    	<a class="navbar-brand" href="#">Navbar</a>
	    	<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      		<span class="navbar-toggler-icon"></span>
	    	</button>
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="#">Home</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="#">Student</a>
	        
	        <li class="nav-item">
	          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
	        </li>
	      </ul>
	      <form class="d-flex" role="search">
	        <input class="form-control me-2" name="keyword" value="keyword" type="search" placeholder="Search" aria-label="Search">
	        <button class="btn btn-outline-success" type="submit">Search</button>
	      </form>
	    </div>
	  </div>
	</nav>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6">
				<h3>Login</h3>
				<form method="POST">
					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">Email address</label>
						<input type="text" name = "username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
						<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Password</label>
						<input type="password" name = "password" class="form-control" id="exampleInputPassword1">
					</div>

					<button type="submit" class="btn btn-success">Login</button>
				</form>
			</div>
		</div>
	</div>
	

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>