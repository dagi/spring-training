package cz.sweb.pichlik.springioc.spi;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cz.sweb.pichlik.springioc.spi.Environment;
import cz.sweb.pichlik.springioc.spi.ServiceProviderInterface;
import cz.sweb.pichlik.springioc.spi.TargetEnvironment;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-spi.xml"})
public class SPITest {

	@Autowired(required=false)
	@TargetEnvironment(Environment.SERVER)
	private List<ServiceProviderInterface> serverImplementations;
	
	@Autowired(required=false)
	@TargetEnvironment(Environment.CLIENT)
	private List<ServiceProviderInterface> clientImplementations;	

	@Test
	public void test() {
		assertThat(serverImplementations.size(), is(1));
		assertThat(clientImplementations.size(), is(1));
	}
}
