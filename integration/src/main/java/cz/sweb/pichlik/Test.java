package cz.sweb.pichlik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.PollableChannel;
import org.springframework.integration.core.Message;
import org.springframework.integration.core.MessageChannel;
import org.springframework.integration.message.GenericMessage;
import org.springframework.integration.message.StringMessage;

public class Test {

	public static  void main(String[]  args) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/applicationContext.xml");
	    MessageChannel input = (MessageChannel) context.getBean("input");
	    //PollableChannel output = (PollableChannel) context.getBean("output");	    
	    input.send(new GenericMessage<Integer>(1));
	    input.send(new GenericMessage<String>("String"));	    
	}


}
