package cz.sweb.pichlik.springioc.cyclicdependency;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-cyclic.xml"})
public class CyclicDependencyTest {
	
	@Autowired
	private BeanA beanA;
	@Autowired
	private BeanB beanB;

	@Test	
	public void testCyclicDependency(){
		assertThat(beanA.getBeanB(), notNullValue());
		assertThat(beanB.getBeanA(), notNullValue());
	}
}
