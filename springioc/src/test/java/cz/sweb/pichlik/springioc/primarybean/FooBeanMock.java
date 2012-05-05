package cz.sweb.pichlik.springioc.primarybean;

@Mock
public class FooBeanMock implements FooInterface{
	
	public static final String MOCK_STRING = "xyz";

	public String getSomething() {		
		return MOCK_STRING;
	}

}
