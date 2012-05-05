package cz.sweb.pichlik;


import java.util.Date;


/**
 * Implementace tohoto rozhrani slouzi k rezervaci knih.
 * 
 */
public interface ReservationService {

	
	public boolean reserveBook(Long bookId, Date from, Date to, User user);	
	
}
