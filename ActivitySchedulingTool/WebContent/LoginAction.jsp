<%
String userName = request.getParameter("userName");
String password = request.getParameter("Password");

if(userName.equalsIgnoreCase("Admin")&& password.equalsIgnoreCase("Admin")){
	response.sendRedirect("Admin.jsp");
}
else{
	response.sendRedirect("ErrorLogin.html");
}
%>