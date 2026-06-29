package com.library.repository;

public class BookRepository {
    public void connect() {
        System.out.println("[BookRepository] Connecting to the Book Database...");
    }
    
    public void getBooks() {
        System.out.println("[BookRepository] Fetching books: ['Spring Core in Action', 'Clean Code', 'Introduction to Algorithms']");
    }
}
