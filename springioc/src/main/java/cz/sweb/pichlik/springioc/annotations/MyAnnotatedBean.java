package cz.sweb.pichlik.springioc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyAnnotatedBean {
	
	@Autowired
	private AnnotatedDependencyA dependencyA;
	
	@PostConstruct
	public void init() {
		System.out.println("post construct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("pre destroy");
	}

	public AnnotatedDependencyA getDependencyA() {
		return dependencyA;
	}	
}
