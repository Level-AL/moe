package TEst;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	WebDriver driver;

	@Before
	public void lauchBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test () throws InterruptedException {
		WebElement noThanks = driver.findElement(By.xpath("//button[@aria-label='No thanks']"));
		noThanks.click();

		// Add explicit wait for the element to disappear
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[@aria-label='No thanks']")));
		
	WebElement d =	driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	d.sendKeys("espn");
	
	  Thread.sleep(10000);
		
	}

	
	@After 
	public void closeBrowser () {
		driver.close();
		driver.quit();
	}

}
