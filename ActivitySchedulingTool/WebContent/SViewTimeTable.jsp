<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
        <%@page import="com.za.ga.cs.Driver" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>View Time Table</title>
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
        <li><i class="fa fa-home"></i><a href="Student.html">Home</a></li>
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
                  <li><i class="fa fa-ravelry"></i><a href="#Mission">Mission</a></li>
                  <li><i class="fa fa-eercast"></i><a href="#Vision">Vision</a></li>
                  <li><i class="fa fa-angellist"></i><a href="#Team">Team</a></li>
                    <li><i class="fa fa-phone"></i><a href="#Contact">Contact Us</a></li>

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
                            <li><a href="Student.html" data-after="Home">Home</a></li>
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
               <th>ID</th>
          <th>Department</th>
            <th>Course(Number, max # of Students)</th>
            <th>Room(Capacity)</th>
            <th>Instructor(ID)</th>
            <th>Meeting Time(ID)</th>
        </tr>
        </thead>
        <tr>
                <%
                try{
                	  Connection conn= dbConnection.getCon();
                	   Driver.main();
                      PreparedStatement st;
                  	st=conn.prepareStatement("select * from timetable");
                  	
                        ResultSet rs=st.executeQuery();
                    while(rs.next())
                    {
                        %>
                       <tr>
                        <td><%=rs.getString("Id")%></td>
                        <td><%=rs.getString("dept")%></td>
                        <td><%=rs.getString("course(number,max # of students)")%></td>
                        <td><%=rs.getString("Room(capacity)")%></td>
                        <td><%=rs.getString("Instructor(ID)")%></td>
                        <td><%=rs.getString("MeetingTime(ID)")%></td>
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
        <a href="SMission.html">Mission</a>
        <a href="Svision.html">Vision</a>
        <a href="Steam.html">Team</a>
        <a href="Scontact.html">Contact Us</a>
        </div>
    </div>
</section>
<!--Footer End-->
<script src="./app.js"></script>

    
</body>
</html>