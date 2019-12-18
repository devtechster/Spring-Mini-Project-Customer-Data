<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Adding</title>
</head>
<body>
	<form action="saveCustomer" method="post">
		Id		: <input type="text" name="customerId" /> <br/> 
		Name	: <input type="text" name="customerName"/> <br/>
		City	: <input type="text" name="city"/> <br/>
		State	: <input type="text" name="state"/> <br/>
		Country	: <input type="text" name="country"/> 
		<br><br>
		<input type="submit" value="Add Customer" />
	</form>
	<br><br>
	<a href="display">View Customer</a>
	
</body>
</html>