package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("[BookService] Setter called: Injecting BookRepository dependency.");
        this.bookRepository = bookRepository;
    }

    public void registerNewBook(String title) {
        System.out.println("[BookService] Registering new book: " + title);
        bookRepository.saveBook(title);
    }

    public void listAvailableBooks() {
        System.out.println("[BookService] Requesting list of available books...");
        bookRepository.listAllBooks();
    }
}
