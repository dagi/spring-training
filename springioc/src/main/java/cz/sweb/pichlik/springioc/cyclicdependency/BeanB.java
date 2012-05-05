package cz.sweb.pichlik.springioc.cyclicdependency;

public class BeanB {

	private BeanA beanA;

	public BeanA getBeanA() {
		return beanA;
	}

	public void setBeanA(BeanA beanA) {
		this.beanA = beanA;
	}
}
