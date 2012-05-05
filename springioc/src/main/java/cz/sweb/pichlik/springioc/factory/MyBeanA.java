package cz.sweb.pichlik.springioc.factory;

public class MyBeanA {
	
	private MyBeanA() {		
	}
	
	public static MyBeanA newInstance() {
		return new MyBeanA();
	}
}