package cz.sweb.pichlik.impl;

import cz.sweb.pichlik.Reservation;

public class ReservationImpl implements Reservation {
    private Long reservationId;
    private Long bookId;

    @Override
    public Long getBookId() {
        return bookId;
    }

    @Override
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public Long getReservationId() {
        return reservationId;
    }

    @Override
    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }
}
