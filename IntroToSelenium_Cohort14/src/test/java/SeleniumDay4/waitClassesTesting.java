package SeleniumDay4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitClassesTesting {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser () {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	@Test
	public void explicitWait () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		WebElement element = driver.findElement(By.xpath(""));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		element.click();
		
		Thread.sleep(3000);
		
		
	}
	
	
}
