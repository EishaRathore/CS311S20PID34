package com.za.ga.cs.connectionProvider;
import java.sql.*;

import javax.swing.JOptionPane;
public class dbConnection {
	public static void main() throws Exception{
		getCon();
	}
public static Connection getCon() {
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kem_schedule","root","");
		System.out.println( "connected to database");
		return con;
	}catch(Exception e) {
		 e.printStackTrace();
         return null;
	}
	}
}
