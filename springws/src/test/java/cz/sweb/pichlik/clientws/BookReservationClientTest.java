/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.clientws;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cz.sweb.pichlik.clientws.BookReservationClient;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/client/clientApplicationContext.xml")
public class BookReservationClientTest {

    @Autowired
    private BookReservationClient bookReservationClient;

    @Test
    public void testBook() {
        assertThat(bookReservationClient.book(1l), notNullValue());
    }

}
