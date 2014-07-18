<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html lang="en">
<head>
<style type="text/css">
body {
	background-color: lightgray;
}
</style>

</head>
<body>
	<table>
		<tr>
			<td height="100" colspan="3"><tiles:insertAttribute
					name="header" /></td>
		</tr>

		<tr>
			<td width="60%"></td>
			<td width="10%"><tiles:insertAttribute name="body" /></td>
			<td height="500"></td>
		</tr>

		<tr>
			<td height="30" colspan="3"><tiles:insertAttribute name="footer" />
			</td>
		</tr>
	</table>
</body>
</html>
