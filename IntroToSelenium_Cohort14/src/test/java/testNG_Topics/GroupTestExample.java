package testNG_Topics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;



public class GroupTestExample {
	
	String message = ".com";
	
	
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test (groups = {"smokeTest","regression"})
	public void testPrintMessage() {
		
		message = ".com";
			AssertJUnit.assertEquals(message, messageUtil.printMessage());

	}     
	
	@Test(groups = "smokeTest")
	public void testSalutationsMessage() {
		
		message = "techcircleschool" + message;
		
		AssertJUnit.assertEquals(message, messageUtil.salutaionMessage());
		
		
	}
	@Test (groups = {"smokeTest","regression","functionTest"})
	public void testingExitMessage() {
		
		message = "www." + "techcircletutorial" + ".com";
		
		
		AssertJUnit.assertEquals(message, messageUtil.exitMessage());

		
		
		
		
	}
	
	
	
	
	
	
}
