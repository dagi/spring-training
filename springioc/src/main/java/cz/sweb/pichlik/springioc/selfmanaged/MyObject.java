package cz.sweb.pichlik.springioc.selfmanaged;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Non managed object, but its dependencies can be injected anyway. 
 */
public class MyObject {

	@Autowired
	private MyBean myBeam;
	
	MyBean getMyBean() {
		return myBeam;
	}
}
