package SeleniumDay6;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alone {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser () {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void hoverMenu () {
		
		WebElement hyrMenu = driver.findElement(By.xpath("//a[@href='https://www.hyrtutorials.com/search/label/Tutorials']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(hyrMenu).build().perform();
		
		
	}
	
	@AfterMethod
	public void closeBrowser () {
		
		driver.close();
		driver.quit();
		
	}
	
}
