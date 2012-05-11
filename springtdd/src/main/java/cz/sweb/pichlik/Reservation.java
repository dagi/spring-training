package cz.sweb.pichlik;

public interface Reservation {

    public abstract Long getBookId();

    public abstract void setBookId(Long bookId);

    public abstract Long getReservationId();

    public abstract void setReservationId(Long reservationId);

}