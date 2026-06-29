package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("=== Running Exercise 2: Implementing Dependency Injection ===");

        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("[Main] Spring context successfully loaded.");

        // Retrieve BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Verify setter dependency injection was executed and works correctly
        bookService.registerNewBook("Effective Java");
        bookService.listAvailableBooks();

        System.out.println("=== Exercise 2 Completed Successfully ===\n");
    }
}
