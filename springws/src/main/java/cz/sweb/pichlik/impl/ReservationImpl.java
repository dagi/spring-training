package cz.sweb.pichlik.impl;

import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import cz.sweb.pichlik.Reservation;

@JsonTypeInfo(include=As.WRAPPER_OBJECT, use=Id.NAME)
@JsonTypeName("Reservation")
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
