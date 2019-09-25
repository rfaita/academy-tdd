package com.academy.tests.domain;

public class BookBuilder {
    private String id;
    private String name;
    private String isbn;

    private BookBuilder() {

    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    public BookBuilder id(String id) {
        this.id = id;
        return this;
    }

    public BookBuilder name(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public Book build() {
        return new Book(id, name, isbn);
    }
}