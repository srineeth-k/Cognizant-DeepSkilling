package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private final String injectionType;

    // Default constructor for setter injection
    public BookService() {
        this.injectionType = "Setter Injection";
        System.out.println("[BookService] Default constructor invoked (prepared for Setter Injection).");
    }

    // Parameterized constructor for constructor injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        this.injectionType = "Constructor Injection";
        System.out.println("[BookService] Parameterized constructor invoked (Constructor Injection completed).");
    }

    // Setter method for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("[BookService] setBookRepository setter method invoked.");
    }

    public void displayInjectionDetails() {
        System.out.println("[BookService] Verifying wiring details for this bean:");
        System.out.println("  - Injection Type: " + injectionType);
        if (bookRepository != null) {
            bookRepository.fetchCatalog();
        } else {
            System.out.println("  - Error: bookRepository is null!");
        }
    }
}
