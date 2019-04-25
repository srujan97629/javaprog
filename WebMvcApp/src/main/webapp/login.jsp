<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="loginPage.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="loginProcess" modelAttribute="login" method="post">

		<h2  style="color: black">Login</h2>
		<table>
			<tr>
				<td>User Name</td>
				<td>:</td>
				<td><input type="text" name="username" placeholder="User Name"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="pass" placeholder="Password"></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td><a href=""><input type="button" value=" Log In "></a></td>
			</tr>
		</table>
		<br>
		<div id="container" >
			<a href="ForgotPassword.jsp">Forgot Password ?</a>

		</div>
		<br> Don't have account ? <a href="registration.jsp">&nbsp;
			Register</a><br>
			<a href="home.jsp"> Home </a>
	</form>
	<table>

		<tr>

			<td style="font-style: italic; color: red;">${message}</td>

		</tr>

	</table>
</body>
</html>


