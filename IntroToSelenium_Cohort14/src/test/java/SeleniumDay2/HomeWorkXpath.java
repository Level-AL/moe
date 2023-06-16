package SeleniumDay2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeWorkXpath {

//	By.xpath("//button[@type='submit']"

	// selenium xpath methods

//	1) Open the browser
//	2) Enter the URL “http://practice.automationtesting.in/”
//	3) Click on My Account Menu
//	Register if do not have username/password
//	4) Enter registered username in username textbox
//	5) Enter password in password textbox
//	6) Click on login button
//	7) User must successfully login to the web page

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://practice.automationtesting.in/");

		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame("aswift_7");
		driver.switchTo().frame("ad_iframe");
		driver.findElement(By.cssSelector("#dismiss-button > div > span")).click();

	}

	@Test
	public void loginInWithUserPass()  {

//			driver.findElement(By.linkText("My Account")).click();
//					driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]/a")).click();
//					
//					// Thread.sleep(3000); 
//				        driver.switchTo().frame("aswift_7");
//				        driver.switchTo().frame("ad_iframe");
//				        driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span")).click();

				        
	WebElement b= 	driver.findElement(By.xpath( "/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[1]/input"));
	b.sendKeys("alexabiaad1@gmail.com");
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[2]/input")).sendKeys("10alexALEX");
	driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();

			
	}

}
