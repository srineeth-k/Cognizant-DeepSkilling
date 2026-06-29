package com.library.repository;

public class BookRepository {
    public void saveBook(String title) {
        System.out.println("[BookRepository] Saving book '" + title + "' to database.");
    }
    
    public void listAllBooks() {
        System.out.println("[BookRepository] Listing books: ['Design Patterns', 'Introduction to Java', 'Spring Core']");
    }
}
