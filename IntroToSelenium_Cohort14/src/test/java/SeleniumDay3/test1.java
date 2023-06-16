package SeleniumDay3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	WebDriver driver;
	
	@BeforeMethod
	public void openAmazon () {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.com/");
		
		
	}
	@Test
	public void clickSearchButton () {
		WebElement searchButton = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
		WebElement searchSum = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		searchSum.sendKeys("nike tech tracksuit");
		searchButton.click();
		
	}
	
}
