package cz.sweb.pichlik;

import org.springframework.integration.core.Message;

public class MyLogger {
	private String type;
	
	public void toLog(Message message) {
		System.out.println("Logger:" + type +  " " + message.getPayload());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
