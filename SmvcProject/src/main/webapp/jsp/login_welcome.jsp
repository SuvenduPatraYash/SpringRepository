<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Database</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: linen">
			<div>
				<h1> Bank Employee Database</h1>
			</div>


		</nav>
	</header>
	<br>

	<div class="row">


		<div class="container">
			<h3 class="text-center">List of Employees</h3>
			<hr>
			<div class="text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New Employee</a>
				<div class="text-right">
					<a href="<%=request.getContextPath()%>/truncate"
						class="btn btn-success">Truncate Table</a>
				</div>
			</div>

			<br>
			<table class="table table-bordered" style="border: 1px solid">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Country</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${listUser}">

						<tr>
							<td><c:out value="${user.id}" /></td>
							<td><c:out value="${user.name}" /></td>
							<td><c:out value="${user.email}" /></td>
							<td><c:out value="${user.country}" /></td>
							<td><a href="edit?id=<c:out value='${user.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
						</tr>

					</c:forEach>

				</tbody>

			</table>
		</div>
	</div>
</body>
</html>