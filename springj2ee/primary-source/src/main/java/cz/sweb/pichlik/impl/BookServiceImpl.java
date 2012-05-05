package cz.sweb.pichlik.impl;

import java.io.File;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import cz.sweb.pichlik.Book;
import cz.sweb.pichlik.BookService;
import cz.sweb.pichlik.Helper;

@Repository
public class BookServiceImpl implements BookService {
	
	public String tmpDir;
	
	public BookServiceImpl() {
		 tmpDir =  System.getProperty("java.io.tmpdir");
		 if(!tmpDir.endsWith(File.separator)) {
			 tmpDir += File.separator;
		 }
	}	
	
	@PostConstruct
	public void generateSomeBooks() {
		Helper.toFile(tmpDir + "1", new Book(1L, "J2EE design and development", "Rod Johnson"));
	}

	public Book getBook(Long bookId) {
		
		return Helper.fromFile(tmpDir +  bookId);		
	}

}
