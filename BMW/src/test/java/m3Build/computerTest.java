package m3Build;

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

public class computerTest {
	WebDriver driver;

	@Before
	public void lauchBrowser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S2030441405%3A1683650398837057&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=en&ifkv=Af_xneH8BtHDplvh4LOsE0nXHdZJAs3robB2B-UUK6dFCkvHiHNA0PzOLFFkp1LDc92UY5GN_PYQJw&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void test () throws InterruptedException {
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("aabusinessai@gmail.com");
		
		WebElement nextButton = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and text()='Next']"));
		nextButton.click();
		
		Thread.sleep(4000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Abiaad123!@");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//span[@class='VfPpkd-vQzf8d' and text()='Next']")));
		
		nextButton.click();
		
		Thread.sleep(3000);
	}

	
	@After 
	public void closeBrowser () {
//		driver.close();
//		driver.quit();
	}



}
