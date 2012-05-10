package cz.sweb.pichlik;

import java.util.List;


/**
 * Implementace tohoto rozhrani slouzi k rezervaci knih.
 *
 */
public interface ReservationService {

    /**
     * Provede rezervaci knihy. Kniha muze byt zarezervovana pouze pokud existuje.
     *
     * @return true pokud se rezervace podari, jinak false
     */
    public Reservation reserveBook(Long bookId);

    /**
     * Vraci seznam rezervaci.
     * @return seznam rezervaci
     */
    public List<Reservation> getReservations();

    /**
     * Vrci konkretni rezervaci
     * @param reservationId rezervace
     * @return rezervace
     */
    public Reservation getReservation(Long reservationId);

    /**
     * Odstranuje rezervaci
     * @param reservationId rezervace
     */
    public void removeReservation(Long reservationId);
}
