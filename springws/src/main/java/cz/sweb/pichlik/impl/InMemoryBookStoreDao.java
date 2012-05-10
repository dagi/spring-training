/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import cz.sweb.pichlik.BookStoreDao;
import cz.sweb.pichlik.Book;

/**
 * In-memory implementace {@link BookStoreDao}
 *
 */
@Repository
public class InMemoryBookStoreDao implements BookStoreDao{

    @Resource(name="preparedBooks")
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
