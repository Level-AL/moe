package SeleniumDay6;


import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class actionClassTestCases {
WebDriver driver;
	
	
//	@BeforeMethod
//	public void openBrowser () {
//		
//		WebDriverManager.chromedriver().setup();
//		
//		driver = new ChromeDriver ();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.amazon.com/");
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//	}
	
	@Test
	public void hoverOverAButton () {
		
	WebElement accListButton = driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]"));
	
		Actions action = new Actions(driver);
		
		action.moveToElement(accListButton).build().perform();
		
	}
	
	
}
