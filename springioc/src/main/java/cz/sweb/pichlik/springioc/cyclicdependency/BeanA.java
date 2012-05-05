package cz.sweb.pichlik.springioc.cyclicdependency;

public class BeanA {
	
	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
}
