/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libralog;

/**
 *
 * @author Daniel
 */
public class Book {

    private int bookID;
    private String title;
    private String author;
    private int copiesAvailable;

    public Book(int bookID, String title, String author, int copiesAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }
}
