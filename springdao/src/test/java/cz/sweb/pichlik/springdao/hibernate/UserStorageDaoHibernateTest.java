package cz.sweb.pichlik.springdao.hibernate;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cz.sweb.pichlik.springdao.User;
import cz.sweb.pichlik.springdao.UserStorageDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/daoContext-hibernate.xml"})
public class UserStorageDaoHibernateTest {

    @Autowired
    private UserStorageDao userStorageDao;

    @Test
    public void testAll() {
        User user = new User();
        user.setName("John");
        user.setEmail("john@example.com");
        userStorageDao.save(user);
        User userFromDb = userStorageDao.get(user.getId());
        assertNotNull(userFromDb);
        userStorageDao.delete(userFromDb);
    }
}
