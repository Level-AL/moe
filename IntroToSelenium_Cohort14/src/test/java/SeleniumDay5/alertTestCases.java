package SeleniumDay5;

import org.testng.annotations.Test;

import Utilities.cM;
import Utilities.driverClass;

import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import org.openqa.selenium.By;


public class alertTestCases extends cM{
	
	
	@BeforeMethod
	public void openBrowser () {
		
		driverClass.getDriver();
		driverClass.getDriver().navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		
	}
	
	@Test
	public void handleAlertBoxes () {
		ap.alertBoxButton.click();
		acceptAlert();
//		 String firstAlertBox = driverClass.getDriver().switchTo().alert().getText();
//		 System.out.println(firstAlertBox);
//		 driverClass.getDriver().switchTo().alert().accept();
		 
		ap.confirmBoxButton.click();
		acceptAlert();
		
		
		
		String textToBeSent = "Alex is boss";
		ap.promptBoxButton.click();
		String thirdAlertBox = alertGetText();
		driverClass.getDriver().switchTo().alert().sendKeys(textToBeSent);
		acceptAlert();
        String wholeOutputTedt = ap.promptOutput.getText();
        System.out.println("All good Baby");
		

		
		
		
		

		 
	}
	
}
