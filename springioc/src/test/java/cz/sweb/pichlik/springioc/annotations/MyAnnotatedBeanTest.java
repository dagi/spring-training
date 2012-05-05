package cz.sweb.pichlik.springioc.annotations;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-ann.xml"})
public class MyAnnotatedBeanTest {

	@Autowired
	private MyAnnotatedBean myBean;
	
	@Test
	public void testWiring() {		
		assertThat(myBean.getDependencyA(), notNullValue());
	}
}
