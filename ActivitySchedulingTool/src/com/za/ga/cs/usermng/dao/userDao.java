package com.za.ga.cs.usermng.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.za.ga.cs.usermng.model.user;

public class userDao {
	 public  boolean registerUser(user user) throws ClassNotFoundException{
		 boolean status = false;
		 String INSERT_USERS_SQL="INSERT INTO userdata"+" (role,firstname,lastname,email,password,cpassword,mblnumber) VALUES"+"(?,?,?,?,?,?,?);";
		 
		 Class.forName("com.mysql.jdbc.Driver");
		 try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Scheduling?userSSL=false","root","");
				//create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			    preparedStatement.setInt(1,1);
			    preparedStatement.setString(1, user.getRole());
			    preparedStatement.setString(2, user.getFirst());
			    preparedStatement.setString(3, user.getLast() );
			    preparedStatement.setString(4, user.getEmail());
			    preparedStatement.setString(5, user.getPassword());
			    preparedStatement.setString(6, user.getCpassword());
			    preparedStatement.setString(7, user.getMblnumber());
		 System.out.println(preparedStatement);
		 //execute the query or update query
		 ResultSet rs= preparedStatement.executeQuery();
		 status = rs.next();
		 
		 }catch(SQLException e) {
			 printSQLException(e);
		 }
		 return status;
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
/*public void insertUser(user user) throws SQLException {
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
}*/
