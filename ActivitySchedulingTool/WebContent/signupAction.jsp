<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registerjsp</title>
</head>
<body>
<%@ page import = "java.sql.*" %>
<%@ page import = "javax.sql.*" %>
<%
String firstname=request.getParameter("FirstName");
session.putValue("FirstName",firstname);
String lname=request.getParameter("lastName");
String Email=request.getParameter("email");
String password=request.getParameter("pass");
String cpassword=request.getParameter("pass");
String mblnumber=request.getParameter("mblno");
Class.forName("com.mysql.jdbc.Driver");

%>
</body>
</html>