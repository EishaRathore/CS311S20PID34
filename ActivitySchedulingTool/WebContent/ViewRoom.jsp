<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>View Rooms</title>
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
        <li><i class="fa fa-home"></i><a href="Admin.jsp">Home</a></li>
        <li><i class="fa fa-calendar"></i><a href="#">Time Table</a>
            <div class="sub-menu-1">
                <ul>
                
                    <li><i class="fa fa-list"></i><a href="ViewTable.jsp">Time Table List</a></li>
                </ul>
            </div>
        </li>
        <li><i class="fa fa-book"></i><a href="#">Courses</a>
            <div class="sub-menu-1">
                <ul>
                   <li><i class="fa fa-plus"></i><a href="AddCourse.html">Add Course</a></li>
                      <li><i class="fa fa-plus"></i><a href="AddCourseI.jsp">Add Course Instructor</a></li>
                    <li><i class="fa fa-plus"></i><a href="AddDeptC.jsp">Add Department Course</a></li>
                    <li><i class="fa fa-list"></i><a href="ViewCourse.jsp">Course List</a></li>
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
                    <li><i class="fa fa-plus"></i><a href="AddTime.jsp">Add Class Time</a></li>
                    <li><i class="fa fa-list"></i><a href="ViewInstructor.jsp">Faculty List</a></li>
                    <li><i class="fa fa-list"></i><a href="ViewRoom.jsp">Rooms List</a></li>
                    <li><i class="fa fa-list"></i><a href="ViewDepartments.jsp">Department List</a></li>
                 <!--  <li><i class="fa fa-list"></i><a href="#">Class Time List</a></li> -->  
                </ul>
            </div>
        </li>
        <li><i class="fa fa-user"></i><a href="#">About Us</a>
            <div class="sub-menu-1">
                <ul>
               <li><i class="fa fa-ravelry"></i><a href="Mission.html">Mission</a></li>
                  <li><i class="fa fa-eercast"></i><a href="vision.html">Vision</a></li>
                  <li><i class="fa fa-angellist"></i><a href="team.html">Team</a></li>
                    <li><i class="fa fa-phone"></i><a href="contact.html">Contact Us</a></li>

                </ul>
            </div>
        </li>

        
        <li><i class="fa fa-sign-in"></i><a href="index.jsp">Log Out</a></li>
    </ul>
</div>
            <div class="header container">
                <div class="nav-bar">
                   
                    <div class="nav-list">
                        <div class="ham"><div class="bar"></div></div>
                        <ul>
                            <li><a href="Admin.jsp" data-after="Home">Home</a></li>
                            <li><a href="#" data-after="Time">Time Table</a></li>
                            <li><a href="#" data-after="Subjects">Subjects</a></li>
                            <li><a href="#About" data-after="About">About Us</a></li>
                            <li><a href="#" data-after="Resources">Resources</a></li>
                            <li><a href="index.jsp" data-after="Login">Log Out</a></li>
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
          
            <th>Room No</th>
            <th>Seating Capacity</th>
        </tr>
        </thead>
        <tr>
                <%
                try{
                  Connection conn= dbConnection.getCon();
                  PreparedStatement st;
              	st=conn.prepareStatement("select * from rooms");
              	
                    ResultSet rs=st.executeQuery();
                    while(rs.next())
                    {
                        %>
                        <tr>
                       
                        <td><%=rs.getString("room_no")%></td>
                        <td><%=rs.getString("room_capacity")%></td>
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
        <a href="Mission.html">Mission</a>
        <a href="vision.html">Vision</a>
        <a href="team.html">Team</a>
        <a href="contact.html">Contact Us</a>
        </div>
    </div>
</section>
<!--Footer End-->
<script src="./app.js"></script>

    
</body>
</html>