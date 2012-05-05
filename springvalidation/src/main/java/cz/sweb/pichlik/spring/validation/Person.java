package cz.sweb.pichlik.spring.validation;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	
	@DecimalMax(value="110", message="Maximum age is 110")
	@DecimalMin(value="0", message="Minimum age is 110")
	private int age;
	
	@NotNull
	@Valid
	private Address address;

	public Person() {
		super();
	}

	public Person(int age, Address address) {
		super();
		this.age = age;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
