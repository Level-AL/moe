package SeleniumDay5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class assertionsTestCase {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser () {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
		
	}
	
	@Test
	public void assertTestCases1 () {
		
		String actualTitleOfPage = driver.getTitle();
		String actualCurrentUrl= driver.getCurrentUrl();
		
		String expectedTitle = "H Y R Tutorials - H Y R Tutorials";
		String expectedUrl = "https://www.hyrtutorials.com/";
		
		//assertion
		AssertJUnit.assertEquals(expectedTitle, actualTitleOfPage);
		
		System.out.println("hello world");
		System.out.println("------------------");
		
//		Assert.assertTrue(actualCurrentUrl.equals(expectedUrl));
		
		Boolean isTitleMatch = actualCurrentUrl.equals(expectedUrl);
		//Assert.assertTrue(isTitleMatch);
		AssertJUnit.assertFalse(true);
		
		
	}
	
}
