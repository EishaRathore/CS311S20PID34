<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<%
String Mtime = request.getParameter("ClassTime");
try{
	Connection con=dbConnection.getCon();
	PreparedStatement st;
	st=con.prepareStatement("INSERT INTO meetingtime(meeting_time) values('"+Mtime+"')");
	int x=st.executeUpdate();
	if(x>0){
		response.sendRedirect("Admin.jsp");
	}
	else{
		response.sendRedirect("AddTime.jsp");
	}
	
}catch(Exception e){
//	e.printStackTrace();
	//out.println("Error"+e.getMessage());
	response.sendRedirect("AddTime.jsp");
}
%>