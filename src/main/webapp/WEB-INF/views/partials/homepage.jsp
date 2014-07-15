<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Homepage</title>
</head>
<body>
	<h2>User Principal</h2>
	<table>
		<tr>
			<td>username:</td>
			<td>${user.username}</td>
		</tr>
		<tr>
			<td>firstname:</td>
			<td>${user.firstName}</td>
		</tr>
		<tr>
			<td>lastname:</td>
			<td>${user.lastName}</td>
		</tr>
		<tr>
			<td>permemail:</td>
			<td>${user.perEmail}</td>
		</tr>
		<tr>
			<td>orgemail:</td>
			<td>${user.orgEmail}</td>
		</tr>
	</table>

	<center>



		<h3>
			<a href="post">POST A JOB</a>
		</h3>
	</center>
</body>
</html>