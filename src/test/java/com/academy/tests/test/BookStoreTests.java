package com.academy.tests.test;

import com.academy.tests.BookStore;
import com.academy.tests.domain.Book;
import com.academy.tests.impl.BookStoreImpl;
import org.junit.Assert;
import org.junit.Test;

import static com.academy.tests.helper.BookHelper.*;

public class BookStoreTests {




    @Test
    public void createNewBookWithIdWithSuccess(){

        //setUp
        Book bookWithId = createBookWithIdNameISBN("1", "test", "12345");

        
        //execution
        BookStore bookStore = new BookStoreImpl();

        Book ret = bookStore.add(bookWithId);


        //asserts

        Assert.assertEquals("1", ret.getId());
        Assert.assertEquals("test", ret.getName());
        Assert.assertEquals("123456", ret.getIsbn());

    }

}
