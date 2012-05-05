package cz.sweb.pichlik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.core.MessageChannel;
import org.springframework.integration.message.GenericMessage;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/testContext.xml");
		MessageChannel input = (MessageChannel) applicationContext.getBean("input");
		input.send(new GenericMessage<String>("S"));
		input.send(new GenericMessage<Integer>(1));
	}

}
