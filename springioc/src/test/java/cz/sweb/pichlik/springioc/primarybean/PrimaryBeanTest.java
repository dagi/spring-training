package cz.sweb.pichlik.springioc.primarybean;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath*:META-INF/applicationContext-primarybean-mocks.xml",
		"classpath*:META-INF/applicationContext-primarybean.xml"
		 })
public class PrimaryBeanTest {

	@Autowired
	private BeanWorkingWithFoo beanWorkingWithFoo;
	
	@Autowired
	private FooInterface foo;
	
	@Test
	public void testFooImplementationIsMock() {
		assertThat(beanWorkingWithFoo.getFooInterface().getSomething(), is(FooBeanMock.MOCK_STRING));
		assertThat(foo.getSomething(), is(FooBeanMock.MOCK_STRING));
	}
}
