<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer</title>
</head>
<body>
		<br><br>
		<tr>
			<a href="addCustomer">Add Customer</a>
		</tr>
		<br><br>
		<tr>
			<a href="display">View Customer</a>			
		</tr>
		<br><br>
	<table border="5">

	<form action="fetchById" method="post">
		Enter Id : <input type="text" name="customerId" /> 
		<input type="submit" value="Fetch Customer"/>
	</form>
		<br><br>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>City,State,Country</th>
		</tr>
			<tr>
				<td>${cust.customerId}</td>
				<td>${cust.customerName}</td>
				<td>${cust.customerAddress}</td>
			</tr>
	</table>
</body>
</html>