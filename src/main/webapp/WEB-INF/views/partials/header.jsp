<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>
#logout {
	position: absolute;
	top: 20px;
	right: 20px;
}

#userprinciple
{
position: absolute;
	top: 20px;
	left: 20px;
}
</style>
</head>
<body>


	<div id="userprinciple">
		Hello <b><c:out value="${pageContext.request.remoteUser}" /></b> !
	
	</div>
	
	<div id="logout">
	
		<form action="logout" method="POST">



			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" /> <input type="submit" value="Logout" name="Logout" />
		</form>
	</div>
</body>
</html>