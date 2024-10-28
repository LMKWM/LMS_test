// File: models/Book.java
package models;

public class Book extends LibraryItem implements Borrowable {
    private String author;
    private String isbn;
    private boolean available = true;

    public Book(String id, String title, String author, String isbn) {
        super(id, title);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String getDetails() {
        return "Book - " + super.toString() + ", Author: " + author + ", ISBN: " + isbn;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public void returnItem() {
        available = true;
        System.out.println("Book returned successfully.");
    }
}
