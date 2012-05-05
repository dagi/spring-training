package cz.sweb.pichlik.springioc.factory;

public class MyBeanC {
	private MyBeanA myBeanA;
	private MyBeanB myBeanB;
	
	public void setMyBeanA(MyBeanA myBeanA) {
		this.myBeanA = myBeanA;
	}
	
	public void setMyBeanB(MyBeanB myBeanB) {
		this.myBeanB = myBeanB;
	}

	public MyBeanA getMyBeanA() {
		return myBeanA;
	}

	public MyBeanB getMyBeanB() {
		return myBeanB;
	}
}
