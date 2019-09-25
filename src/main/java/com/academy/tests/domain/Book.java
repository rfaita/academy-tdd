package com.academy.tests.domain;

public class Book {

    private final String id;
    private final String name;
    private final String isbn;

    public Book(String id, String name, String isbn) {
        this.id = id;
        this.name = name;
        this.isbn = isbn;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }


}
