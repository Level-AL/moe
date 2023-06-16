package uPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.cM;

public class frameworkTests {
	
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver ();
		//opened browser
		
		//navigated to url
		
		//clear input box
//		driver.findElement(By.id("inputBox")).clear();
//	
//		// send key
//		driver.findElement(By.id("inputBox")).sendKeys("userName");
		
		
	//	commonMethods.sendKey(driver.findElement(By.id("inputBox")).clear(), "userName");
		cM.sendKey(driver.findElement(By.id("inputBox")), "userName ");
		
		cM.wait(3);
	
		String radioXpath = "//div[@style='margin-left:20px;']/input";
		
		cM.clickRadioOrCheckBox(driver.findElements(By.xpath(radioXpath)), "Option 2");
	
	} 
	
	
}
