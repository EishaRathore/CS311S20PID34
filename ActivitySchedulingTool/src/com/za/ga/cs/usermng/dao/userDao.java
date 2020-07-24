package com.za.ga.cs.usermng.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.catalina.User;

import com.za.ga.cs.db.servlet.Member;
import com.za.ga.cs.usermng.model.user;

public class userDao {
	   Properties info = new Properties();
	   info.put("username", "root");
		info.put("password", "");
	    private String driver = "com.mysql.jdbc.Driver";
		private  String url = "jdbc:mysql://localhost:3306/loginuser";
		
		
		public static final String INSERT_USERS_SQL="INSERT INTO userdata"+" (role,firstname,lastname,email,password,cpassword,mblnumber) VALUES"+"(?,?,?,?,?,?,?);";
		public static final String SELECT_ALL_USERS="SELECT * FROM userdata";
		public static final String SELECT_USER_BY_ID="SELECT id,role,firstname,lastname,email,password,cpassword,mblnumber FROM userdata WHERE id=?;";
		public static final String DELETE_USERS_SQL="DELETE FROM userdata where id=?";
		public static final String UPDATE_USERS_SQL="UPDATE userdata set role= ?, firstname=?,lastname=?,email=?,password=?,cpassword=?,mblnumber=? where id = ?;";

protected Connection getConnection() {
	Connection connection = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(url,info);
	}catch(SQLException e) {
		e.printStackTrace();
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	return connection;
}

public void insertUser(user user) throws SQLException {
	try(Connection connection = getConnection();
	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
    preparedStatement.setString(1, user.getRole());
    preparedStatement.setString(2, user.getFirst());
    preparedStatement.setString(3, user.getLast() );
    preparedStatement.setString(4, user.getEmail());
    preparedStatement.setString(5, user.getPassword());
    preparedStatement.setString(6, user.getCpassword());
    preparedStatement.setString(7, user.getMblnumber());
    preparedStatement.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace(); }
	}
}
public boolean update(user user)throws SQLException{
	boolean rowUpdated;
	try(Connection connection =getConnection();
			PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);){
		    statement.setNString(1, user.getRole());
		    statement.setNString(2, user.getFirst());
		    statement.setNString(3, user.getLast());
		    statement.setNString(1, user.getName());
	}
			)
}
