<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<%
String Role=request.getParameter("Role");

String firstName=request.getParameter("First");

String lname=request.getParameter("last");

String Email=request.getParameter("email");

String password=request.getParameter("pass");

String cpassword=request.getParameter("cpass");

String mblnumber=request.getParameter("mbl");

try{
	Connection con=dbConnection.getCon();
	PreparedStatement st;
	
	st=con.prepareStatement("INSERT INTO userdata(urole,fName,lName,email,password,cpassword,mbl) values('"+Role+"','"+firstName+"','"+lname+"','"+Email+"','"+password+"','"+cpassword+"','"+mblnumber+"')");
	st.executeUpdate();
	response.sendRedirect("Login.jsp");
}catch(Exception e){
	//out.println("Error"+e.getMessage());
	out.println("Please Input Valid Data!");
	response.sendRedirect("Signuppage.jsp");
}
%>
