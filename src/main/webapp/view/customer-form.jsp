<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Tracker</title>
</head>
<body>
	<h1>Customer Form</h1>
	<form:form action="save" method="POST" modelAttribute="customer" >
	
		<form:hidden path="id" />
		<table>
			<tbody>
				<tr>
					<td><label>First Name:</label></td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><label>Last Name:</label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><label>Email:</label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td>
						<form:button>SUBMIT</form:button>
					</td>
				</tr>
			</tbody>
		</table>
	</form:form>

	<a href="${ pageContext.request.contextPath }/customer-list">Back to List</a>
</body>
</html>