package testNG_Topics;

import org.testng.annotations.Test;

public class DataProviderTestCase {

	
	
	
	@Test (dataProvider = "dpMethod" , dataProviderClass = dataProviderClass.class)
	public void myTest (String name, String lastName ,int age) {
		
		System.out.println("My name is: " + name );
		System.out.println("My last name is "+ lastName);
		System.out.println("My age is: " + age);
	}










}
