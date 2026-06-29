package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void registerNewBook(String title) {
        System.out.println("[BookService] Requesting registration of book: " + title);
        bookRepository.saveBook(title);
    }

    public void listAvailableBooks() {
        System.out.println("[BookService] Requesting all available books...");
        bookRepository.listAllBooks();
    }
}
