package cz.sweb.pichlik.springioc.xml;


public class MyBean {
	
	private DependencyA dependencyA;
	
	public MyBean(){		
	}
	
	public MyBean(DependencyA dependencyA){
		this.dependencyA = dependencyA;
	}

	public void setDependencyA(DependencyA dependencyA) {
		this.dependencyA = dependencyA;
	}

	public DependencyA getDependencyA() {
		return dependencyA;
	}
}