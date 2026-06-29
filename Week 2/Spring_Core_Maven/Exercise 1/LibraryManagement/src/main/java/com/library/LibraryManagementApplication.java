package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;
import com.library.repository.BookRepository;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("=== Running Exercise 1: Configuring a Basic Spring Application ===");
        
        // 1. Load the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("[Main] Spring context successfully loaded.");

        // 2. Retrieve the BookRepository bean
        BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
        bookRepository.connect();
        bookRepository.getBooks();

        // 3. Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.manageBooks();

        System.out.println("=== Exercise 1 Completed Successfully ===\n");
    }
}
