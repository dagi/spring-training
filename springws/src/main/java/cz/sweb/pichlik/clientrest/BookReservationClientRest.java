/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.clientrest;

import java.net.URI;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import cz.sweb.pichlik.Reservation;
import cz.sweb.pichlik.impl.ReservationImpl;

@Component
public class BookReservationClientRest {
    @Autowired
    private RestTemplate restTemplate;

    public Reservation reserveBook(long bookId) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        ReservationImpl reservationImpl = new ReservationImpl();
        reservationImpl.setBookId(bookId);
        HttpEntity<ReservationImpl> requestEntity = new HttpEntity<ReservationImpl>(reservationImpl, headers);
        ResponseEntity<ReservationImpl> response = restTemplate.postForEntity(URI.create("http://localhost:8080/springws/rest/reservation/"), requestEntity, ReservationImpl.class);
        return response.getBody();
    }
}
