package cz.sweb.pichlik.springioc.primarybean;

public class FooBean implements FooInterface {

	private String something;
	
	public FooBean(String something) {
		super();
		this.something = something;
	}

	public String getSomething() {
		return something;
	}

}
