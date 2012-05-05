package cz.sweb.pichlik.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.sweb.pichlik.Book;
import cz.sweb.pichlik.BookService;
import cz.sweb.pichlik.ReservationService;
import cz.sweb.pichlik.User;

@Service(value="reservationService")
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private BookService bookService;

	public boolean reserveBook(Long bookId, Date from, Date to, User user) {
		Book book = bookService.getBook(bookId);
		if(book == null) {
			throw new RuntimeException("Sorry, the book doesn't exist");
		}
		return true;
	}
}
