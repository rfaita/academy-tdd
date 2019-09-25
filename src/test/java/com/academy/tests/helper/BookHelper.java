package com.academy.tests.helper;

import com.academy.tests.domain.Book;
import com.academy.tests.domain.BookBuilder;

public class BookHelper {

    public static Book createBookWithIdNameISBN(String id, String name, String isbn) {
        return BookBuilder.builder()
                .id(id)
                .name(name)
                .isbn(isbn)
                .build();
    }

    public static Book createBookWithNameISBN(String name, String isbn) {
        return BookBuilder.builder()
                .name(name)
                .isbn(isbn)
                .build();
    }

}
