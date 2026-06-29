package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addService() {
        System.out.println("[BookService] Service: Adding a new book record.");
        bookRepository.save();
    }

    public void removeService() {
        System.out.println("[BookService] Service: Removing an existing book record.");
        bookRepository.delete();
    }
}
