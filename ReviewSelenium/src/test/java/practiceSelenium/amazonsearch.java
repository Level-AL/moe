package practiceSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonsearch {

	
	WebDriver driver;
	
	@Before
	public void openBrowser () {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		
	}
	
	/*
	 * Go to amazon.com
	 * search an item
	 * click search button
	 * verify the title that contains the item that we have searched 
	 */
	
	// twotabsearchtextbox --> search box element "id"
	// nav-search-submit-button --> search button element
	@Test
	public void searchBox() {
		
	String item = "laptop";	
		
	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
	WebElement searchBoxButton = driver.findElement(By.id("nav-search-submit-button"));
	
	
	searchBox.sendKeys(item);
	
	searchBoxButton.click();
	
	String actualTitle = driver.getTitle();
	
	if (actualTitle.contains(item)) {
		System.out.println("The title contains the item " + item);
	}else {
		System.out.println("Actual title " + actualTitle);
	}
	
}
	
	
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
