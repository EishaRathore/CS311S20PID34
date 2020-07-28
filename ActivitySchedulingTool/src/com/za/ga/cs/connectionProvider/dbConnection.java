package com.za.ga.cs.connectionProvider;
import java.sql.*;

import javax.swing.JOptionPane;
public class dbConnection {
	public static void main(String[] args) throws Exception{
		getCon();
	}
public static Connection getCon() {
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test5","root","");
		System.out.println( "connected to database");
		return con;
	}catch(Exception e) {
		 e.printStackTrace();
         return null;
	}
	}
}
