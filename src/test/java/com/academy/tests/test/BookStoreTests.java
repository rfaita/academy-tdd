package com.academy.tests.test;

import com.academy.tests.BookStore;
import com.academy.tests.domain.Book;
import com.academy.tests.impl.BookStoreImpl;
import org.junit.Assert;
import org.junit.Test;

import static com.academy.tests.helper.BookHelper.*;

public class BookStoreTests {

    @Test
    public void createNewBookWithIdWithSuccess() {

        //setUp
        Book bookWithId = createBookWithIdNameISBN("1", "test", "12345");

        //execution
        BookStore bookStore = new BookStoreImpl();

        Book ret = bookStore.add(bookWithId);

        Book retFindById = bookStore.findById("1");

        //asserts

        Assert.assertEquals("1", ret.getId());
        Assert.assertEquals("test", ret.getName());
        Assert.assertEquals("12345", ret.getIsbn());

        Assert.assertEquals("1", retFindById.getId());
        Assert.assertEquals("test", retFindById.getName());
        Assert.assertEquals("12345", retFindById.getIsbn());

    }

    @Test
    public void createNewBookWithoutIdWithSuccess() {

        //setUp
        Book bookWithId = createBookWithNameISBN("test", "12345");

        //execution
        BookStore bookStore = new BookStoreImpl();

        Book ret = bookStore.add(bookWithId);

        Book retFindById = bookStore.findById(ret.getId());

        //asserts

        Assert.assertNotNull("The id must not be null", ret.getId());
        Assert.assertEquals("test", ret.getName());
        Assert.assertEquals("12345", ret.getIsbn());

        Assert.assertNotNull(retFindById.getId());
        Assert.assertEquals("test", retFindById.getName());
        Assert.assertEquals("12345", retFindById.getIsbn());

        Assert.assertEquals("Assert if id from add is equals to findById",
                ret.getId(), retFindById.getId());

    }

    @Test
    public void createNewBookWithEmptyIdWithSuccess() {

        //setUp
        Book bookWithId = createBookWithIdNameISBN("", "test", "12345");

        //execution
        BookStore bookStore = new BookStoreImpl();

        Book ret = bookStore.add(bookWithId);

        Book retFindById = bookStore.findById(ret.getId());

        //asserts

        Assert.assertNotNull("The id must not be null", ret.getId());
        Assert.assertEquals("test", ret.getName());
        Assert.assertEquals("12345", ret.getIsbn());

        Assert.assertNotNull(retFindById.getId());
        Assert.assertEquals("test", retFindById.getName());
        Assert.assertEquals("12345", retFindById.getIsbn());

        Assert.assertEquals("Assert if id from add is equals to findById",
                ret.getId(), retFindById.getId());

    }

}
