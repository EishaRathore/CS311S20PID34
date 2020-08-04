<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="AddCourse.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Add Department Course</title>
</head>
<body>
<%
String CId = request.getParameter("Cid");
String Id = request.getParameter("Iid");
try{
	Connection con=dbConnection.getCon();
	 Statement statement;
		statement = con.createStatement();

	statement.executeUpdate("INSERT INTO course_instructor (course_instructor,course_numb) SELECT '"+Id+"','"+CId+"' WHERE NOT EXISTS (Select course_instructor,course_numb From course_instructor WHERE course_instructor='"+Id+"' AND course_numb='"+CId+"') LIMIT 1 ");
	
	response.sendRedirect("Admin.jsp");
}catch(Exception e){
	//e.printStackTrace();
	//out.println("Error"+e.getMessage());
	out.println("Please enter valid course id or Instructor Id!");
}
%>
    <!--Header Start-->
    <section id="header">
        
        <nav>
            <div class="brand">
                <h1><span>S</span>chedule<span>G</span>enerator</h1>
            </div>
<div class="menu-bar">
    <ul>
        <li><i class="fa fa-home"></i><a href="#header">Home</a></li>
        <li><i class="fa fa-calendar"></i><a href="#">Time Table</a>
            <div class="sub-menu-1">
                <ul>
                 
                   <li><i class="fa fa-list"></i><a href="ViewTable.jsp">View Time Table</a></li>
                </ul>
            </div>
        </li>
        <li><i class="fa fa-book"></i><a href="#">Courses</a>
            <div class="sub-menu-1">
                <ul>
                 <li><i class="fa fa-plus"></i><a href="AddCourseI.jsp">Add Course Instructor</a></li>
                    <li><i class="fa fa-plus"></i><a href="AddDeptC.jsp">Add Department Course</a></li>
                    <li><i class="fa fa-plus"></i><a href="AddCourse.html">Add Course</a></li>
                     <li><i class="fa fa-list"></i><a href="ViewCourse.html">Course List</a></li>
                      <li><i class="fa fa-list"></i><a href="ViewDeptCourse.jsp">Department Course List</a></li>
                      <li><i class="fa fa-list"></i><a href="ViewCourseIns.jsp">Course Instructor List</a></li>
                </ul>
            </div>
        </li>
        <li><i class="fa fa-users"></i><a href="#">Resources</a>
            <div class="sub-menu-1">
                <ul>
                   <li><i class="fa fa-plus"></i><a href="AddInstr.jsp">Add Faculty</a></li>
                    <li><i class="fa fa-plus"></i><a href="AddRoom.html">Add Rooms</a></li>
                    <li><i class="fa fa-plus"></i><a href="AddDept.jsp">Add Department</a></li>
                    <li><i class="fa fa-plus"></i><a href="AddTime.html">Add Class Time</a></li>
                    <li><i class="fa fa-list"></i><a href="#">Faculty List</a></li>
                    <li><i class="fa fa-list"></i><a href="#">Rooms List</a></li>
                    <li><i class="fa fa-list"></i><a href="#">Department List</a></li>
                    <li><i class="fa fa-list"></i><a href="#">Class Time List</a></li>
                </ul>
            </div>
        </li>
        <li><i class="fa fa-user"></i><a href="#">About Us</a>
            <div class="sub-menu-1">
                <ul>
                  <li><i class="fa fa-ravelry"></i><a href="#Mission">Mission</a></li>
                  <li><i class="fa fa-eercast"></i><a href="#Vision">Vision</a></li>
                  <li><i class="fa fa-angellist"></i><a href="#Team">Team</a></li>
                    <li><i class="fa fa-phone"></i><a href="#Contact">Contact Us</a></li>

                </ul>
            </div>
        </li>

        
        <li><i class="fa fa-sign-in"></i><a href="Login.html">Log In</a></li>
    </ul>
</div>
            <div class="header container">
                <div class="nav-bar">
                   
                    <div class="nav-list">
                        <div class="ham"><div class="bar"></div></div>
                        <ul>
                            <li><a href="#" data-after="Home">Home</a></li>
                            <li><a href="#" data-after="Time">Time Table</a></li>
                            <li><a href="#" data-after="Course">Subjects</a></li>
                            <li><a href="#About" data-after="About">About Us</a></li>
                            <li><a href="#" data-after="Resources">Resources</a></li>
                            <li><a href="Login.html" data-after="Login">Log in</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
       
    </section>
    <!--Header End-->
    
     <!-- Background Section Start-->
    <section id="background">
        <div class="background container">
        <form>
            <div class="wrap">
            
     <h2>Add Course Instructor</h2>
       <input type="text"  name="Cid" placeholder="Course ID" required>  
       <input type="text"  name="Iid" placeholder="Instructor ID" required>  
         <input type="submit" name="submit" href="#" value="Submit">
   </div>
   </form>
        </div>
    </section>
 <!-- Background Section End-->
   <section id="Mission">
      <div class="Mission container">
        <div class="Mission">
          <h1><span>M</span>ission <span>S</span>tatement</h1>
          <h2>The mission of KEM Time Table generator is to provide you an effective tool to 
              make your schedule with just few clicks.Schedule are usually hectic but making
              them could be even more hectic so we are here with a classy website to solve your 
              this problem.We will provide you the most optimal solution possible with respect for 
              demands of our customers.
          </h2>
          <hr>
                  <section id="Vision">
<h1><span>V</span>ision <span>S</span>tatement</h1>
          <h2>The Vision of KEM Time Table generator is to give our users a great experience visiting our page.
            It has a user-friendly layout which will make it easier to interact with the website.
          </h2>
          <hr>
                    <section id="Team">
               <h1><span>C</span>ore <span>V</span>alues of <span>T</span>eam </h1>
          <h2>Integrity: Being Open and honest in all our dealings and maintaing
            highest Integrity at all times<br>
         Teamwork: Providing support to one another, working co-operatively, 
            respecting one another’s views,<br> and making our work environment fun and enjoyable.<br>
         Excellence: Always doing what we say we will and striving for excellence 
            and quality in everything we do.
          </h2>

        </section>
</section>
          </section>
      </div>
      </div>

 
<!--Footer Start-->
<section id="footer">
    <div class="footer container">
        <div class="brand">
            <h1><span>A</span>ctivity <span>S</span>cheduling <span>T</span>ool</h1>
             <h2>Find Us on Social Media</h2>
             <div class="social-icon">
                 <div class="social-item">
                     <a href="#"><img src="Facebook Old_48px.png" ></a>
                 </div>
                 <div class="social-item">
                    <a href="#"><img src="twitter_48px.png" ></a>
                </div>
                <div class="social-item">
                    <a href="#"><img src="github_32px.png" ></a>
                </div>
             </div>
        </div>
        <p>Copyright @ 2020 Kem. All rights Reserved</p>
    </div>
</section>
<!--Footer End-->
<script src="./app.js"></script>

</body>
</html>