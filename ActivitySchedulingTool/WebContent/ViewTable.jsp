<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
            <th>Class Number</th>
            <th>Department</th>
            <th>Course</th>
            <th>Room</th>
            <th>Instructor</th>
            <th>Meeting Time</th>
        </tr>
        <tr>
                <%
                try{
                    Class.forName("SQL").newInstance();
                    Connection conn=DriverManager.getConnection("localhostname");
                    String query="query";
                    String stm=conn.createStatement();
                    ResultSet rs=stm.executeQuery(query);
                    while(rs.next())
                    {
                        %>
                        <td><%=rs.getInt("column")%></td>
                        <td><%=rs.getString("column")%></td>
                        <td><%=rs.getInt("column")%></td>
                        <td><%=rs.getInt("column")%></td>
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