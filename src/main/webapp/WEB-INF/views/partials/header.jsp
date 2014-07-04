<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
#userprinciple{

position: absolute;
top:20px;
right: 50px;
}
</style>
</head>
<body>
	<center>
		<h1>Referral India</h1>
	</center>
	
	<div id="userprinciple">
	Hello
	<b><c:out value="${pageContext.request.remoteUser}" /></b> you are  logged in !
	<form action="logout" method="post">

		<input type="submit" value="Logout" /> 
		
		<input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" />

	</form>
	</div>
</body>
</html>