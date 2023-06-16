package SeleniumDay2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingFirstJunitRun {

	WebDriver driver;
	
	// By.xpath("//button[@type='submit']")  xpath empty field.....
	
	
	@BeforeMethod
	public void openBrowser () {
		
		WebDriverManager.chromedriver().setup();
		
	    driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techcircleschool.com/");
		
	}
	
	@Test
	public void test1 () {
		
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
	}
	
	@Test
	
	public void test2 () {
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		
	}
	
	@AfterMethod
	public void afterMethod () {
		driver.close();
	}
	
	
	
}
