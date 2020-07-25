<%@page import = "com.za.ga.cs.connectionProvider.dbConnection" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "javax.sql.*" %>
<%
String firstname = request.getParameter("userName");
session.putValue("username",firstname);
String password = request.getParameter("Password");
String Role=request.getParameter("role");
try{
	Connection con=dbConnection.getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from userdata where firstname='"+firstname+"'");
			if(rs.next()){
				if(rs.getString(5).equals(password)){
					if(rs.getString(8).equals(Role)){
					response.sendRedirect("Admin.jsp");
				}}
				else{
					out.println("invalid Password! try Again.");
				}
			}			
	
}catch(Exception e){
	out.println(e);
}
%>