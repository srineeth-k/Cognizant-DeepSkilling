package com.library.repository;

public class BookRepository {
    public void save() {
        System.out.println("[BookRepository] Database: Saved record successfully.");
    }

    public void delete() {
        System.out.println("[BookRepository] Database: Deleted record successfully.");
    }
}
