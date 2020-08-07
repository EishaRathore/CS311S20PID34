<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
     <%@page import="com.za.ga.cs.connectionProvider.createDb" %>
     <%@page import="com.za.ga.cs.connectionProvider.InsertIntoDb" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="mainStyle.css">
 <link rel="stylesheet" href="Admin.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<title>Home</title>
</head>
<body>
<%

try {
	createDb.main();
	InsertIntoDb.main();
}
catch (Exception e)
{
out.println("An error occurred calling createDb function.");
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
    
     
        <li><i class="fa fa-user"></i><a href="#">About Us</a>
            <div class="sub-menu-1">
                <ul>
                  <li><i class="fa fa-ravelry"></i><a href="#ViewMission">Mission</a></li>
                  <li><i class="fa fa-eercast"></i><a href="#ViewVision">Vision</a></li>
                  <li><i class="fa fa-angellist"></i><a href="#ViewTeam">Team</a></li>
                    <li><i class="fa fa-phone"></i><a href="#Contact">Contact Us</a></li>

                </ul>
            </div>
        </li>

        
       <li><i class="fa fa-sign-in"></i><a href="Login.jsp">Log In</a></li>
    </ul>
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
 <!-- Mission Section Start-->
 <section id="About">
    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 309"><path fill="#fff" fill-opacity="1" d="M0,192L48,208C96,224,192,256,288,250.7C384,245,480,203,576,202.7C672,203,768,245,864,256C960,267,1056,245,1152,208C1248,171,1344,117,1392,90.7L1440,64L1440,0L1392,0C1344,0,1248,0,1152,0C1056,0,960,0,864,0C768,0,672,0,576,0C480,0,384,0,288,0C192,0,96,0,48,0L0,0Z"></path></svg>
   <div id="ViewMission"  class="About container">
       
    <div class="About-top">
        
        <h1 class="SectionTitle">   Mission   </h1>
        
        <p>
         The mission of KEM Time Table generator is to provide you an effective tool to 
              make your schedule with just few clicks.Schedule are usually hectic but making
              them could be even more hectic so we are here with a classy website to solve your 
              this problem.We will provide you the most optimal solution possible with respect for 
              demands of our customers.
        </p>
    </div>
    <div class="About Bottom"></div>
   </div>
   <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1140 309"><path fill="#fff" fill-opacity="2" d="M0,160L48,133.3C96,107,192,53,288,69.3C384,85,480,171,576,218.7C672,267,768,277,864,282.7C960,288,1056,288,1152,240C1248,192,1344,96,1392,48L1440,0L1440,320L1392,320C1344,320,1248,320,1152,320C1056,320,960,320,864,320C768,320,672,320,576,320C480,320,384,320,288,320C192,320,96,320,48,320L0,320Z"></path></svg>
</section>
 <!-- Mission Section End-->
  
 <!--Team Section Start-->
<section  id="Contact">
    <div id="ViewTeam" class="Contact container">
        <div class="title"><h1>Team</h1></div>
        <div class="ContactItems">
            <div class="ContactItem">
                <div class="us"><img src="https://avatars3.githubusercontent.com/u/46721882?s=400&u=f4c42cc5a3efef4b2236ea33a487f008e338fd7f&v=4" width="100px" height="100px"></div>
                <div class="Contact-Info">
                    <h1>Eisha Butt</h1>
                    <h2><i class="fa fa-github"></i><span>  </span><a href="https://github.com/EishaButt">Eisha Butt</a></h2>
                    <h2>eisharathore5@gmail.com</h2>
                </div>
            </div>
        </div>
         <div class="ContactItems">
                <div class="ContactItem">
                    <div class="us"><img src="https://avatars2.githubusercontent.com/u/55192237?s=400&v=4"  width="150px" height="150px"></div>
                   <div class="Contact-Info"> <h1>Manahil Ameer</h1>
                    <h2><i class="fa fa-github"></i><span>  </span><a href="https://github.com/ManahilAmeer">Manahil Ameer</a></h2>
                    <h2>manahil1054@gmail.com</h2>
                    </div>
                       
                </div>
              
            </div>
                <div class="ContactItems">
                    <div class="ContactItem">
                        <div class="us"><img src="https://avatars2.githubusercontent.com/u/55206006?s=460&u=2d4a7c1254207d4f53bb4eab3f8a28df667b5424&v=4"  width="150px" height="150px"></div>
                        <div class="Contact-Info">
                            <h1>Khansa Khaliq</h1>
                            <h2><i class="fa fa-github"></i><span>  </span><a href="https://github.com/Khansa-Khaliq">Khansa Khaliq</a></h2>
                            <h2>khaliqkhansa@gmail.com</h2>
                            </div>                  
                    </div>

                </div>
            </div>
</section>
<section id="About">
    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 309"><path fill="#fff" fill-opacity="1" d="M0,192L48,208C96,224,192,256,288,250.7C384,245,480,203,576,202.7C672,203,768,245,864,256C960,267,1056,245,1152,208C1248,171,1344,117,1392,90.7L1440,64L1440,0L1392,0C1344,0,1248,0,1152,0C1056,0,960,0,864,0C768,0,672,0,576,0C480,0,384,0,288,0C192,0,96,0,48,0L0,0Z"></path></svg>
   <div class="About container">
       
    <div class="About-top">
        
        <h1 class="SectionTitle">   Core values of Team  </h1>
        
        <p>
Integrity: Being Open and honest in all our dealings and maintaing
            highest Integrity at all times<br>
         Teamwork: Providing support to one another, working co-operatively, 
            respecting one another’s views,<br> and making our work environment fun and enjoyable.<br>
         Excellence: Always doing what we say we will and striving for excellence 
            and quality in everything we do.        </p>
    </div>
    <div class="About Bottom"></div>
   </div>
   <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1140 309"><path fill="#fff" fill-opacity="2" d="M0,160L48,133.3C96,107,192,53,288,69.3C384,85,480,171,576,218.7C672,267,768,277,864,282.7C960,288,1056,288,1152,240C1248,192,1344,96,1392,48L1440,0L1440,320L1392,320C1344,320,1248,320,1152,320C1056,320,960,320,864,320C768,320,672,320,576,320C480,320,384,320,288,320C192,320,96,320,48,320L0,320Z"></path></svg>
</section>
 <!--Team Section End-->
           <!-- Vision Section Start-->
 <section  id="About">
    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 309"><path fill="#fff" fill-opacity="1" d="M0,192L48,208C96,224,192,256,288,250.7C384,245,480,203,576,202.7C672,203,768,245,864,256C960,267,1056,245,1152,208C1248,171,1344,117,1392,90.7L1440,64L1440,0L1392,0C1344,0,1248,0,1152,0C1056,0,960,0,864,0C768,0,672,0,576,0C480,0,384,0,288,0C192,0,96,0,48,0L0,0Z"></path></svg>
   <div id="ViewVision" class="About container">
       
    <div class="About-top">
        
        <h1 class="SectionTitle">   Vission  </h1>
        
        <p>
       The Vision of KEM Time Table generator is to give our users a great experience visiting our page.
            It has a user-friendly layout which will make it easier to interact with the website.
        </p>
    </div>
    <div class="About Bottom"></div>
   </div>
   <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1140 309"><path fill="#fff" fill-opacity="2" d="M0,160L48,133.3C96,107,192,53,288,69.3C384,85,480,171,576,218.7C672,267,768,277,864,282.7C960,288,1056,288,1152,240C1248,192,1344,96,1392,48L1440,0L1440,320L1392,320C1344,320,1248,320,1152,320C1056,320,960,320,864,320C768,320,672,320,576,320C480,320,384,320,288,320C192,320,96,320,48,320L0,320Z"></path></svg>
</section>
 <!-- Vision Section End-->
  
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
          <div class="mission">
        <a href="#ViewMission" style="color:white;">Mission</a>
        <a href="#ViewVision" style="color:white;">Vision</a>
        <a href="#ViewTeam" style="color:white;">Team</a>
        <a href="#Contact" style="color:white;" >Contact Us</a>
        </div>
      </div>
    </div>
</section>
<!--Footer End-->

<script src="./app.js"></script>
</body>
</html>