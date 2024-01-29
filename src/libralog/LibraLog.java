/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libralog;

import java.sql.Connection;

/**
 *
 * @author Daniel
 */
public class LibraLog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Call the mycon method from the db class
        Connection connection = db.mycon();

        // Check if the connection is successful
        if (connection != null) {
            System.out.println("Database connection successful!");
            // Add your additional test logic here, if needed
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
    
}
