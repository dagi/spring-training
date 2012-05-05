package cz.sweb.pichlik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.springframework.util.Assert;

/**
 * Implementace {@link BookStoreDao} nad filesystemem.
 */
public class FileSystemBookStoreDao implements BookStoreDao{

    private File rootPath;

    /**
     * Vytvori novou instanci. Knihy budou ukladany/cteny z adresare uvedeneho
     * v konstruktoru. Pokud cilovy adresar neexistuje, bude vytvoren.
     *
     * @param rootPath cesta, ktera se pouzije pro ukladani cteni
     */
    public FileSystemBookStoreDao(File rootPath) {
        Assert.notNull(rootPath);
        if(!rootPath.exists()) {
            boolean dirCreated = rootPath.mkdir();
            if(!dirCreated) {
                throw new IllegalArgumentException("Cannot create directory on path " + rootPath.getPath());
            }
        }
        this.rootPath = rootPath;
    }

    /**
     * @see cz.sweb.pichlik.BookStoreDao#getBook(java.lang.Long)
     */
    public Book getBook(Long bookId) {
        Assert.notNull(bookId);
        Book book = null;
        ObjectInputStream iu = null;
        try {
            iu = new ObjectInputStream(new FileInputStream(getPathForBook(bookId)));
            book = (Book) iu.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(iu != null) {
                try {
                    iu.close();
                } catch (IOException e) {}
            }
        }
        return book;
    }

    public void saveBook(Book book) {
        Assert.notNull(book);
        ObjectOutputStream ou = null;
        try {
            Long bookId = book.getId();
            File pathForBook = getPathForBook(bookId);
            ou = new ObjectOutputStream(new FileOutputStream(pathForBook));
            ou.writeObject(book);
            ou.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(ou != null) {
                try {
                    ou.close();
                } catch (IOException e) {}
            }
        }

    }

    private File getPathForBook(Long bookId) {
        return new File(rootPath, String.valueOf(bookId));
    }
}
