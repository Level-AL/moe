package testNG_Topics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MultiBrowser {
	
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browser) {
		
		if (browser.equalsIgnoreCase("safari")) {
			 WebDriverManager.safaridriver().setup();
             driver = new SafariDriver();
		}else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
		}
		driver.get("https://www.techcircle.dev");
	}
	
	
	@Test
	public void login (String browser) {
//		System.out.println("Browser is " + browser);
	//	System.out.println("kicking this off");
		
	}
	
	
	
	
	
	
}
