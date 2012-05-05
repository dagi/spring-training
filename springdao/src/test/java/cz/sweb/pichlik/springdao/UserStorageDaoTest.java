package cz.sweb.pichlik.springdao;

import static org.junit.Assert.assertNotNull;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/daoContext-jdbc.xml"})
public class UserStorageDaoTest {

    @Autowired
    private UserStorageDao userStorageDao;
    @Autowired
    private DataSource dataSource;

    @Before
    public void setUp(){
        try {
            ResultSet rs = dataSource.getConnection().getMetaData().getTables(null, null, "USER", null);
            boolean userTableExists = rs.next();
            if(!userTableExists){
                JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
                jdbcTemplate.execute("create table User ( id INTEGER IDENTITY, name VARCHAR(256), email VARCHAR(256) )");
                jdbcTemplate.update("insert into User (id, name, email) values(1, 'john', 'doe')");
            }
        } catch (SQLException e) {}
    }

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
