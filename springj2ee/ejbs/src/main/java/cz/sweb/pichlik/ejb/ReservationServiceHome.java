package cz.sweb.pichlik.ejb;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;

public interface ReservationServiceHome extends EJBLocalHome {

	public ReservationServiceLocal create() throws CreateException;
}
