package com.za.ga.cs.connectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.za.ga.cs.connectionProvider.dbConnection;

public class createDb{
	public static void main() throws Exception{
		createDb();
	}
	private static void createDb() {
		try {
			Connection conn=dbConnection.getCon();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
		Statement statement = con.createStatement();
		String query = "CREATE DATABASE IF NOT EXISTS kem_schedule";
		statement.executeUpdate(query);
		//statement.close();
		}
		catch (Exception e)
		{
		System.out.println("An error occurred.");
		}
	
		
	}
}
