package cz.sweb.pichlik.ibatis;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/ibatisContext.xml"})
public class IbatisTestCase extends AbstractTransactionalJUnit4SpringContextTests {
	
	@Before 
	public void createDatabase(){
		super.simpleJdbcTemplate.update("CREATE TABLE t_customer ( id INTEGER IDENTITY, name VARCHAR(256), address VARCHAR(256) )");
		super.simpleJdbcTemplate.update("CREATE TABLE t_order (id INTEGER IDENTITY, order_date BIGINT, customer_id INTEGER, FOREIGN KEY (customer_id) REFERENCES t_customer (id))");
	}
	
	@Test public void testUser() {		
	}
}
