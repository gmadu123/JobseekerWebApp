<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Profile JSP</title>
</head>
<body>

<%-- <label>First Name :</label><h3> <font color=red><%= request.getParameter("fname") %></font> </h3>
<br>
<label>Last Name :</label><h3> <font color = blue><%= request.getParameter("lname") %></font></h3>
<br>
<label> Full Name modified by servlet:</label><h3> <font color = green><%= request.getAttribute("firstName")%><%= request.getAttribute("lastName") %></font></h3>
 --%>

<% String name = "NaveenaUppala"; %>
<h3><font color = purple><%=name %></font></h3>

</body>
</html>