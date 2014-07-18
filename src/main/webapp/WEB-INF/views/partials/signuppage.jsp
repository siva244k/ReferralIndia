<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup</title>
<style type="text/css">

#uservailability
{

color: red;
}

</style>
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




<script>
	function registerAjax() {
		$.ajax({
			type : "POST",
			url : "signup",
			data : $("#signupdata").serialize(),
			success : function(result) {
				
				
				$("#registered").text(result)
			},
			error : function(e) {
				$("#registered").text("not registered")
			}
		});

	}
</script>
</head>
<body>
	<center>
		<h1 >Signup</h1>

		<form method="POST" action="signup" id="signupdata">
			<table>

				<tr>
					<td>USERNAME:</td>
					<td><input type="text" name="username" onkeyup="uniqueName()" /></td>
					<td><div id="uservailability" >
					
					</div></td>
				</tr>


				<tr>
					<td>PASSWORD:</td>
					<td><input type="password" name="password" /></td>
					<td></td>
				</tr>


				<tr>
					<td>FIRSTNAME:</td>
					<td><input type="text" name="firstName" /></td>
					<td></td>
				</tr>

				<tr>
					<td>LASTNAME:</td>
					<td><input type="text" name="lastName" /></td>
					<td></td>
				</tr>

				<tr>
					<td>PEREMAIL:</td>
					<td><input type="text" name="peremail" /></td>
					<td></td>
				</tr>

				<tr>
					<td>OMAIL:</td>
					<td><input type="text" name="ogrEmail" /></td>
					<td></td>
				</tr>


				<tr>
					<td></td>
					<td><input type="button" value="Signup" onclick="registerAjax()"></td>
					<td></td>
				</tr>
			</table>
		</form>

		<div id="registered"></div>
	</center>

</body>
</html>