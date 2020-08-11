<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<%
String Role=request.getParameter("Role");

String firstName=request.getParameter("First");

String lname=request.getParameter("last");

String Email=request.getParameter("email");

String password=request.getParameter("pass");

String cpassword=request.getParameter("cpass");

String mblnumber=request.getParameter("mbl");

String deptname=request.getParameter("dept");

try{
	Connection con=dbConnection.getCon();
	PreparedStatement st;
	if(Role=="Admin")
	{	System.out.println("hello");
		st=con.prepareStatement("INSERT INTO userdata(urole,fName,lName,email,password,cpassword,mbl,dept) values('"+Role+"','"+firstName+"','"+lname+"','"+Email+"','"+password+"','"+cpassword+"','"+mblnumber+"',NULL)");
	}else{
		System.out.println(deptname);
		st=con.prepareStatement("INSERT INTO userdata(urole,fName,lName,email,password,cpassword,mbl,dept) values('"+Role+"','"+firstName+"','"+lname+"','"+Email+"','"+password+"','"+cpassword+"','"+mblnumber+"','"+deptname+"')");
	}
		st.executeUpdate();
	response.sendRedirect("Login.jsp");
}catch(Exception e){
	//out.println("Error"+e.getMessage());
	out.println("Please Input Valid Data!");
	response.sendRedirect("Signuppage.jsp");
}
%>
