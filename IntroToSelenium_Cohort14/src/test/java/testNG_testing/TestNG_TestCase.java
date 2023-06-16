package testNG_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utilities.ListenersTestNG;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ListenersTestNG.class)
public class TestNG_TestCase {
	WebDriver driver;

	@Test // failed test
	public void Test1openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String expectedTitle = "OranheHDR";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@Test // success test
	public void Test2closeBrowser() {
		driver.close();
		Reporter.log("Driver closed after testing");

	}

}
