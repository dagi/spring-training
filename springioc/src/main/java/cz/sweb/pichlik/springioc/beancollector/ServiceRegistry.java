package cz.sweb.pichlik.springioc.beancollector;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceRegistry {
	@Autowired
	private List<BusinessService> services;
	
	@Autowired
	private Map<String, BusinessService> servicesByName; //a bean name is the key
	
	public BusinessService getServiceByName(String name) {
		return servicesByName.get(name);
	}
	
	public int count() {
		return services.size();
	}

	public List<BusinessService> getServices() {
		return services;
	}
}
