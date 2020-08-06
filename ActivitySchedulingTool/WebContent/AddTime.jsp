<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  
    <link rel="stylesheet" href="Day.scss" />
    <link rel="stylesheet"  href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"  />
   
    <title>Add Time</title>
  </head>
  <body>
    <script>
  
           function checkvar() {
        	   var checks=document.getElementsByClassName('checks');
        	   var str='';
        	   
        	
        	   for(i=0;i<7;i++){
        	   	if(checks[i].checked===true){
        	   		str +=checks[i].value + "";
        	   	
        	 
        	   	}
           }
        	   var number=str;  
 	   		  var input=document.getElementById("val");
 	   		  input.value=number;
           }
           
           function checkvariable() {
        	   var checks=document.getElementsByClassName('checks');
               var count=0;
        	   for(i=0;i<7;i++){
        	   	if(checks[i].checked===true){
        	   	count++;
        	   	}
           }
        	   if(count>0){
        		   document.getElementById('submit').disabled = false;
        	   }else{
        		   document.getElementById('submit').disabled = true;
        		   alert("Please select atleast One Day!");
        	   }
           }
   
           </script>
   
  
    <!--Header Start-->
    <section id="header">
      <nav>
        <div class="brand">
          <h1><span>S</span>chedule<span>G</span>enerator</h1>
        </div>
        <div class="menu-bar">
          <ul>
            <li><i class="fa fa-home"></i><a href="#">Home</a></li>
            <li>
              <i class="fa fa-calendar"></i><a href="#">Time Table</a>
              <div class="sub-menu-1">
                <ul>
                
                   <li><i class="fa fa-list"></i><a href="ViewTable.jsp">View Time Table</a></li>
                </ul>
              </div>
            </li>
            <li>
              <i class="fa fa-book"></i><a href="#">Courses</a>
              <div class="sub-menu-1">
                <ul>
                 <li><i class="fa fa-plus"></i><a href="AddCourseI.jsp">Add Course Instructor</a></li>
                    <li><i class="fa fa-plus"></i><a href="AddDeptC.jsp">Add Department Course</a></li>
                  <li>
                    <i class="fa fa-plus"></i
                    ><a href="AddCourse.html">Add Course</a>
                  </li>
                  <li><i class="fa fa-list"></i><a href="ViewCourse.jsp">Course List</a></li>
                   <li><i class="fa fa-list"></i><a href="ViewDeptCourse.jsp">Department Course List</a></li>
                      <li><i class="fa fa-list"></i><a href="ViewCourseIns.jsp">Course Instructor List</a></li>
                </ul>
              </div>
            </li>
            <li>
              <i class="fa fa-users"></i><a href="#">Resources</a>
              <div class="sub-menu-1">
                <ul>
                  <li>
                    <i class="fa fa-plus"></i
                    ><a href="AddInstr.jsp">Add Faculty</a>
                  </li>
                  <li>
                    <i class="fa fa-plus"></i
                    ><a href="AddRoom.html">Add Rooms</a>
                  </li>
                  <li>
                    <i class="fa fa-plus"></i
                    ><a href="AddDept.jsp">Add Department</a>
                  </li>
                  <li>
                    <i class="fa fa-plus"></i
                    ><a href="AddTime.jsp">Add Class Time</a>
                  </li>
                  <li>
                    <i class="fa fa-list"></i><a href="ViewInstructor.jsp">Faculty List</a>
                  </li>
                  <li><i class="fa fa-list"></i><a href="ViewRoom.jsp">Rooms List</a></li>
                  <li>
                    <i class="fa fa-list"></i><a href="ViewDepartments.jsp">Department List</a>
                  </li>
                  <li>
                    <i class="fa fa-list"></i><a href="ViewClassTime.jsp">Class Time List</a>
                  </li>
                </ul>
              </div>
            </li>
            <li>
              <i class="fa fa-user"></i><a href="#">About Us</a>
              <div class="sub-menu-1">
                <ul>
                  <li><i class="fa fa-ravelry"></i><a href="Mission.html">Mission</a></li>
                  <li><i class="fa fa-eercast"></i><a href="vision.html">Vision</a></li>
                  <li><i class="fa fa-angellist"></i><a href="team.html">Team</a></li>
                    <li><i class="fa fa-phone"></i><a href="contact.html">Contact Us</a></li>
                </ul>
              </div>
            </li>

            <li>
              <i class="fa fa-sign-in"></i><a href="Login.jsp">Log Out</a>
            </li>
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
                <li><a href="#" data-after="About">About Us</a></li>
                <li><a href="#" data-after="Resources">Resources</a></li>
                <li><a href="Login.jsp" data-after="Login">Log Out</a></li>
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
            <h2>Add Class Time</h2>
          <input type="text" name="TimeID" placeholder="ClassTime ID.."  pattern="[M][T][0-9]+$" title="Must Start with MT and then any numeric number!" required
            >
          
        <label style="color:crimson">Select Days</label>  
        <form id="booking">   
    <div class="dowPicker" required>
    <div class="dowPickerOption">
      <input type="checkbox" id="dow1" class="checks" value="S">
      <label for="dow1">S</label>
    </div>
    <div class="dowPickerOption">
      <input type="checkbox" id="dow2" class="checks" value="M">
      <label for="dow2">M</label>
    </div>
    <div class="dowPickerOption">
      <input type="checkbox" id="dow3" class="checks" value="T">
      <label for="dow3">T</label>
    </div>
    <div class="dowPickerOption">
      <input type="checkbox" id="dow4" class="checks" value="W">
      <label for="dow4">W</label>
    </div>
    <div class="dowPickerOption">
      <input type="checkbox" id="dow5" class="checks" value="T">
      <label for="dow5">T</label>
    </div>
    <div class="dowPickerOption">
      <input type="checkbox" id="dow6" class="checks" value="F">
      <label for="dow6">F</label>
    </div>
    <div class="dowPickerOption">
      <input type="checkbox" id="dow7" class="checks" value="S">
      <label for="dow7">S</label>
    </div></br>
  </div> 
  
  </form>
