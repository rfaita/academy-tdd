package com.academy.tests;

import com.academy.tests.domain.Book;

import java.util.List;

public interface BookStore {

    Book add(Book book);

    void remove(Book book);

    Book findById(String id);

    List<Book> findAll();

    List<Book> findAllByName(String name);



}
