package com.za.ga.cs.connectionProvider;
import java.sql.*;
public class dbConnection {
public static Connection getCon() {
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/activityscheduling","root","");
		return con;
	}catch(Exception e) {
		System.out.println(e);
		return null;
	}
	}
}
