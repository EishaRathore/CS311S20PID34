<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
    <%@page import="com.za.ga.cs.Driver" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>View Table</title>
    <link  rel="stylesheet" type="text/css" href="Addtable.css">
</head>
<body>
 <table border="table table-bordered table-stripped table-condensed" align="center">
        <tr>
            <th>ID</th>
            <th>Department</th>
            <th>Course(Number, max # of Students)</th>
            <th>Room(Capacity)</th>
            <th>Instructor(ID)</th>
            <th>Meeting Time(ID)</th>
        </tr>
        <tr>
                <%
                try{
                	  Connection conn= dbConnection.getCon();
                	  Driver.main();
                      PreparedStatement st;
                  	st=conn.prepareStatement("select * from time_table");
                  	
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

    </table>
    
</body>
</html>