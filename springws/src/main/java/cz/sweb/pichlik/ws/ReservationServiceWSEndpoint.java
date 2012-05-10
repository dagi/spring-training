/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.ws;

import org.jdom.Element;
import org.jdom.Namespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import cz.sweb.pichlik.Reservation;
import cz.sweb.pichlik.ReservationService;

@Endpoint
public class ReservationServiceWSEndpoint {

    private static final String SCHEMA_NS = "http://dagblog.cz/BookReservation/schema";
    private static final Namespace namespace = Namespace.getNamespace("rs", "http://dagblog.cz/BookReservation");

    @Autowired
    private ReservationService reservationService;

    @PayloadRoot(namespace = SCHEMA_NS, localPart = "ClaimReservationRequest")
    @ResponsePayload
    public Element bookRequest(@RequestPayload Element bookReservationRequest) throws Exception {
        Element bookIdElm = bookReservationRequest.getChild("Reservation", namespace).getChild("bookId", namespace);
        Long bookId = Long.valueOf(bookIdElm.getValue());
        Reservation reservation = reservationService.reserveBook(bookId);

        Element elmReservation = new Element("Reservation", namespace);
        Element elmId = new Element("reservationId", namespace);
        elmId.setText(reservation.getReservationId().toString());
        elmReservation.addContent(elmId);
        Element bookElement = new Element("bookId", namespace);
        bookElement.setText(reservation.getBookId().toString());
        elmReservation.addContent(bookElement);
        return elmReservation;
    }
}
