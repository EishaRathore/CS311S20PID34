package com.za.ga.cs.db.servlet;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class registerDao {
	Properties info = new Properties();
	  private String driver = "com.mysql.jdbc.Driver";
		private  String url = "jdbc:mysql://localhost:3306/loginuser?useSSL=false";
		  public void loadDriver(String dbDriver) {
	    	   try {
				Class.forName(dbDriver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }

	private Connection getConnection() {
		Connection conn=null; 
		info.put("username", "root");
		info.put("password", "");
		try {
			
			// load and register JDBC driver for MySQL 
			Class.forName("com.mysql.jdbc.Driver");
 		  conn = DriverManager.getConnection(url,info);
 	 System.out.println("Connected");
 	
 	  }
 	  catch(Exception e) {
 		  System.out.println(e);
 	  }  
		 return conn;
	}
	  public void createTable() throws Exception{
    	  try {
    		  loadDriver(driver);
    		  Connection con = getConnection();
    		  PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS userData(id int NOT NULL AUTO_INCREMENT,role varchar(20), first varchar(255), last varchar(255),email varchar(255),password varchar(255),cpassword varchar(255),mblnumber varchar(255), PRIMARY KEY(id))");
    	      create.executeUpdate();
    	  }catch(Exception e) {
    		  
    		  System.out.println(e);
    	  }
    	  finally{System.out.println("function Complete");}
      }
	public String insert(Member member) {
		loadDriver(driver);
		try {
			createTable();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con = getConnection();
		String result = "inserted Sucessfully";
		String sql="INSERT INTO userdata.member values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getRole());
			ps.setString(2, member.getFirst());
			ps.setString(3, member.getLast());
			ps.setString(4, member.getEmail());
			ps.setString(5, member.getPassword());
			ps.setString(6, member.getCpassword());
			ps.setString(7, member.getMblnumber());
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			result="data not entered";
		}
		return result;
	}
}

