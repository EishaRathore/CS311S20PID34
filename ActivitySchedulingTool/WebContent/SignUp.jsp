<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Signup Form</title>
<link rel= "stylesheet"  href= "SignUp.css">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
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
     <form id="form" class="form" " action="<% =  request.getContextPath() %>/SignUp.jsp" method="POST">
    <div class="form-control success">
       
        <input type="text"  name="role" placeholder="Role (Admin or Student)" required>
      </div>
      <div class="form-control success">
       
        <input type="text"  name="FirstName" placeholder="First Name.." required>
      </div>
      <div class="form-control error">
        
        <input type="text" name="lastName" placeholder="Last Name.." required>

      </div>
      <div class="form-control">
      
        <input type="text" name="email" placeholder="Email ID.." required pattern="[a-z0-9._%+-]+@[a-z0-9._]+\.[a-z]{2,4}$">
      </div>
      
      <div class="form-control">
       
        <input type="password" name="pass" placeholder="Password.." required>
      
      </div>
        
      <div class="form-control">
       
        <input type="password" name="cpass" placeholder="Confirm Password.." required>
      
      </div>
        <div class="form-control"> 
           <input type="tel" name="mblno" placeholder="Phone Number.." required>
        
        </div>
        <input type="submit" name="submit" value="Submit">
   
        <p class="message">Already have account? <button>Login</button></p>
    </form>

   </div>
   </section>
   <div id="overlyArea">

   </div>
   
</body>
</html>