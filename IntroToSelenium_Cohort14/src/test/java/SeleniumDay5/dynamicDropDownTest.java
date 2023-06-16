package SeleniumDay5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicDropDownTest{
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser () {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		
	}
	
	@Test
	public void selectAirports () throws InterruptedException {

		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("iad");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("lax");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@aria-label='Fri May 05 2023']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		Thread.sleep(2500);
		
		
		
	}
	@AfterMethod
	public void close () {
		driver.close();
		driver.quit();
	}
	
}
