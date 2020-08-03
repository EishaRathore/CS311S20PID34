<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.*" %>
    <%@page import="com.za.ga.cs.connectionProvider.dbConnection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>View Department</title>
    <link  rel="stylesheet" type="text/css" href="Addtable.css">
</head>
<body>
 <table border="table table-bordered table-stripped table-condensed" align="center">
        <tr>
            
            <th>Department Name</th>
           
        </tr>
        <tr>
                <%
                try{
                  Connection conn= dbConnection.getCon();
                  PreparedStatement st;
              	st=conn.prepareStatement("select * from dept");
              	
                    ResultSet rs=st.executeQuery();
                    while(rs.next())
                    {
                    
                        %>
                        <tr>
                        
                        <td><%=rs.getString("dname")%></td></tr>
                       
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