<input type="hidden" name="value" id="val" readonly>
    <label for="time" style="color:crimson">Start Time</label>
            <input type="time" name="ClassTime1"  onclick="checkvariable()" required>
            
            <label for="time" style="color:crimson">End Time</label>
            <input type="time" name="ClassTime2" onclick="checkvariable()" required>
             <input type="submit" id="submit" name="submit" value="Submit" onclick="checkvar();checkvariable()" disabled>
           
          </div>
        </form>
      </div>
    </section>
    <!-- Background Section End-->

    <!--Footer Start-->

        <section id="footer">
      <div class="footer container">
        <div class="brand">
          <h1>
            <span>A</span>ctivity <span>S</span>cheduling <span>T</span>ool
          </h1>
          <h2>Find Us on Social Media</h2>
          <div class="social-icon">
            <div class="social-item">
              <a href="#"><img src="Facebook Old_48px.png" /></a>
            </div>
            <div class="social-item">
              <a href="#"><img src="twitter_48px.png" /></a>
            </div>
            <div class="social-item">
              <a href="#"><img src="github_32px.png" /></a>
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
      <%
        	  try{
        		  Connection con=dbConnection.getCon();
        		  PreparedStatement st;
        		  
        		  String Mtime2 = request.getParameter("TimeID");
        		 
        		  String Mtime = request.getParameter("ClassTime1");
        		
        		  String Mtime1 = request.getParameter("ClassTime2");
        		
        		  String name=request.getParameter("value");
  
        		  String x = request.getParameter("submit");
        		   if(x!=null && x.equals("Submit")){
        			
             	  	st=con.prepareStatement("INSERT INTO meetingtime(meetingID,meeting_time) values('"+Mtime2+"',CONCAT('"+name+"',' ','"+Mtime+"',' - ','"+Mtime1+"'))");
             	  
             	  	int y=st.executeUpdate();
             	  	
              	  	if(y>0){
              	  		response.sendRedirect("Admin.jsp");
              	  	}
              	  	else{
              	  		response.sendRedirect("AddTime.jsp");
              	  	}}
        	  }catch(Exception e){
        	  //	e.printStackTrace();
        	  	//out.println("Error"+e.getMessage());
        	  	response.sendRedirect("AddTime.jsp");
        	  }
 %>

  </body>
</html>
