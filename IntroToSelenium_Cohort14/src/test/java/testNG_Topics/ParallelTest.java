package testNG_Topics;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import Utilities.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {

	public WebDriver driver;
	
	@Ignore
	@Test (priority = 1)
	public void safariTest () {
		   WebDriverManager.safaridriver().setup();
           driver = new SafariDriver();
           driver.get(ConfigurationReader.getProperty("orangeHRM"));
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	  @Test (priority = 2)
	    public void chromeTest() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get(ConfigurationReader.getProperty("orangeHRM"));
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	    
	
	
}
