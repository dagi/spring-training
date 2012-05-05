package cz.sweb.pichlik;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;

import org.junit.Before;
import org.junit.Test;


public class FileSystemBookStoreDaoTest {

    private File rootPath;

    @Before
    public void setUp() {
        rootPath = new File(new File(System.getProperty("java.io.tmpdir")), "test");
        if(rootPath.exists()) {
            rootPath.delete();
        }
        rootPath.mkdir();
    }

    @Test
    public void testSaveGet() throws Exception{
        Book book = new Book(1L, "J2EE Design and Development", "Rod Johnson");
        FileSystemBookStoreDao fileSystemBookStoreDao = new FileSystemBookStoreDao(rootPath);
        fileSystemBookStoreDao.saveBook(book);
        Book book2 = fileSystemBookStoreDao.getBook(1L);
        assertThat(book, is(book2));
    }
}
