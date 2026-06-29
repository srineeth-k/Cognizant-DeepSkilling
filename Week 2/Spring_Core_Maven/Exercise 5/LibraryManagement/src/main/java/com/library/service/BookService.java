package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for BookRepository injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("[BookService] Injecting bookRepository bean via setter method.");
        this.bookRepository = bookRepository;
    }

    public void verifyContainerConfiguration() {
        System.out.println("[BookService] Testing configuration of wired beans...");
        bookRepository.getRepositoryInfo();
        bookRepository.queryDatabase();
    }
}
