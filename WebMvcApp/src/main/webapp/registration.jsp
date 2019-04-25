<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link href="register.css" rel="stylesheet" type="text/css">
</head>
<body >
	<div class="register">
		<form action="registerProcess" modelAttribute="user" method="post">

			<h2 style="color: black">Registration</h2>
			<table>
				<tr>
					<td>First Name</td>
					<td>:</td>
					<td><input type="text" name="firstname"
						placeholder="First Name"></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td>:</td>
					<td><input type="text" name="lastname" placeholder="Last Name"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>:</td>
					<td><input type="radio" name="gender" value="Male">Male
						&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="gender"
						value="Female"> Female</td>
				</tr>
				<tr>
					<td>Mobile Number</td>
					<td>:</td>
					<td><input type="text" name="mobilenumber"
						placeholder="Mobile Number"></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td>:</td>
					<td><input type="text" name="username" placeholder="User Name"></td>
				</tr>
				<tr>
					<td>E-Mail Id</td>
					<td>:</td>
					<td><input type="text" name="emailid" placeholder="E-Mail Id"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="pass" placeholder="Password"></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td><a href=""><input type="button" value=" Register"></a></td>
				</tr>
			</table>
			<br>

			<div id="container">
				Already Registered ?<a href="login.jsp"> Login </a><br>
				<a href="home.jsp"> Home </a>

			</div>

		</form>
	</div>
</body>
</html>