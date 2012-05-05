package cz.sweb.pichlik.springioc.validation;

import javax.validation.constraints.NotNull;

public class Address {

	@NotNull
	private String street;

	@NotNull
	private String city;

	public Address(String street, String city) {
        super();
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
