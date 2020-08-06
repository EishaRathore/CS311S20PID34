<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
    
	<%
        	  try{
        		  String Mtime2 = request.getParameter("TimeID");
        		  String Mtime = request.getParameter("ClassTime1");
        		  String Mtime1 = request.getParameter("ClassTime2");
        		  String name=  request.getParameter("str");
        		  
        	  	Connection con=dbConnection.getCon();
        	  	PreparedStatement st;
       	  	st=con.prepareStatement("INSERT INTO meetingtime(meetingID,meeting_time) values('"+Mtime2+"',CONCAT('"+Mtime+"',' - ','"+Mtime1+"'))");
        	  	int x=st.executeUpdate();
        	  	if(x>0){
        	  		response.sendRedirect("Admin.jsp");
        	  	}
        	  	else{
        	  		response.sendRedirect("AddTime.html");
        	  	}
        	  	
        	  }catch(Exception e){
        	  //	e.printStackTrace();
        	  	//out.println("Error"+e.getMessage());
        	  	response.sendRedirect("AddTime.html");
        	  }
 %>
