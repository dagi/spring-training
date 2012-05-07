package cz.sweb.pichlik;


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
    public boolean reserveBook(Long bookId);
}
