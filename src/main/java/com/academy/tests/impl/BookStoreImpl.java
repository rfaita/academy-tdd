package com.academy.tests.impl;

import com.academy.tests.BookStore;
import com.academy.tests.domain.Book;
import com.academy.tests.domain.BookBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class BookStoreImpl implements BookStore {

    private List<Book> books = new ArrayList<>();

    private Book setIdToBook(Book book) {
        if (book.getId() == null || book.getId().isEmpty()) {
            return BookBuilder.builder()
                    .id(UUID.randomUUID().toString())
                    .name(book.getName())
                    .isbn(book.getIsbn())
                    .build();
        } else {
            return book;
        }
    }

    @Override
    public Book add(Book book) {
        Book bookToSave = setIdToBook(book);
        this.books.add(bookToSave);
        return bookToSave;
    }

    @Override
    public void remove(Book bookToRemove) {

    }

    @Override
    public Book findById(String id) {
        if (id != null) {
            for (Book book : this.books) {
                if (id.equalsIgnoreCase(book.getId())) {
                    return book;
                }
            }
        }
        return null;
//        return this.books.stream()
//                .filter(book -> id.equalsIgnoreCase(book.getId()))
//                .findFirst()
//                .orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findAllByName(String name) {
        return null;
    }
}
