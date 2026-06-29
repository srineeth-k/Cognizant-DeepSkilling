package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("=== Running Exercise 7: Implementing Constructor and Setter Injection ===");

        // Load the Spring Context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("[Main] Spring context successfully loaded.\n");

        // 1. Retrieve the Constructor-injected BookService bean
        System.out.println("[Main] Retrieving bookServiceConstructor...");
        BookService constructorService = (BookService) context.getBean("bookServiceConstructor");
        constructorService.displayInjectionDetails();
        System.out.println();

        // 2. Retrieve the Setter-injected BookService bean
        System.out.println("[Main] Retrieving bookServiceSetter...");
        BookService setterService = (BookService) context.getBean("bookServiceSetter");
        setterService.displayInjectionDetails();

        System.out.println("=== Exercise 7 Completed Successfully ===\n");
    }
}
