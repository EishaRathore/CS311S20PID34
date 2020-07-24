package com.za.ga.cs.usermng.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

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

public void insertUser(User user) throws SQLException {
	try(Connection connection = getConnection();
	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
    preparedStatement.setString(1, user.getRole());
    preparedStatement.setString(2, user.getFirst());
    preparedStatement.setString(3, user.getLast() );
    preparedStatement.setString(4, user.getEmail());
    preparedStatement.setString(4, user.getPassword());
    preparedStatement.setString(4, user.getCpassword());
    preparedStatement.setString(4, user.getMblnumber());
    preparedStatement.executeUpdate();
	}catch (SQLException e) {
        printSQLException(e);
    }
}
public boolean updateUser(user user) throws SQLException {
    boolean rowUpdated;
    try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
        statement.setString(1, user.getRole());
        statement.setString(2, user.getFirst());
        statement.setString(3, user.getLast());
        statement.setString(4, user.getEmail());
        statement.setString(5, user.getPassword());
        statement.setString(6, user.getCpassword());
        statement.setString(7, user.getMblnumber());
        rowUpdated = statement.executeUpdate() > 0;
    }
    return rowUpdated;
}
public user selectUser(int id) {
    user user = null;
    // Step 1: Establishing a Connection
    try (Connection connection = getConnection();
        // Step 2:Create a statement using connection object
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
        preparedStatement.setInt(1, id);
        System.out.println(preparedStatement);
        // Step 3: Execute the query or update query
        ResultSet rs = preparedStatement.executeQuery();

        // Step 4: Process the ResultSet object.
        while (rs.next()) {
            String role = rs.getString("role");
            String first = rs.getString("first");
            String last = rs.getString("last");
            String email = rs.getString("email");
            String password = rs.getString("password");
            String Cpassword = rs.getString("Cpassword");
            String mobile = rs.getString("mobile");            
            user = new user(id,role, first, last, email,password,Cpassword,mobile);
        }
    } catch (SQLException e) {
        printSQLException(e);
    }
    return user;
}
public List < user > selectAllUsers() {

    // using try-with-resources to avoid closing resources (boiler plate code)
    List < user > users = new ArrayList < > ();
    // Step 1: Establishing a Connection
    try (Connection connection = getConnection();

        // Step 2:Create a statement using connection object
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
        System.out.println(preparedStatement);
        // Step 3: Execute the query or update query
        ResultSet rs = preparedStatement.executeQuery();

        // Step 4: Process the ResultSet object.
        while (rs.next()) {
            int id = rs.getInt("id");
            String role = rs.getString("role");
            String first = rs.getString("first");
            String last = rs.getString("last");
            String email = rs.getString("email");
            String password = rs.getString("password");
            String Cpassword = rs.getString("Cpassword");
            String mobile = rs.getString("mobile");            
            users = new users(id,role, first, last, email,password,Cpassword,mobile);        }
    } catch (SQLException e) {
        printSQLException(e);
    }
    return users;
}
public boolean deleteUser(int id) throws SQLException {
    boolean rowDeleted;
    try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
        statement.setInt(1, id);
        rowDeleted = statement.executeUpdate() > 0;
    }
    return rowDeleted;
}
private void printSQLException(SQLException ex) {
    for (Throwable e: ex) {
        if (e instanceof SQLException) {
            e.printStackTrace(System.err);
            System.err.println("SQLState: " + ((SQLException) e).getSQLState());
            System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
            System.err.println("Message: " + e.getMessage());
            Throwable t = ex.getCause();
            while (t != null) {
                System.out.println("Cause: " + t);
                t = t.getCause();
            }
        }
    }
}
}