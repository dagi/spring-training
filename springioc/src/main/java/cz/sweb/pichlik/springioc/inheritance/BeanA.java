package cz.sweb.pichlik.springioc.inheritance;

public class BeanA {

	private String sharedProperty;
	private String specificPropertyX;
	
	public String getSharedProperty() {
		return sharedProperty;
	}
	public void setSharedProperty(String sharedProperty) {
		this.sharedProperty = sharedProperty;
	}
	public String getSpecificPropertyX() {
		return specificPropertyX;
	}
	public void setSpecificPropertyX(String specificProperty) {
		this.specificPropertyX = specificProperty;
	}	
	
}
