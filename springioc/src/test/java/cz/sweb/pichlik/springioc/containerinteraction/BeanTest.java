package cz.sweb.pichlik.springioc.containerinteraction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/applicationContext-containerinteraction.xml"})
public class BeanTest {

	@Test
	public void test() {
		//watch console output
	}
}
