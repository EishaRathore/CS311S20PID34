<%@page import = "com.za.ga.cs.connectionProvider.dbConnection" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "javax.sql.*" %>
<%
String username = request.getParameter("userName");
session.putValue("username",username);
String password = request.getParameter("Password");
out.println(password);
//String role = request.getParameter("Role");
//out.println(role);
//String role1 = request.getParameter("role");
//out.println(role1);
try{
	Connection con=dbConnection.getCon();
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from userdata where fName='"+username+"'");
			if(rs.next()){
				if(rs.getString(5).equals(password)){
					//if(rs.getString(8).equals(role)){
						response.sendRedirect("Admin.jsp");
						}
					else{
						
						response.sendRedirect("ErrorLogin.html");
					}
					
				}//else{
					//response.sendRedirect("ErrorLogin.html");
				//}
			//}		
	
}catch(Exception e){
	out.println("Error"+e.getMessage());
}
%>