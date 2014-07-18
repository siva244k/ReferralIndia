
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!--  -->
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

