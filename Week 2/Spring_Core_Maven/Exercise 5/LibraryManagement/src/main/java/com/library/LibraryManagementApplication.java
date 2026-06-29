package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("=== Running Exercise 5: Configuring the Spring IoC Container ===");

        // Load the Spring Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("[Main] Spring IoC Container has successfully initialized.");

        // Retrieve and test BookService
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.verifyContainerConfiguration();

        System.out.println("=== Exercise 5 Completed Successfully ===\n");
    }
}
