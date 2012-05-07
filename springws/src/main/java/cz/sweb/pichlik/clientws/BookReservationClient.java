/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.clientws;

import java.io.StringReader;

import javax.xml.transform.stream.StreamSource;

import org.jdom.Document;
import org.jdom.Namespace;
import org.jdom.transform.JDOMResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import cz.sweb.pichlik.Book;

@Component
public class BookReservationClient {

    private final Namespace namespace = Namespace.getNamespace("rs", "http://dagblog.cz/BookReservation");

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    private static final String MESSAGE = "<sch:BookReservationRequest xmlns:sch=\"http://dagblog.cz/BookReservation/schema\"><rs:bookId xmlns:rs=\"http://dagblog.cz/BookReservation\">1</rs:bookId></sch:BookReservationRequest>";

    public Book book(long bookId) {
        StreamSource source = new StreamSource(new StringReader(MESSAGE));
        JDOMResult jdomResult = new JDOMResult();
        webServiceTemplate.sendSourceAndReceiveToResult(source, jdomResult);
        Document document = jdomResult.getDocument();
        String id = document.getRootElement().getChild("id", namespace).getValue();
        String name = document.getRootElement().getChild("name", namespace).getValue();
        String author = document.getRootElement().getChild("author", namespace).getValue();
        return new Book(Long.valueOf(id), name, author);
    }
}
