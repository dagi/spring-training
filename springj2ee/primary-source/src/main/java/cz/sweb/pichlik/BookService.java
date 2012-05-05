package cz.sweb.pichlik;


/**
 * Implementace tohoto rozhrani slouzi k ziskavani knih z nejakeho datoveho zdroje.
 */
public interface BookService {

	public Book getBook(Long bookId);
}
