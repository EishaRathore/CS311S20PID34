<%@page import = "com.za.ga.cs.connectionProvider.dbConnection" %>
<%@ page import = "java.sql.*" %>
<%
String role=request.getParameter("role");
String firstname=request.getParameter("FirstName");
String lname=request.getParameter("lastName");
String Email=request.getParameter("email");
String password=request.getParameter("pass");
String cpassword=request.getParameter("pass");
String mblnumber=request.getParameter("mblno");

try{
	dbConnection db=new dbConnection();
	out.println("in try");
	Connection con=dbConnection.getCon();
	db.createTable();
	
}catch(Exception e){
	out.println(e);
}
%>
