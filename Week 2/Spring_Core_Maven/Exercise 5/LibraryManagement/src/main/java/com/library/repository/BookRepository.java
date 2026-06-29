package com.library.repository;

public class BookRepository {
    public void getRepositoryInfo() {
        System.out.println("[BookRepository] IoC Container loaded repository metadata successfully.");
    }

    public void queryDatabase() {
        System.out.println("[BookRepository] Fetching records from database: ['Java: The Complete Reference', 'Head First Design Patterns']");
    }
}
