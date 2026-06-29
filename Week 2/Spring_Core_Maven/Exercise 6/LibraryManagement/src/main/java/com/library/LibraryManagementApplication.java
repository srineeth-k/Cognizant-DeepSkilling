package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("=== Running Exercise 6: Configuring Beans with Annotations ===");

        // Load the Spring Context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("[Main] Spring context successfully loaded with component scanning.");

        // Retrieve the BookService bean (starts with lowercase by default)
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.manageCatalog();

        System.out.println("=== Exercise 6 Completed Successfully ===\n");
    }
}
