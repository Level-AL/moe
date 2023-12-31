package SeleniumDay6;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframesTestCases {
	
	WebDriver driver;
	Actions action;
	@BeforeMethod
	public void openBrowser () {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action = new Actions(driver);
		
	}
	
	@Test
	public void hoverMenu () throws InterruptedException {
		
		selectInterTab("Droppable");
		
		driver.switchTo().frame(0);
		
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		selectInterTab("Sortable");
		
		
		
	}
	
	@AfterMethod
	public void closeBrowser () {
		
//		driver.close();
//		driver.quit();
		
	}
	
	
	
	public void selectInterTab (String tabName) {
		List <WebElement> interactionsTab =driver.findElements(By.xpath("//div[@id='sidebar']/aside[1]/ul/li"));
		
		for (WebElement eachTab : interactionsTab) {
			
			if (eachTab.getText().contains(tabName)) {
				eachTab.click();
				break;
			}
		}
	}
	
}
