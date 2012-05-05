package cz.sweb.pichlik.springioc.containerinteraction;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Bean implements InitializingBean, DisposableBean{
	
	public Bean() {
		System.out.println("1.)Constructor");
	}
	
	public void setDepedencies(String foo) {
		System.out.println("2.) setDependencies");
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("3.) afterPropertiesSet");
	}


	public void myInit() {
		System.out.println("4.) myInit");
	}
	
	
	
	public void myDestroy(){
		System.out.println("5.) myDestroy");
	}


	public void destroy() throws Exception {
		System.out.println("6.) destroy");		
	}
	
}
