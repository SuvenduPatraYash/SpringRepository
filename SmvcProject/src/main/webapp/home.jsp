<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<div class="header">
  <img src="../img/logo.jpg" alt="logo" />
  <h1>MY OWN BANK</h1>
</div>
<style>
.header img {
  float: left;
  width: 100px;
  height: 100px;
  background: #555;
}

.header h1 {
  position: relative;
  top: 18px;
  left: 10px;
}

body {
	background-color: linen;
}

.center {
	padding: 100px 0;
	border: 3px solid green;
	background-color: #FFFDED;;
}

button {
	border: none;
	border-radius: 15px;
	box-shadow: 0 0 8px rgb(207, 207, 207);
}

button:hover {
	border: none;
	padding: 15px;
	border-radius: 15px;
	box-shadow: inset 0 0 8px #f9f8fc;
}

.button-os {
	position: relative;
	width: 200px;
	height: 65px;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	margin: auto;
	background-color: #f9f8fc;
	border: 2.5px solid #0e172c;
	transition: background-color 2.2s;
	transition-duration: 3s;
	transition: 1.5s;
}

.button-os:hover {
	position: relative;
	top: 30px;
	background-color: #fec7d7;
}

.button-os a {
	font-size: 20px;
	display: block;
	text-decoration: none;
	color: #0e172c;
	transition: 1.5s;
}

.button-os a:hover {
	letter-spacing: 5px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>

</head>

<body>
	<div class="center">
		<div class="row mb-4 px-3" align="center">
			<small class="font-weight-bold">You have an account !!</small>
			<button id="foot">
				<button class="button-os" align="left">
					<a class="text-danger" href="login">Login Here</a>
				</button>
			</button>
			<small class="font-weight-bold">Don't have an account?</small>
			<button id="foot">
				<button class="button-os" align="right">
					<a class="text-danger" href="register">Register Here</a>
				</button>
			</button>

		</div>
	</div>
	<div class="bg-blue py-4">
		<div class="row px-3">
			<small class="ml-4 ml-sm-5 mb-2">Copyright &copy; 2022. All
				rights reserved.</small>

		</div>
</body>

</html>