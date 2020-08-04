<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<%
String Ccode = request.getParameter("CourseCode");
String Course_name = request.getParameter("name");
String Cmax = request.getParameter("Max");
String Cid = request.getParameter("cid");
try{
	Connection con=dbConnection.getCon();
	PreparedStatement st;
  
	st=con.prepareStatement("INSERT INTO course(cid,Cname,code,seating_capacity) values('"+Cid+"','"+Course_name+"','"+Ccode+"','"+Cmax+"')");
	
	int x=st.executeUpdate();
	if(x>0){
		out.println("Added successfuly!");
	}
	else{
		out.println("not added!");
	}
	
}catch(Exception e){
	e.printStackTrace();
	out.println("Error"+e.getMessage());
}
%>