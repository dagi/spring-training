/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springioc.validation;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-validation.xml"})
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    public void testDoSomethingWithNonValidPerson() {
        Person person = new Person(-1, null);
        try {
            myService.doSomethingWithPerson(person);
            fail("IllegalArgumentException is expected if the supplied object is not valid");
        } catch(IllegalArgumentException e) {
            //expected
        }
    }

    @Test
    public void testDoSomethingWithValidPerson() {
        try {
            Person person = new Person(10, new Address("Sokolovska", "Praha"));
            myService.doSomethingWithPerson(person);
        } catch(IllegalArgumentException e) {
            fail("IllegalArgumentException must not be thrown if the supplied object is valid");
        }
    }
}
