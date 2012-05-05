package cz.sweb.pichlik.springioc.inheritance;

public class BeanB {
	
	private String sharedProperty;
	private String specificPropertyY;
	
	public String getSharedProperty() {
		return sharedProperty;
	}
	public void setSharedProperty(String sharedProperty) {
		this.sharedProperty = sharedProperty;
	}
	public String getSpecificPropertyY() {
		return specificPropertyY;
	}
	public void setSpecificPropertyY(String specificProperty) {
		this.specificPropertyY = specificProperty;
	}
}
