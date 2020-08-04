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
    <title>LogIn</title>
  <script type="text/javascript">
  var selectedValue=document.getElementById("role").value;
  out.println("run");
  console.log(selectedValue);
  </script>
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
       
          <select name="role" id="role" class="dropHolder" onchange="getcube();" >           
           
              <option selected disabled>--Select Option--</option>
            
                 <%
                try{
                  Connection conn= dbConnection.getCon();
                  Statement st;
              	st=conn.createStatement();
              	
                    ResultSet rs=st.executeQuery("select * from role");
                    while(rs.next())
                    {
                        %>
                      
                      <option value="<%=rs.getString("Role")%>">
                      <%=rs.getString("Role")%>
                       
                      </option>   
                                  
                        <%
                      
                    }
                }
                catch(Exception e){
                    out.println("Exception: "+e.getMessage());
                   // e.printStackTrace();
                }
                %>
                <!-- <li><i class="fa fa-star"></i> Admin</li> -->
                <!-- <li><i class="fa fa-heart"></i> Student</li>  -->
              </select> 
        
              <input type="text" name="value" id="val" readonly>
   
        <input type="submit" value="LOGIN"  onclick="getcube()">
         <p class="message"> Does'nt have account? <a href="Signuppage.jsp">Signup</a></p>
     
    <div class="Socials">
        <a href="#"><i class="fa fa-facebook"></i></a>
        <a href="#"><i class="fa fa-twitter"></i></a>
        <a href="#"> <i class="fa fa-google"></i></a>
     </div>
        </div>
    
        <div id="overlyArea">
    
     </div>
  <script>

  function getcube(){  
		 var number=document.getElementById("role").value;  
		  var input=document.getElementById("val");

	      input.value=number;
	      var inputVal = document.getElementById("val").value;
	     if(inputVal=='Admin'){
	    	 window.location.replace("AdminLogin.jsp")
	     }
	     else if(inputVal=='Student')
	    	 window.location.replace("StudentLogin.jsp")
	    else{
		 alert("else");
	 }}
	 
</script>
     
</body>
</html>