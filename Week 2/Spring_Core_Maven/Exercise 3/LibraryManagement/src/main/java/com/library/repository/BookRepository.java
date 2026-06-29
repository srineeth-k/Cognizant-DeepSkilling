package com.library.repository;

public class BookRepository {
    public void saveBook(String title) {
        try {
            // Simulate database operation delay
            Thread.sleep(80);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("[BookRepository] Saved book '" + title + "' to database.");
    }
    
    public void listAllBooks() {
        try {
            // Simulate database operation delay
            Thread.sleep(120);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("[BookRepository] Fetching book list from database.");
    }
}
