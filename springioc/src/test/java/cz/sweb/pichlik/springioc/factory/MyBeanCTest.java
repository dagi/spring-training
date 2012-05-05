package cz.sweb.pichlik.springioc.factory;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cz.sweb.pichlik.springioc.factory.MyBeanC;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-factories.xml"})
public class MyBeanCTest {
	
	@Autowired
	private MyBeanC myBeanC;
	
	@Test
	public void testAutowiring() {
		assertThat(myBeanC.getMyBeanA(), notNullValue());
		assertThat(myBeanC.getMyBeanB(), notNullValue());
	}
}
