package cz.sweb.pichlik;

public class ReservationNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private Long reservationId;

    public ReservationNotFoundException(Long reservationId) {
        super();
        this.reservationId = reservationId;
    }

    public Long getReservationId() {
        return reservationId;
    }
}
