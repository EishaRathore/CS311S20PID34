<%@ page import = "com.za.ga.cs.connectionProvider.dbConnection" %>
<%@ page import = "java.sql.*" %>
<%
String role=request.getParameter("role");
String firstname=request.getParameter("FirstName");
String lname=request.getParameter("lastName");
String Email=request.getParameter("email");
String password=request.getParameter("pass");
String cpassword=request.getParameter("pass");
String mblnumber=request.getParameter("mblno");

try{
	Connection con=dbConnection.getCon();
	Statement st=con.createStatement();
	st.executeUpdate("insert into userdata (role,firstname,lastname,email,pass,cpass,mblnum) values('"+role+"','"+firstname+"','"+lname+"','"+Email+"','"+password+"','"+cpassword+"','"+mblnumber+"')");
	response.sendRedirect("Login.html");
}catch(Exception e){
	out.println(e);
}
%>
