package cz.sweb.pichlik;

public class BookNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private Long bookId;

    public BookNotFoundException(Long bookId) {
        super();
        this.bookId = bookId;
    }

    public Long getBookId() {
        return bookId;
    }

}
