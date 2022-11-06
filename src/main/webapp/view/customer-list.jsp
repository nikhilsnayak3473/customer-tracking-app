<%@page import="com.nikhilsnayak3473.customer_tracking_app.dto.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>
	<h1>Customer Tracker</h1>
	<div id="container">
		<button onclick="window.location.href='register'; return false;">Add
			Customer</button>
		<br> <br>
		<%
		List<Customer> customers = (List<Customer>) request.getAttribute("customers");
		%>

		<%
		if (customers != null && customers.size() != 0) {
		%>
		<table border="1">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="customer" items="${customers}">

					<c:url var="updateLink" value="/update">
						<c:param name="id" value="${customer.id}" />
					</c:url>
					<c:url var="deleteLink" value="/delete">
						<c:param name="id" value="${customer.id}" />
					</c:url>

					<tr>
						<td>${customer.firstName }</td>
						<td>${customer.lastName }</td>
						<td>${customer.email }</td>
						<td><a href="${ updateLink }">Update</a> | <a onclick="if(!(confirm('Are you sure you want to delete this Customer?'))) return false"
							href="${ deleteLink }">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<%
		}
		%>
	</div>
</body>
</html>