package cz.sweb.pichlik.springioc.placeholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyAnnotatedBean {

	@Value("${username}")
	private String username;

	public String getUsername() {
		return username;
	}
}
