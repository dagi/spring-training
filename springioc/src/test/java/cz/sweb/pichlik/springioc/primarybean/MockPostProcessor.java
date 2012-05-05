package cz.sweb.pichlik.springioc.primarybean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MockPostProcessor implements BeanFactoryPostProcessor {
	
	private Class mockedClass;

	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
				String beanNames[] = beanFactory.getBeanNamesForType(mockedClass);				
				//find the mock
				String mockBeanId = null;
				for(String beanName : beanNames) {
					Object bean =  beanFactory.getBean(beanName);
					if(bean.getClass().getAnnotation(Mock.class) != null) {
						mockBeanId = beanName;
						break;
					}
				}			
				
				//replace all instances by the mock
				if(mockBeanId != null) {
					for(String beanName : beanNames) {
						if(!beanName.equals(mockBeanId)) {	//do not override id of the mock itself
							beanFactory.registerAlias(mockBeanId, beanName);
						}
					}				
				}
	}

	public void setMockedClass(Class mockedClass) {
		this.mockedClass = mockedClass;
	}	
}



