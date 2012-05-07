/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.impl;

import cz.sweb.pichlik.Book;
import cz.sweb.pichlik.BookStoreDao;
import cz.sweb.pichlik.ReservationService;

public class ReservationServiceImpl implements ReservationService{
    private BookStoreDao bookStoreDao;

    @Override
    public boolean reserveBook(Long bookId) {
        Book book = bookStoreDao.getBook(bookId);
        return (book != null);
    }

}
