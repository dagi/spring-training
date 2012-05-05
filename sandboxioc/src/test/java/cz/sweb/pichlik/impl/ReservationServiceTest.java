package cz.sweb.pichlik.impl;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import cz.sweb.pichlik.Book;
import cz.sweb.pichlik.FileSystemBookStoreDao;
import cz.sweb.pichlik.ReservationService;

public class ReservationServiceTest {
    private ReservationService reservationService;
    private final File rootPath  = new File(new File(System.getProperty("java.io.tmpdir")), "test");

    @Before
    public void setUp() {
        this.reservationService  = null;
        /*
         * TODO
         * 1. zkonfigurujte instanci ReservationService, aby pouzivala rootPath
         */
        if(reservationService == null) {
            throw new UnsupportedOperationException("TODO 1: zkonfigurujte instanci ReservationService, aby pouzivala rootPath");
        }

        FileSystemBookStoreDao dao = new FileSystemBookStoreDao(rootPath);
        Book book = new Book(1L, "J2EE Design and Development", "Rod Johnson");
        dao.saveBook(book);
    }

    @Test
    public void testReserveBook() {
        boolean reserved = reservationService.reserveBook(1L);
        assertThat(reserved, is(true));
        reserved = reservationService.reserveBook(2L);
        assertThat(reserved, is(false));
    }

}
