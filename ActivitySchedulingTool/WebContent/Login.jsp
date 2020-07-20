<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
 <section id="header">
        
        <nav>
            <div class="brand">
                <h1><span>S</span>chedule<span>G</span>enerator</h1>
            </div>
        </nav>
       </section>
        <div class="main">
         <h1>LOG IN</h1>
           <div class="dropHolder">
             <p>Select</p>
               <div class="dropdown">
                <p>Role</p>
                </div>
              <ul class="menu">
                 <li class="role">Role</li>
                 <li><i class="fa fa-star"></i> Admin</li>
                 <li><i class="fa fa-heart"></i> Student</li>
              </ul>
          </div>
    <form action="validation.php" method="POST">
       
        <input type="text" name="userName" placeholder="USER NAME">
        <input type="password" name="Password" placeholder="PASSWORD">
        <input type="submit" value="LOGIN">
         <p class="message"> Does'nt have account? <a href="./signup.html">Signup</a></p>
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