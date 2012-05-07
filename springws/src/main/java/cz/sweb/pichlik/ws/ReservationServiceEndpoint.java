/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.ws;

import org.jdom.Element;
import org.jdom.Namespace;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import cz.sweb.pichlik.Book;

@Endpoint
public class ReservationServiceEndpoint {

    private static final String SCHEMA_NS = "http://dagblog.cz/BookReservation/schema";
    private final Namespace namespace = Namespace.getNamespace("rs", "http://dagblog.cz/BookReservation");

    @PayloadRoot(namespace = SCHEMA_NS, localPart = "BookReservationRequest")
    @ResponsePayload
    public Element bookRequest(@RequestPayload Element bookReservationRequest) throws Exception {
        Element bookIdElm = bookReservationRequest.getChild("bookId", namespace);

        Book book = new Book(0L, "name", "author");

        Element elmBook = new Element("Book", namespace);
        Element elmId = new Element("id", namespace);
        elmId.setText(book.getId().toString());
        Element elmName = new Element("name", namespace);
        elmName.setText(book.getName());
        Element elmAuthor = new Element("author", namespace);
        elmAuthor.setText(book.getAuthor());
        elmBook.addContent(elmId);
        elmBook.addContent(elmName);
        elmBook.addContent(elmAuthor);
        return elmBook;
    }
}
