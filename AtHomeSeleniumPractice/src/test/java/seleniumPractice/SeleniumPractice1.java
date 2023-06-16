package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.Cookie;

public class SeleniumPractice1 {
	public static void main(String[] args) {
		
		
//		System.setProperty("webdriver.chrome.driver", "/Users/alexanderabiaad/Desktop/Selenium/chromedriver_mac_arm64/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver ();
		System.out.println(driver);
		
		
		
		
		
		
		driver.get("https://www.amazon.com/");
		
		WebElement signInButton = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signInButton.click();
		
		WebElement emailField = driver.findElement(By.id("ap_email"));
		emailField.sendKeys("+15712940299");
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement passwordField = driver.findElement(By.id("ap_password"));
		passwordField.sendKeys("10alexALEX");
		
		WebElement signIn = driver.findElement(By.id("signInSubmit"));
		signIn.click();
		
		
		
		
		
		
				
		
		
		
		
	}
}
