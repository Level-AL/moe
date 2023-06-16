package SeleniumDay2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://google.com/");
		
		 WebElement signInButton = driver.findElement(By.linkText("Sign in"));
		signInButton.click();
		
		
		 WebElement emailInput = driver.findElement(By.id("identifierId"));
	        emailInput.sendKeys("alexabiaad1@gmail.com");
		
	}
}
