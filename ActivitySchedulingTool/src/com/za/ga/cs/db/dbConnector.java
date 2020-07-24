package com.za.ga.cs.db;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;


public class dbConnector {
      public static void main(String[] args) {
    	  Connection conn = null;
    	  try {
    		  conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser","root","");
    		  if(conn!=null) {
    			  System.out.println("database is connected");
    		  }
    	  }
    	  catch(Exception e) {
    		  System.out.println("not connected");
    	  }
      }
}
