package com.za.ga.cs.connectionProvider;
import java.sql.*;

import javax.swing.JOptionPane;
public class dbConnection {
public static Connection getCon() {
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/activityscheduling","root","");
		//JOptionPane.showMessageDialog(null, "connected to database");
		return con;
	}catch(Exception e) {
		 JOptionPane.showMessageDialog(null, "inside catch ");
         JOptionPane.showMessageDialog(null, e);
         return null;
	}
	}
}
