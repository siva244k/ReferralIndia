<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ReferralIndia</title>
<style>
#login {
	position: absolute;
	right:10px;
	border-style: ridge;
	
	
}
p{
position: absolute;
color:red;
	top:15px;
	right:3px;
	
}
</style>
</head>
<body>

	<div id="login">
		<c:url value="/login" var="loginUrl" />
		<form action="${loginUrl}" method="post">
			<c:if test="${param.error != null}">
				<p>Invalid username and password.</p>
			</c:if>
			<c:if test="${param.logout != null}">
				<p>You have been logged out.</p>
			</c:if>

			<label for="username">Username</label> <input type="text"
				id="username" name="username" /> <label for="password">Password</label>
			<input type="password" id="password" name="password" /> <input
				type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<button type="submit" class="btn">Log in</button>
		</form>
	</div>
</body>
</html>