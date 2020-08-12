<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<%
String Iname = request.getParameter("InstructorName");
String Id = request.getParameter("InstructorId");
try{
	
	Connection con=dbConnection.getCon();
	PreparedStatement st;
	st=con.prepareStatement("INSERT INTO faculty(Iname,Inum) SELECT '"+Iname+"','"+Id+"' Where NOT EXISTS(SELECT Iname from faculty where Iname='"+Iname+"')LIMIT 1");
	int x=st.executeUpdate();
	if(x>0){
		response.sendRedirect("Admin.jsp");
	}
	else{
		response.sendRedirect("AddInstr.jsp");
	}
	
}catch(Exception e){
	//e.printStackTrace();
	response.sendRedirect("AddInstr.jsp");
}
%>