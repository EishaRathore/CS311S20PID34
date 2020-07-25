<%@page import = "com.za.ga.cs.connectionProvider.dbConnection" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "javax.sql.*" %>
@SuppressWarnings("deprecation")
<%
String firstname = request.getParameter("userName");
session.putValue("firstname",firstname);
String password = request.getParameter("Password");
try{
	out.println("in try");
	Connection con=dbConnection.getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from userdata where firstname='"+firstname+"'");
			if(rs.next()){
				if(rs.getString(2).equals(password)){
					out.println("Welcome"+firstname);
				}
				else{
					out.println("invalid Password! try Again.");
				}
			}else
				
	response.sendRedirect("Login.html");
}catch(Exception e){
	out.println(e);
}
%>