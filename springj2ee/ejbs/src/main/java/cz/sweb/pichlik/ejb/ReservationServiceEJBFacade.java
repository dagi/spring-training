package cz.sweb.pichlik.ejb;
import java.util.Date;

import javax.ejb.CreateException;
import javax.ejb.SessionContext;

import org.springframework.context.access.ContextSingletonBeanFactoryLocator;
import org.springframework.ejb.support.AbstractStatelessSessionBean;

import cz.sweb.pichlik.ReservationService;
import cz.sweb.pichlik.User;


public class ReservationServiceEJBFacade extends AbstractStatelessSessionBean implements ReservationService {
	
	private static final long serialVersionUID = 1L;

	private ReservationService reservationService;

	@Override
	protected void onEjbCreate() throws CreateException {
		reservationService = (ReservationService) getBeanFactory().getBean("reservationService", ReservationService.class);	
	}

	public boolean reserveBook(Long bookId, Date from, Date to, User user) {		
		return reservationService.reserveBook(bookId, from, to, user);
	}

	@Override
	public void setSessionContext(SessionContext sessionContext) {
	       super.setSessionContext(sessionContext);
	       setBeanFactoryLocator(ContextSingletonBeanFactoryLocator.getInstance("classpath*:META-INF/beanRefContext.xml"));
	       setBeanFactoryLocatorKey("businessBeanFactory");
	}	
}
