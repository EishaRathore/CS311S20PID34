<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>View Faculty</title>
 <link rel="stylesheet" href="AddCourse.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link  rel="stylesheet" type="text/css" href="Addtable.css">
</head>
<body>
  <!--Header Start-->
    <section id="header">
        
        <nav>
            <div class="brand">
                <h1><span>S</span>chedule<span>G</span>enerator</h1>
            </div>
<div class="menu-bar">
    <ul>
        <li><i class="fa fa-home"></i><a href="#">Home</a></li>
        <li><i class="fa fa-calendar"></i><a href="#">Time Table</a>
            <div class="sub-menu-1">
                <ul>
                    <li><i class="fa fa-list"></i><a href="SViewTimeTable.jsp">Time Table List</a></li>
                </ul>
            </div>
        </li>
        <li><i class="fa fa-book"></i><a href="#">Subjetcs</a>
            <div class="sub-menu-1">
                <ul>
                    <li><i class="fa fa-list"></i><a href="SViewCourse.jsp">Subject List</a></li>
                </ul>
            </div>
        </li>
        <li><i class="fa fa-users"></i><a href="#">Faculty</a>
            <div class="sub-menu-1">
                <ul>
                    <li><i class="fa fa-list"></i><a href="SViewFaculty.jsp">Faculty List</a></li>
                </ul>
            </div>
        </li>
        <li><i class="fa fa-user"></i><a href="#">About Us</a>
            <div class="sub-menu-1">
                <ul>
                 <li><i class="fa fa-ravelry"></i><a href="SMission.html">Mission</a></li>
                  <li><i class="fa fa-eercast"></i><a href="Svision.html">Vision</a></li>
                  <li><i class="fa fa-angellist"></i><a href="Steam.html">Team</a></li>
                    <li><i class="fa fa-phone"></i><a href="Scontact.html">Contact Us</a></li>

                </ul>
            </div>
        </li>

        
        <li><i class="fa fa-sign-in"></i><a href="Login.jsp">Log Out</a></li>
    </ul>
</div>
            <div class="header container">
                <div class="nav-bar">
                   
                    <div class="nav-list">
                        <div class="ham"><div class="bar"></div></div>
                        <ul>
                            <li><a href="#" data-after="Home">Home</a></li>
                            <li><a href="#About" data-after="About">About Us</a></li>
                            <li><a href="#Contact" data-after="contact">Contact</a></li>
                            <li><a href="Login.jsp" data-after="login">Log in</a></li>
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
      <table class="content-table" border="table table-bordered table-stripped table-condensed" align="center">
         <thead>
            <tr>
             <th>id</th>
            <th>Instructor Name</th>
        
        </tr>
        </thead>
        <tr>
                <%
                try{
                  Connection conn= dbConnection.getCon();
                  PreparedStatement st;
              	st=conn.prepareStatement("select * from faculty");
              	
                    ResultSet rs=st.executeQuery();
                    while(rs.next())
                    {
                        %>
                        <tr>
                        <td><%=rs.getString("Inum")%></td>
                        <td><%=rs.getString("Iname")%></td>
                    </tr>
                        <%
                    }
                }
                catch(Exception e){
                    out.println("Exception: "+e.getMessage());
                    e.printStackTrace();
                }
                %>
        </tr>

  </tbody>
    </table>
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