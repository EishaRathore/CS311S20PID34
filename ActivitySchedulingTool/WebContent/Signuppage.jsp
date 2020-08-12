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
     
        <input id= "role" type="text"  name="Role" onkeyup='dept();' placeholder="Role (Admin or Student)" pattern="^(Admin|Student)$"
            title="Enter Admin or Student!" >
        <input type="text"  name="First" placeholder="First Name" pattern="^[A-Za-z]+$"
            title="Please Enter only alphabets" required>
        <input type="text" name="last" placeholder="Last Name" pattern="^[A-Za-z]+$"
            title="Please Enter only alphabets" required>
        <input type="text" name="email" placeholder="Email ID" required pattern="[a-z0-9._%+-]+@[a-z0-9._]+\.[a-z]{2,4}$" title="Must start with small letter and have format like example@gmail.com">
        <input type="password" id="password" name="pass" placeholder="Password" onkeyup='check();' pattern=".{8,}" title="Eight or more characters" required>
        <input type="password" id="confirm_password" name="cpass" onkeyup='check();' placeholder="Confirm Password" required>
        <span id='message' style=font-size:14pt></span>
        <input type="tel" name="mbl" placeholder="Phone Number" pattern="^(03)([0-9]{9})$"
            title="Enter eleven digit number starting with specific number 03" required>
        <input id="department"  type="text" style="visibility:hidden" name="department" placeholder="Department Name" >    
        <button type="submit" id="submit" class="submit" href="#" disabled>Submit</button>
        <p class="message">Already have account? <a id="login" href="Login.jsp">Login</a></p>
    </form>

   </div>
   </section>
   <div id="overlyArea">

   </div>
</body>
</html>