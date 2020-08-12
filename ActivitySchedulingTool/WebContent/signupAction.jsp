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

String deptname=request.getParameter("department");

try{
	Connection con=dbConnection.getCon();
	PreparedStatement st;
	if(request.getParameter("Role").equals("Admin"))
	{
		st=con.prepareStatement("INSERT INTO userdata(urole,fName,lName,email,password,cpassword,mbl,dept)  SELECT '"+Role+"','"+firstName+"','"+lname+"','"+Email+"','"+password+"','"+cpassword+"','"+mblnumber+"',NULL WHERE NOT EXISTS (Select urole,fName,lName,email,password,cpassword From userdata WHERE urole='"+Role+"' AND fName='"+firstName+"' AND lName='"+lname+"' AND email='"+Email+"' AND password='"+password+"' AND cpassword='"+cpassword+"') LIMIT 1 ");
		st.executeUpdate();
		response.sendRedirect("Login.jsp");
	}
	else if(request.getParameter("Role").equals("Student")){
		System.out.println("else");
		System.out.println(deptname);
		st=con.prepareStatement("INSERT INTO userdata(urole,fName,lName,email,password,cpassword,mbl,dept)  SELECT '"+Role+"','"+firstName+"','"+lname+"','"+Email+"','"+password+"','"+cpassword+"','"+mblnumber+"','"+deptname+"' WHERE NOT EXISTS (Select urole,fName,lName,email,password,dept From userdata WHERE urole='"+Role+"' AND fName='"+firstName+"' AND lName='"+lname+"' AND email='"+Email+"' AND password='"+password+"' AND dept='"+deptname+"') LIMIT 1 ");
		st.executeUpdate();
		response.sendRedirect("Login.jsp");
	}
		
	
}catch(Exception e){
	//out.println("Error"+e.getMessage());
	out.println("Please Input Valid Data!");
	response.sendRedirect("Signuppage.jsp");
}
%>
