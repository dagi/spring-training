package cz.sweb.pichlik.springioc.placeholder;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:META-INF/applicationContext-placeholder.xml"})
public class MyBeanTest {
	
	@Autowired
	private MyBean myBean;
	
	@Autowired
	private MyAnnotatedBean myAnnotatedBean;
	
	@Test
	public void testPlaceholder(){
		assertThat(myBean.getUsername(), is("dagi"));
		assertThat(myAnnotatedBean.getUsername(), is("dagi"));
	}
}
