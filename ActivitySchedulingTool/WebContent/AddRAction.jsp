<%@ page import = "com.za.ga.cs.connectionProvider.dbConnection" %>
<%@ page import = "java.sql.*" %>
<%
String roomNum=request.getParameter("CourseName");
String capacity=request.getParameter("Max#");

try{
	Connection con=dbConnection.getCon();
	Statement st=con.createStatement();
	st.executeUpdate("insert into rooms (room#,capacity) values('"+roomNum+"','"+capacity+"')");
	out.println("Successfully added!");
	
}catch(Exception e){
	out.println(e);
}
%>