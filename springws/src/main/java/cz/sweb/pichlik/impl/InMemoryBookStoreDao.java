/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.impl;

import java.util.HashMap;
import java.util.Map;

import cz.sweb.pichlik.Book;
import cz.sweb.pichlik.BookStoreDao;

/**
 * In-memory implementace {@link BookStoreDao}
 *
 */
public class InMemoryBookStoreDao implements BookStoreDao{

    private Map<Long, Book> bookHolder = new HashMap<Long, Book>();

    @Override
    public Book getBook(Long bookId) {
        return bookHolder.get(bookId);
    }

    @Override
    public void saveBook(Book book) {
        bookHolder.put(book.getId(), book);
    }

}
