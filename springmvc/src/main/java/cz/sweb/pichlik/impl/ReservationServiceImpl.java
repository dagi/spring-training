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
    private Map<Long, Reservation> resevations = new HashMap<Long, Reservation>();

    @Override
    public Reservation reserveBook(Long bookId) {
        Book book = bookStoreDao.getBook(bookId);
        if(book == null) {
            throw new BookNotFoundException(bookId);
        }
        ReservationImpl reservationImpl = new ReservationImpl();
        reservationImpl.setReservationId(counter.incrementAndGet());
        reservationImpl.setBookId(bookId);
        return reservationImpl;
    }

    @Override
    public List<Reservation> getReservations() {
        return new ArrayList<Reservation>(resevations.values());
    }

    @Override
    public Reservation getReservation(Long reservationId) {
        Reservation reservation = resevations.get(reservationId);
        if(reservation == null) {
            throw new ReservationNotFoundException(reservationId);
        }
        return reservation;
    }

    @Override
    public void removeReservation(Long reservationId) {
        Reservation reservation = getReservation(reservationId);
        resevations.remove(reservation);
    }
}
