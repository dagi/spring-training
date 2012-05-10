/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.clientrest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cz.sweb.pichlik.Reservation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/client/clientApplicationContext.xml")
public class BookReservationClientRestTest {

    @Autowired
    private BookReservationClientRest bookReservationClientRest;

    @Test
    public void testReserveBook() {
        Reservation reserveBook = bookReservationClientRest.reserveBook(1L);
        assertThat(reserveBook, notNullValue());
        assertThat(reserveBook.getBookId(), is(1L));
    }

}
