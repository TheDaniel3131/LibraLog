/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libralog;

import java.sql.*;

/**
 *
 * @author Daniel
 */
public class BookManagement {
    // Connection details, update these with your database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/libralog";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static void viewBooks() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM books";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        // You can customize how you want to display the book information
                        System.out.println("Book ID: " + resultSet.getInt("book_id"));
                        System.out.println("Title: " + resultSet.getString("title"));
                        System.out.println("Author: " + resultSet.getString("author"));
                        System.out.println("Copies Available: " + resultSet.getInt("copies_available"));
                        System.out.println("--------------------");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to view books.");
        }
    }
    
    public static int addBook(String title, String author, int copies) {
        int generatedBookID = -1; // Initialize with a default value

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO books (title, author, copies_available) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setString(1, title);
                preparedStatement.setString(2, author);
                preparedStatement.setInt(3, copies);
                preparedStatement.executeUpdate();

                // Retrieve the generated book ID
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        generatedBookID = generatedKeys.getInt(1);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to add book.");
        }

        return generatedBookID;
    }
   
    public static Book getBookDetails(int bookID) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM books WHERE book_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, bookID);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        // Retrieve book details from the result set
                        String title = resultSet.getString("title");
                        String author = resultSet.getString("author");
                        int copiesAvailable = resultSet.getInt("copies_available");

                        // Create and return a Book object with the details
                        return new Book(bookID, title, author, copiesAvailable);
                    } else {
                        // Book with the given ID not found
                        return null;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to get book details.");
            return null;
        }
    }
    
    public static void deleteBook(int bookId) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "DELETE FROM books WHERE book_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, bookId);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Book deleted successfully.");
                } else {
                    System.out.println("No book found with the given ID.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to delete book.");
        }
    }

    public static void modifyBook(int bookID, String title, String author, int copies) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "UPDATE books SET title = ?, author = ?, copies_available = ? WHERE book_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, title);
                preparedStatement.setString(2, author);
                preparedStatement.setInt(3, copies);
                preparedStatement.setInt(4, bookID);
                preparedStatement.executeUpdate();
                System.out.println("Book modified successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to modify book.");
        }
    }
}