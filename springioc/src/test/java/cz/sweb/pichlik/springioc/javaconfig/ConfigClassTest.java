package cz.sweb.pichlik.springioc.javaconfig;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:META-INF/applicationContext-javaconfig.xml")
public class ConfigClassTest {

    @Autowired
    private MyService myService;

    @Test
    public void testJavaConfig() {
        assertThat(myService.getDaoInterface(), is(JdbcDao.class));
    }
}
