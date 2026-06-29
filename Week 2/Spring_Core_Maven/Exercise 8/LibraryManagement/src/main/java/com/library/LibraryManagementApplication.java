package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("=== Running Exercise 8: Implementing Basic AOP with Spring ===");

        // Load the Spring Context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("[Main] Spring context loaded.\n");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Call service methods and check logs for AOP trigger confirmations
        bookService.addService();
        System.out.println();
        bookService.removeService();

        System.out.println("\n=== Exercise 8 Completed Successfully ===\n");
    }
}
