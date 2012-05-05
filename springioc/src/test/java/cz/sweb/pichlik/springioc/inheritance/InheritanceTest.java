package cz.sweb.pichlik.springioc.inheritance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-inheritance.xml"})
public class InheritanceTest {
	
	@Autowired
	private BeanA beanA;
	
	@Autowired
	private BeanB beanB;
	
	@Test
	public void testInheritance() {
		assertThat(beanA.getSharedProperty(), is("foo"));
		assertThat(beanB.getSharedProperty(), is("foo"));		
		assertThat(beanA.getSpecificPropertyX(), is("x"));
		assertThat(beanB.getSpecificPropertyY(), is("y"));
	}
}
