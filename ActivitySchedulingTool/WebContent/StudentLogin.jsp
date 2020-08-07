<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="style.css">
    <script src="jQuery.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <title>Student LogIn</title>
</head>
<body onload="check()">
      <section id="header">
        <nav>
            <div class="brand">
                <h1><span>S</span>chedule<span>G</span>enerator</h1>
            </div>
        </nav>
       </section>
        <div class="main">
         <h1>LOG IN</h1>
        
              <input type="text" value="Student" readonly>
    <form action="SLoginAction.jsp" method="POST">
        <input type="text" name="userName" placeholder="USER NAME" required>
        <input type="password" name="Password" placeholder="PASSWORD" required>
        <input type="submit" value="LOGIN">
         <p class="message"> Does'nt have account? <a href="Signuppage.jsp">Signup</a></p>
      </form>
    <div class="bottomText">
        <a href="forgot.html">Forgot Password? </a>
    </div>
  
        </div>
    
        <div id="overlyArea">
    
     </div>
     
</body>
</html>