package DataBase;

import java.sql.*;
import javax.swing.*;


public class MySql {
    Connection con=null;
    
    public static Connection ConnectDB(){
        try{
            
            final String str = "com.mysql.jdbc.Driver";
            final String url = "jdbc:http://localhost:3306/timetablemanagementsystem";

            Class.forName(str);
            final Connection conn = DriverManager.getConnection(url, "root", "");
            // JOptionPane.showMessageDialog(null, "connected to database");
            return conn;
        } catch (final Exception e) {
            JOptionPane.showMessageDialog(null, "inside catch ");
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
   
}
