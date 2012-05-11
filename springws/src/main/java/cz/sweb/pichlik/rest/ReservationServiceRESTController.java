/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import cz.sweb.pichlik.Reservation;
import cz.sweb.pichlik.ReservationService;
import cz.sweb.pichlik.impl.ReservationImpl;

@Controller
public class ReservationServiceRESTController {

    @Autowired
    private ReservationService reservationService;

    @RequestMapping(value="/reservation", method=RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(value=HttpStatus.CREATED)
    public ReservationImpl reserveBook(@RequestBody ReservationImpl reservation) {
        Reservation reservedBook = reservationService.reserveBook(reservation.getBookId());
        return (ReservationImpl)reservedBook;
    }
}
