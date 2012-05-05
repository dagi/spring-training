package cz.sweb.pichlik;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Helper {
	
	public static void toFile(String path, Book book) {
		ObjectOutputStream ou = null;
		try {
			ou = new ObjectOutputStream(new FileOutputStream(new File(path)));
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
	
	public static Book fromFile(String path) {
		Book book = null;
		ObjectInputStream iu = null;
		try {
			File file = new File(path);
			if(!file.exists()) {
				return null;
			}
			iu = new ObjectInputStream(new FileInputStream(file));
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
}
