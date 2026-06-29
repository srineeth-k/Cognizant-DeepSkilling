package com.library;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
    }

    // Bean to seed test books into H2 database upon application startup
    @Bean
    public CommandLineRunner initDatabase(BookRepository repository) {
        return args -> {
            System.out.println("=== Seeding Initial Books into Database ===");
            repository.save(new Book("Spring Boot in Action", "Craig Walls"));
            repository.save(new Book("Clean Code", "Robert C. Martin"));
            repository.save(new Book("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"));
            System.out.println("Seeded database records. Count: " + repository.count());
            System.out.println("=== Spring Boot Ready ===");
        };
    }
}
