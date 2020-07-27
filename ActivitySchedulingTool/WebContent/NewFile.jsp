<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
    <%@page import = "com.za.ga.cs.connectionProvider.dbConnection" %>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>LogIn</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="style.css">
    <script src="jQuery.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> 
</head>
<body onload="check()">
   <%
      try{
	Connection con=dbConnection.getCon();
	Statement st=con.createStatement();
	ResultSet rs=null;
	rs=st.executeQuery("select * from userdata");
	
}catch(Exception e){
	//e.printStackTrace();
	//out.println("Error"+e.getMessage());
} %>
      <section id="header">
   
<tr> 
    <td> 
        Student Major  : <select name ="Major">
        <%while(rs.next()){ %>
        <option value="<%= rs.getString(8)%>"><%= rs.getString(8)%></option>
                        <%}%>           
                         </select> 
   </td> 
        <nav>
            <div class="brand">
                <h1><span>S</span>chedule<span>G</span>enerator</h1>
            </div>
        </nav>
       </section>
        <div class="main">
         <h1>LOG IN</h1>
         <select name="role" class="dropHolder">           
               <div class="dropdown">

                </div>
              <div class="menu">
                 <option value="1">Admin</option>
                 <option value="2">Student</option>
                <!-- <li><i class="fa fa-star"></i> Admin</li> -->
                <!-- <li><i class="fa fa-heart"></i> Student</li>  -->
              </div>
              </select>
              
    <form action="LoginAction.jsp" method="POST">
       
        <input type="text" name="userName" placeholder="USER NAME">
        <input type="password" name="Password" placeholder="PASSWORD">
        <input type="submit" value="LOGIN">
         <p class="message"> Does'nt have account? <a href="SignUp.jsp">Signup</a></p>
      </form>
    <div class="bottomText">
        <a href="forgot.html">Forgot Password? </a>
    </div>
    <div class="Socials">
        <a href="#"><i class="fa fa-facebook"></i></a>
        <a href="#"><i class="fa fa-twitter"></i></a>
        <a href="#"> <i class="fa fa-google"></i></a>
     </div>
        </div>
    
       <script src="https://code.jquery.com/jquery-3.5.1.min.js">
      </script>
    
        <div id="overlyArea">
    
     </div>
</body>
</html>