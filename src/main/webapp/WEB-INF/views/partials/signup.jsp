<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup</title>
<script src="resources/js/jquery-2.1.1.min.js"></script>

<script>
	function uniqueName() {
		$.ajax({
			type : "POST",
			url : "useridcheck",
			data : $("#signupdata").serialize(),
			success : function(result) {
				
				$("#uservailability").text(result)
			},
			error : function(e) {
				$("#uservailability").text("not submitted")
			}
		});

	}
</script>
</head>
<body>
	<center>
		<h1>Signup</h1>

		<sf:form method="POST" action="signup" commandName="userBO"
			id="signupdata">
			<table>

				<tr>
					<td>USERNAME:</td>
					<td><sf:input path="userName" onmouseout="uniqueName()" /></td>
					<td><div id="uservailability">
					</div><sf:errors path="userName" /></td>
				</tr>


				<tr>
					<td>PASSWORD:</td>
					<td><sf:input path="password" /></td>
					<td><sf:errors path="password" /></td>
				</tr>


				<tr>
					<td>FIRSTNAME:</td>
					<td><sf:input path="firstName" /></td>
					<td><sf:errors path="firstName" /></td>
				</tr>

				<tr>
					<td>LASTNAME:</td>
					<td><sf:input path="lastName" /></td>
					<td><sf:errors path="lastName" /></td>
				</tr>

				<tr>
					<td>PEREMAIL:</td>
					<td><sf:input path="perEmail" /></td>
					<td><sf:errors path="perEmail" /></td>
				</tr>

				<tr>
					<td>OMAIL:</td>
					<td><sf:input path="ogrEmail" /></td>
					<td><sf:errors path="ogrEmail" /></td>
				</tr>





				<tr>
					<td></td>
					<td><input type="submit" value="Signup"></td>
					<td></td>
				</tr>
			</table>
		</sf:form>

		<div></div>
	</center>

</body>
</html>