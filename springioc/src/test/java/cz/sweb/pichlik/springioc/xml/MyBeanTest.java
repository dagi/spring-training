package cz.sweb.pichlik.springioc.xml;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cz.sweb.pichlik.springioc.xml.MyBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-oldstyle.xml"})
public class MyBeanTest {
	
	@Autowired
	@Qualifier(value="myBeanSetterInjection")
	private MyBean myBeanSetterInjection;
	
	@Autowired
	@Qualifier(value="myBeanConstructorInjection")
	private MyBean myBeanConstructorInjection;
		
	@Test
	public void testXMLwiring() {
		assertThat(myBeanConstructorInjection.getDependencyA(), notNullValue());
		assertThat(myBeanSetterInjection.getDependencyA(), notNullValue());
	}
}
