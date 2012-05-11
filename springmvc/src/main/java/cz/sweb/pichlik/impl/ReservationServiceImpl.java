package cz.sweb.pichlik.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import cz.sweb.pichlik.Book;
import cz.sweb.pichlik.BookNotFoundException;
import cz.sweb.pichlik.BookStoreDao;
import cz.sweb.pichlik.Reservation;
import cz.sweb.pichlik.ReservationNotFoundException;
import cz.sweb.pichlik.ReservationService;

public class ReservationServiceImpl implements ReservationService{
    private BookStoreDao bookStoreDao;
    private AtomicLong counter = new AtomicLong();
    private Map<Long, Reservation> reservations = new HashMap<Long, Reservation>();

    @Override
    public Reservation reserveBook(Long bookId) {
        Book book = bookStoreDao.getBook(bookId);
        if(book == null) {
            throw new BookNotFoundException(bookId);
        }
        ReservationImpl reservationImpl = new ReservationImpl();
        reservationImpl.setReservationId(counter.incrementAndGet());
        reservationImpl.setBookId(bookId);
        reservations.put(reservationImpl.getReservationId(), reservationImpl);
        return reservationImpl;
    }

    @Override
    public List<Reservation> getReservations() {
        return new ArrayList<Reservation>(reservations.values());
    }

    @Override
    public Reservation getReservation(Long reservationId) {
        Reservation reservation = reservations.get(reservationId);
        if(reservation == null) {
            throw new ReservationNotFoundException(reservationId);
        }
        return reservation;
    }

    @Override
    public void removeReservation(Long reservationId) {
        Reservation reservation = getReservation(reservationId);
        reservations.remove(reservation);
    }

    public void setBookStoreDao(BookStoreDao bookStoreDao) {
        this.bookStoreDao = bookStoreDao;
    }
}
