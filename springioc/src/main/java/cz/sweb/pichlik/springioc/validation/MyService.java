/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springioc.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyService {

    @Autowired
    private Validator validator;

    public void doSomethingWithPerson(Person person){
        Set<ConstraintViolation<Person>> resultOfValidation = validator.validate(person);
        for (ConstraintViolation<Person> constraintViolation : resultOfValidation) {
            throw new IllegalArgumentException(constraintViolation.getMessage());
        }
    }
}
