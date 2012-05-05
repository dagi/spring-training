package cz.sweb.pichlik.springioc.selfmanaged;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-selfmanaged.xml"})
public class SelfManagedTest extends AbstractJUnit4SpringContextTests {
		
	@Test
	public void testSelfManaged() {
		AutowireCapableBeanFactory beanFactory = applicationContext.getAutowireCapableBeanFactory();
		MyObject object = new MyObject(); 
		beanFactory.autowireBean(object);//inject dependencies
		assertThat("Bean must be autowired into target object", object.getMyBean(), notNullValue());
	}
}
