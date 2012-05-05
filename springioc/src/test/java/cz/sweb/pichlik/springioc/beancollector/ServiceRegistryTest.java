package cz.sweb.pichlik.springioc.beancollector;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cz.sweb.pichlik.springioc.beancollector.ServiceRegistry;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-collector.xml"})
public class ServiceRegistryTest {
	
	@Autowired
	private ServiceRegistry serviceRegistry;
	
	@Test
	public void testCollector() {		
		assertThat(serviceRegistry.getServiceByName("serviceA"), notNullValue());
		assertThat(serviceRegistry.getServiceByName("serviceB"), notNullValue());
	}
}
