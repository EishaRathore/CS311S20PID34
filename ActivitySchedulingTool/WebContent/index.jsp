<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="mainStyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<title>Home</title>
</head>
<body>
<%

try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
Statement statement = con.createStatement();
String query = "CREATE DATABASE IF NOT EXISTS test5";
statement.executeUpdate(query);
out.println("Database test created sucessfully.");
statement.close();
}
catch (Exception e)
{
out.println("An error occurred.");
}

%>
<%

try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test5","root","");
	out.println("databaes");
	 Statement statement=con.createStatement();
	 statement.executeUpdate("CREATE TABLE IF NOT EXISTS userdata(id int NOT NULL AUTO_INCREMENT,fName varchar(255),lName varchar(255),email varchar(255),password varchar(255),cpassword varchar(255),mbl varchar(255),role varchar(255),PRIMARY KEY(id))");
	 statement.executeUpdate("CREATE TABLE IF NOT EXISTS rooms(id int NOT NULL AUTO_INCREMENT,room_no varchar(255),room_capacity varchar(255),PRIMARY KEY(id))");
	 statement.executeUpdate("CREATE TABLE IF NOT EXISTS course(id int NOT NULL AUTO_INCREMENT,Cname varchar(255),code varchar(255),seating_capacity varchar(255),departmentID varchar(255),PRIMARY KEY(id),FOREIGN KEY (departmentID) REFERENCES dept(id))");
	 statement.executeUpdate("CREATE TABLE IF NOT EXISTS dept(id int NOT NULL AUTO_INCREMENT,dname varchar(255),PRIMARY KEY(id))");
	statement.executeUpdate("CREATE TABLE IF NOT EXISTS faculty(id int NOT NULL AUTO_INCREMENT,Iname varchar(255),CourseID varchar(255),PRIMARY KEY(id),FOREIGN KEY (CourseID) REFERENCES course(id))");
	statement.executeUpdate("CREATE TABLE IF NOT EXISTS meetingtime(id int NOT NULL AUTO_INCREMENT,meeting_time varchar(255),PRIMARY KEY(id))");
	  out.println("Successfully created test_table");
statement.close();
}
catch (Exception e)
{
out.println("An error occurred.");
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
        <li><i class="fa fa-user"></i><a href="#About">About Us</a></li>
                <li><i class="fa fa-phone"></i><a href="#Contact">Contact Us</a></li>
        <li><i class="fa fa-sign-in"></i><a href="Login.html">Log In</a></li>
    </ul>
        </div>
            <div class="header container">
                <div class="nav-bar">
                   
                    <div class="nav-list">
                        <div class="ham"><div class="bar"></div></div>
                        <ul>
                            <li><a href="#header" data-after="Home">Home</a></li>
                            <li><a href="#About" data-after="About">About Us</a></li>
                            <li><a  href="#Contact" onclick="javascript:myFunc()">Contact</a></li>
                            <li><a href="Login.html" data-after="login">Log in</a></li>
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
            <div class="bannerTitle">
                <h1>Activity Scheduling Tool</h1>
            </div>
        </div>
    </section>
 <!-- Background Section End-->

 <!-- About Us Section Start-->
 <section id="About">
    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 309"><path fill="#fff" fill-opacity="1" d="M0,192L48,208C96,224,192,256,288,250.7C384,245,480,203,576,202.7C672,203,768,245,864,256C960,267,1056,245,1152,208C1248,171,1344,117,1392,90.7L1440,64L1440,0L1392,0C1344,0,1248,0,1152,0C1056,0,960,0,864,0C768,0,672,0,576,0C480,0,384,0,288,0C192,0,96,0,48,0L0,0Z"></path></svg>
   <div class="About container">
       
    <div class="About-top">
        
        <h1 class="SectionTitle">   About    </h1>
        <h1>Activity Scheduling Tool</h1>
        <p>
          Welcome to Activity Scheduling Tool. A Professional Tool Which gives an optimal Solution 
          for a scheduling of a timetable.
        </p>
    </div>
    <div class="About Bottom"></div>
   </div>
   <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1140 309"><path fill="#fff" fill-opacity="2" d="M0,160L48,133.3C96,107,192,53,288,69.3C384,85,480,171,576,218.7C672,267,768,277,864,282.7C960,288,1056,288,1152,240C1248,192,1344,96,1392,48L1440,0L1440,320L1392,320C1344,320,1248,320,1152,320C1056,320,960,320,864,320C768,320,672,320,576,320C480,320,384,320,288,320C192,320,96,320,48,320L0,320Z"></path></svg>
</section>
 <!-- About Us Section End-->

 <!--Contact Section Start-->
<section id="Contact">
    <div class="Contact container">
        <div class="title"><h1>Contact <span>Info</span></h1></div>
        <div class="ContactItems">
            <div class="ContactItem">
                <div class="Icon"><img src="phone_50px.png"></div>
                <div class="Contact-Info">
                    <h1>Phone</h1>
                    <h2>0329 8981245</h2>
                    <h2>0303 7671222</h2>
                </div>
            </div>
        </div>
         <div class="ContactItems">
                <div class="ContactItem">
                    <div class="Icon"><img src="Important Mail_50px.png"></div>
                   <div class="Contact-Info"> <h1>Email</h1>
                    <h2>eisharathore5@gmail.com</h2>
                    <h2>manahil1054@gmail.com</h2>
                    <h2>khaliqkhansa@gmail.com</h2></div>
                       
                </div>
              
            </div>
                <div class="ContactItems">
                    <div class="ContactItem">
                        <div class="Icon"><img src="Address_50px.png"></div>
                        <div class="Contact-Info">
                            <h1>Address</h1>
                            <h2>Shad Bagh Lahore</h2>
                        </div>
                   
                    </div>

                </div>
            </div>
</section>
 <!--Contact Section End-->
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