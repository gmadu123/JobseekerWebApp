<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Form</title>
	<style>
	table, th, td {
		border: 2px solid black;
	}
	
	th, td {
		padding: 5px;
	}
	
	table {
		align: center;
		width: 40%;
		border-spacing: 2px;
		background-color: #f1f1c1;
	}
	
	table tr:nth-child(even) {
		background-color: #eee;
	}
	
	table tr:nth-child(odd) {
		background-color: #fff;
	}
	
	table th {
		text-align: center;
		color: black;
		background-color: #fff;
	}
	
	p {
		text-align: center;
	}
	
	#errorBox {
		color: #F00;
	}
	
	</style>
</head>

<body>
<p>Thank you for registering. Your details have been saved as below:</p>
	<table align="center">
		<tr>
		    <th>Field</th>
		    <th>Values</th>
		</tr>
		<tr>
			<td><label>First Name</label></td>
			<td><%= request.getParameter("fname") %></td>
		</tr>
		<tr>
			<td><label>Last Name</label></td>
			<td><%= request.getParameter("lname") %></td>
		</tr>
		<tr>
			<td><label>User Name</label></td>
			<td><%= request.getParameter("uname") %></td>
		</tr>
		<tr>
			<td><label>Date of Birth</label></td>
			<td><%= request.getParameter("dob") %></td>
		</tr>
		<tr>
			<td><label>Email</label></td>
			<td><%= request.getParameter("email") %></td>
		</tr>
		<tr>
			<td><label>Telephone</label></td>
			<td><%= request.getParameter("tel") %></td>
		</tr>
		<tr>
			<td><label>Address</label></td>
			<td><%= request.getParameter("addr") %></td>
		</tr>
		<tr>
			<td><label>ZipCode</label></td>
			<td><%= request.getParameter("zip") %></td>
		</tr>
	</table>

</body>
</html>