/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springioc.propertyeditor;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-propertyeditor.xml"})
public class BeanWithSpecialDateTest {
    @Autowired
    BeanWithSpecialDate beanWithSpecialDate;

    @Test
    public void testGetSpecialDateType() {
        final SpecialDateType specialDateType = beanWithSpecialDate.getSpecialDateType();
        assertThat(specialDateType, notNullValue());
    }

}
