package cz.sweb.pichlik;

import org.springframework.integration.core.Message;

public class Logger {
	
	private String type;

	public void sysout(Message message) {
		System.out.println("Tye:" + type + " "+ message.getPayload());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
