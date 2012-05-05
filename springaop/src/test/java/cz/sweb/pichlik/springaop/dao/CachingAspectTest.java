/*
 * Copyright (C) 2007-2010, GoodData(R) Corporation. All rights reserved.
 */

package cz.sweb.pichlik.springaop.dao;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/profilingContext-aspectjdef.xml"})
public class CachingAspectTest {

    @Autowired
    private UserStorageDao userStorageDao;
    @Autowired
    private CachingAspect cachingAspect;

    @Test
    public void testClearCache() {
        userStorageDao.get(1);
        userStorageDao.get(2);
        userStorageDao.save(new User());
        assertThat(cachingAspect.getCacheHitCounter(), is(0));
    }

    @Test
    public void testPopulateCache() {
        userStorageDao.get(1);//populate cache
        userStorageDao.get(1);//get from cache
        assertThat(cachingAspect.getCacheHitCounter(), is(1));
    }

}
