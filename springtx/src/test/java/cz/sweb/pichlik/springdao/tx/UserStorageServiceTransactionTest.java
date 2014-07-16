package cz.sweb.pichlik.springdao.tx;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cz.sweb.pichlik.springdao.User;
import cz.sweb.pichlik.springdao.UserStorageDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/daoContext-hibernateTx.xml"})
public class UserStorageServiceTransactionTest {

    private static final long JOE_ID = 999l;

    @Autowired
    private UserStorageDao userStorageDao;

    @Autowired
    private UserStorageService userStorageService;

    private User userJane = new User();
    private User userJoe = new User();

    @Before
    public void setUp() {
        userJane.setName("Jane");
        userJane.setEmail("jane@example.com");
        userJane.setName("Joe");
        userJane.setEmail("joe@example.com");
        userJoe.setId(JOE_ID);
    }

    @Test
    public void testTransactionRollback() {
        userStorageDao.save(userJane); //make future conflict
        try {
            userStorageService.saveUsers(Arrays.asList(userJoe, userJane));
        } catch(DataAccessException e) {
            //expected
        }
        assertThat("Joe a Jane musi byt vytvoreni oba nebo ani jeden z nich", userStorageDao.get(JOE_ID), nullValue());
    }
}
