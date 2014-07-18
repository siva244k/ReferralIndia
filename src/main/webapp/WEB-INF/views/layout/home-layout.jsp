<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html lang="en">
<head>
<style>
body {
	background-color: lightgray;
}

</style>

</head>
<body>
	<table border="1">
		<tr>
			<td height="30" colspan="2"><tiles:insertAttribute name="header" />
			</td>
		</tr>
		<tr>
			<td width="200"  height="550"><tiles:insertAttribute name="menu" /></td>
			<td width="1300"><tiles:insertAttribute name="body" /></td>
			
		</tr>
		<tr>
			<td height="30" colspan="2"><tiles:insertAttribute name="footer" />
			</td>
		</tr>
	</table>
</body>
</html>
