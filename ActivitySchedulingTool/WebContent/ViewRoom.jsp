<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="table table-bordered table-stripped table-condensed" align="center">
        <tr>
            <th>Id</th>
            <th>Room No</th>
            <th>Seating Capacity</th>
        </tr>
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
                        <td><%=rs.getInt("id")%></td>
                        <td><%=rs.getString("room_no")%></td>
                        <td><%=rs.getString("room_capacity")%></td>
                        
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