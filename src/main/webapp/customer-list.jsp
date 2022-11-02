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
		<%
		if (request.getAttribute("customers") != null) {
		%>
		<table border="1">
			<thead>
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="customer" items="${customers}">
					<tr>
						<td>${customer.id }</td>
						<td>${customer.firstName }</td>
						<td>${customer.lastName }</td>
						<td>${customer.email }</td>
						<td><a href="delete?id=${customer.id}">DELETE</a> | <a
							href="update?id=${customer.id}">UPDATE</a></td>
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