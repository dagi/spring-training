package cz.sweb.pichlik;

/**
 * Implementace tohoto rozhrani slouzi k ukladani/ziskavani knih z/do datoveho zdroje.
 */
public interface BookStoreDao {

    /**
     * Vraci knihu podle identifikatoru.
     *
     * @param bookId identifikator knihy
     * @return kniha a nebo <code>null</code> pokud neexistuje
     */
    public Book getBook(Long bookId);


    /**
     * Uklada knihu.
     *
     * @param book kniha k ulozeni
     */
    public void saveBook(Book book);
}
