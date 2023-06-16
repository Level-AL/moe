package SeleniumDay7;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import Utilities.driverClass;


public class openBrowserUsingDriverClass {

	@BeforeMethod
	public void setUp() {
		
	//driverClass.getDriver();
		
	}
	
	@Test
	public void test () {
		
		
		
	}
	
	@AfterMethod
	public void tearDown () {
		
		driverClass.tearDown();
		
	}
	
}
