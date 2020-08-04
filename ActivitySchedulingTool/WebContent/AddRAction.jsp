<%@ page import = "com.za.ga.cs.connectionProvider.dbConnection" %>
<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%

String capacity=request.getParameter("MaxS");
String room=request.getParameter("RoomNum");
try{
	Connection con=dbConnection.getCon();
	PreparedStatement st;
	st=con.prepareStatement("INSERT INTO rooms(room_no,room_capacity) values('"+room+"','"+capacity+"')");
	int x=st.executeUpdate();
	if(x>0){
		response.sendRedirect("Admin.jsp");
	}
	else{
		response.sendRedirect("AddRoom.html");
	}
	
}catch(Exception e){
	//e.printStackTrace();
//	out.println("Error"+e.getMessage());
	response.sendRedirect("AddRoom.html");
}
%>