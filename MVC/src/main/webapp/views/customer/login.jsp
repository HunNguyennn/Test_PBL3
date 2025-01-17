<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="icon" type="image/x-icon"
		href="https://scontent.fsgn2-3.fna.fbcdn.net/v/t39.30808-6/321998401_540730578207305_7283713536861378154_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeH7GR0GnV3s4pAvtEb1PP0VV88nLZnwKVVXzyctmfApVQlmsrtig1LlBfhZeJBrUVUOzvC5TjU5su2s2pPvxrU-&_nc_ohc=tk4oKJGTeJ0AX9FHgLL&_nc_ht=scontent.fsgn2-3.fna&oh=00_AfDUZFa0J85ainPL4E6ibIFONJx-v-KSwUmxEOPu69agpg&oe=6603709B">
	<title>Login</title>

	<!-- font -->
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link
		href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
		rel="stylesheet">

	<!-- icon -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"
		integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA=="
		crossorigin="anonymous" referrerpolicy="no-referrer" />

 	<link rel="stylesheet" href="<c:url value="/assets/css/login.css"/>">
    

</head>

<body>
	<div class="login-container">
	<!--<img class="item1" src="svgfile\svgfile\camcong.svg" alt="">
        <img class="item2" src="svgfile\svgfile\bluecong.svg" alt="">
        <img class="item3" src="svgfile\svgfile\tron.svg" alt="">
        <div class="container">
            <div class="img-container">
                <div class="s-img">
                    <img class="background" src="svgfile\svgfile\GroupBackground.png" alt="">
                    <img class="item4" src="./svgfile\svgfile\Vector.png" alt="">
                    <img class="item5" src="./svgfile\svgfile\Vector1.png" alt="">
                    <img class="item6" src="./svgfile\svgfile\logo.svg" alt="">
                    <div class="layoutLogin"></div>
                </div>
            </div> -->

		<div class="content-container">
			<div class="content">
				<div class="header">
					<div class="login-button">
						<button id="Login" class="login1">Login</button>
					</div>
					<div class="register-button">
						<button id="Register" class="register1" onclick="regis()">Register</button>
					</div>
				</div>
				<div class="login-form">
					<div class="input">
						<span>Email</span>
						<br>
						<input id="username" type="text" placeholder="Enter your email">
						<p class="email_error"></p>
					</div>

					<div class="password-input">
						<div class="input">
							<span>Password</span>
							<br>
							<input id="password" type="text" placeholder="Enter your password">
							<p class="password_error"></p>
						</div>

					</div>
					
					<button id="Login-button">Login</button>
				</div>
				<!-- <div class="regis-form">
					<div class="input">
						<span>Email</span>
						<br>
						<input id="username" type="text" placeholder="Enter your email">
						<p class="email_error"></p>
					</div>

					<div class="password-input">
						<div class="input">
							<span>Password</span>
							<br>
							<input id="password" type="text" placeholder="Enter your password">
							<p class="password_error"></p>
						</div>
					</div>
					<div class="password-verify">
						<div class="input">
							<span>Confirm Your Password</span>
							<br>
							<input id="password" type="text" placeholder="Repeat your password">
							<p class="password_error"></p>
						</div>
					</div>
				</div> -->
			</div>
		</div>
	</div>
<%-- 		<script src="<c:url value="/assets/js/login.js"/>"> --%>

<!-- 		</script> -->

</body>
	<script type="text/javascript" src="<c:url value="/assets/js/login.js"/>"></script>
</html>