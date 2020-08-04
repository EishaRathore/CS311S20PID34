<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<%
String Ccode = request.getParameter("cid");

String Course_name = request.getParameter("id");
String Cid = request.getParameter("Ccode");
String Cmax = request.getParameter("SeatingC");
try{
	Connection con=dbConnection.getCon();
	PreparedStatement st;
  
	st=con.prepareStatement("INSERT INTO course(cid,Cname,code,seating_capacity) values('"+Ccode+"','"+Course_name+"','"+Cid+"','"+Cmax+"')");
	
	int x=st.executeUpdate();
	response.sendRedirect("Admin.jsp");
	
}catch(Exception e){
	//e.printStackTrace();
	out.println("Error"+e.getMessage());
}
%>