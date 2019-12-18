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

	<table border="5">
		<tr>
			<a href="addCustomer">Add Customer</a>
		</tr>
		<br><br>
		<tr>
			<a href="fetchCustomer">Customer By Id</a>			
		</tr>
		<br><br>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>City,State,Country</th>
			<th>Delete Action</th>
		</tr>
		<c:forEach items="${allCustomerList}" var="e">
			<tr>
				<td>${e.customerId}</td>
				<td>${e.customerName}</td>
				<td>${e.customerAddress}</td>
				<td>
					<a  href="deleteCustomer?customerId=${e.customerId}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>