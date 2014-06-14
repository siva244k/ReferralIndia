<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ReferralIndia</title>
<style>
#login{
position:top:40px;

}


</style>
</head>
<body>


	<div id="login">
		<form id="loginform" action="login" method="POST">
			<table>
				<tr>
					<td>USERNAME:</td>
					<td><input type="text" name="username"></td>
					<td>PASSWORD:</td>
					<td><input type="password" name="password"></td>
					<td><input type="submit" value="login"></td>
				</tr>


			</table>
		</form>
	</div>
	<div id="signup">
		<p>
			<a href="signup">Singup</a>
		</p>
	</div>
</body>
</html>