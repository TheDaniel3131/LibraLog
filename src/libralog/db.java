package libralog;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Database class for handling database connections.
 * 
 * @author Daniel
 */
public class db {
    
    // Method to establish a database connection
    public static Connection mycon() {
        Connection con = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Define your database URL, user, and password
            String dbUrl = "jdbc:mysql://localhost:3306/libralog";
            String dbUser = "root";
            String dbPassword = "";
            
            // Establish the database connection
            con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (Exception e) {
            e.printStackTrace(); // Print the exception details for debugging
        }
        
        return con;
    }
}
