package cz.sweb.pichlik.springioc.primarybean;



public class BeanWorkingWithFoo {
	private FooInterface fooInterface;

	public FooInterface getFooInterface() {
		return fooInterface;
	}

	public void setFooInterface(FooInterface fooInterface) {
		this.fooInterface = fooInterface;
	}
}
