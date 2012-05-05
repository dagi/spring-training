
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cz.sweb.pichlik.ReservationService;
import cz.sweb.pichlik.User;


public class Client {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/testContext.xml");
		ReservationService reservationService = (ReservationService) applicationContext.getBean("client.reservationService");
		System.out.println(reservationService.reserveBook(new Long(2L),new Date(), new Date(), (User) null));;
	}

}
