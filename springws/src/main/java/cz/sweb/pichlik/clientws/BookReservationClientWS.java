package cz.sweb.pichlik.clientws;

import java.io.StringReader;

import javax.xml.transform.stream.StreamSource;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.transform.JDOMResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import cz.sweb.pichlik.Reservation;
import cz.sweb.pichlik.impl.ReservationImpl;

@Component
public class BookReservationClientWS {

    private final Namespace namespace =
            Namespace.getNamespace("rs", "http://dagblog.cz/BookReservation");

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    private static final String MESSAGE =
             "<sch:ClaimReservationRequest xmlns:sch=\"http://dagblog.cz/BookReservation/schema\">" +
             "  <rs:Reservation xmlns:rs=\"http://dagblog.cz/BookReservation\">" +
             "      <rs:bookId>1</rs:bookId>" +
             "  </rs:Reservation>" +
             "</sch:ClaimReservationRequest>";

    public Reservation reserveBook(long bookId) {
        StreamSource source = new StreamSource(new StringReader(MESSAGE));
        JDOMResult jdomResult = new JDOMResult();
        webServiceTemplate.sendSourceAndReceiveToResult(source, jdomResult);
        Document document = jdomResult.getDocument();
        Element reservationElement = document.getRootElement();
        Long reservationId = Long.valueOf(reservationElement.getChild("reservationId",namespace).getValue());
        Long bookIdRet = Long.valueOf(reservationElement.getChild("bookId",namespace).getValue());
        ReservationImpl reservationImpl = new ReservationImpl();
        reservationImpl.setBookId(bookIdRet);
        reservationImpl.setReservationId(reservationId);
        return reservationImpl;
    }
}
