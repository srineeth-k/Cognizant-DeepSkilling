package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void registerBook(String title) {
        System.out.println("[BookRepository] Cataloging book: '" + title + "' using Annotation Config.");
    }

    public void showCatalog() {
        System.out.println("[BookRepository] Listing catalog: ['Thinking in Java', 'Test Driven Development']");
    }
}
