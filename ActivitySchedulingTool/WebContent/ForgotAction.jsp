<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<%
String uemail = request.getParameter("Email");
String pass = request.getParameter("pass");
String Cpass = request.getParameter("cpass");
try{
	Connection con=dbConnection.getCon();
	PreparedStatement st;
	
	st=con.prepareStatement("UPDATE userdata SET password = '"+pass+"', cpassword = '"+Cpass+"' WHERE email='"+uemail+"'");
	
	int x=st.executeUpdate();
	if(x>0){
		
		out.println("not changed!");
	}
	else{
		out.println("not changed!");
	}
	
}catch(Exception e){
	e.printStackTrace();
	out.println("Error"+e.getMessage());
}
%>
