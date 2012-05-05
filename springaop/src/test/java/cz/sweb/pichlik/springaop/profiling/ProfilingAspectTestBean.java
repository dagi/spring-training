package cz.sweb.pichlik.springaop.profiling;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cz.sweb.pichlik.springaop.dao.UserStorageDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/profilingContext-springdef.xml"})
public class ProfilingAspectTestBean {
    @Autowired
    private UserStorageDao dao;

    @Test
    public void testProfiling() {
        //see console output
        dao.getAll();
        dao.get(1);
        dao.get(2);
    }
}
