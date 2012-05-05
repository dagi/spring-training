package cz.sweb.pichlik.spring.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/applicationContext.xml")
public class Test {
	
	@Autowired
	private ValidatorFactory validatorFactory;
	
	@org.junit.Test
	public void testValidation1() {
		Person person = new Person(-1, null);
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<Person>> resultOfValidation = validator.validate(person);
		for (ConstraintViolation<Person> constraintViolation : resultOfValidation) {
			System.out.println(constraintViolation);
		} 
	}
	
	@org.junit.Test
	public void testValidation2() {
		Person person = new Person(10, new Address());
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<Person>> resultOfValidation = validator.validate(person);
		for (ConstraintViolation<Person> constraintViolation : resultOfValidation) {
			System.out.println(constraintViolation);
		} 
	}

}
