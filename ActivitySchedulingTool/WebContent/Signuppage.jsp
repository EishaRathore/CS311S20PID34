<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title> Signup Form</title>
<link rel= "stylesheet"  href= "SignUp.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="jQuery.js"></script>
</head>
<body>
 <section id="header">
        
    <nav>
        <div class="brand">
            <h1><span>S</span>chedule<span>G</span>enerator</h1>
          </div>
    </nav>
   </section>
    <section class="SignUp">
 <div class="wrap">
     <h2>Sign Up</h2>
     <form action="signupAction.jsp" method="post">
     
        <input type="text"  name="Role" placeholder="Role (Admin or Student)" required>
        <input type="text"  name="First" placeholder="First Name" required>
        <input type="text" name="last" placeholder="Last Name" required>
        <input type="text" name="email" placeholder="Email ID" required pattern="[a-z0-9._%+-]+@[a-z0-9._]+\.[a-z]{2,4}$">
        <input type="password" name="pass" placeholder="Password" required>
        <input type="password" name="cpass" placeholder="Confirm Password" required>
        <input type="tel" name="mbl" placeholder="Phone Number" required>
        <button type="submit" class="submit" href="#">Submit</button>
        <p class="message">Already have account? <a href="Login.html">Login</a></p>
    </form>

   </div>
   </section>
   <div id="overlyArea">

   </div>
</body>
</html>