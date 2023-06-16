package SeleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenSesameBrowser {

		public static void main(String[] args) {
			
			//System.setProperty("webdriver.chrome.driver","/Users/alexanderabiaad/Desktop/Selenium/chromedriver_mac_arm64/chromedriver");
			// instantiate a Chromedriver class
		
			
			
			WebDriver driver = new ChromeDriver ();			
		//	WebDriver driver1 = new FirefoxDriver ();	
		//	WebDriver driver2 = new SafariDriver ();
			
			// maximize the browser
			//driver.manage().window().maximize();
			driver.manage().window().maximize();
			
			// lanch website
			
			driver.get("https://www.techcircleschool.com/");

			
		}
	
	
	
	
	
	
}
