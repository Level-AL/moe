package SeleniumDay5;

import org.testng.annotations.Test;

import Utilities.cM;
import Utilities.driverClass;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDownTestCase {


	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser () {
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://the-internet.herokuapp.com/dropdown");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		
		driverClass.getDriver();
		
	}
	
	@Test
	public void staticDropDown () throws InterruptedException {
		

//		Select s = new Select(driver.findElement(By.id("dropdown")));
//		
//		Thread.sleep(2000);
//		
//		s.selectByIndex(0);
//		Thread.sleep(2000);
//
//		s.selectByValue("2");
//		Thread.sleep(2000);
//
//		s.selectByVisibleText("Option 1");
		
		cM.wait(2);
		cM.selectDropDownIndex(driverClass.getDriver().findElement(By.id("dropdown")), 1);
		cM.wait(1);
		cM.selectDropDownByVisibleText(driverClass.getDriver().findElement(By.id("dropdown")), "Option 2");
		cM.wait(1);
	
		
	}
	
}
