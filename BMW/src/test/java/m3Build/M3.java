package m3Build;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class M3 {

	WebDriver driver;
	
	@Before
	public void launchBMW () {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bmwusa.com/home.html?cid=GOOGLE_700000001900342_G%7CBMW%7CCXE%7CWashington+DC%7CAll%7CBrand+Core%7CAO%7CAlways+On%7CExact_YEE22_BMW+Brand_Exact_Road+Home+Special+Offers%7CHomepage&tier=tier2&maco=4151&ch=paid_search&veh=NA&gad=1&gclid=CjwKCAjwxr2iBhBJEiwAdXECw8BdpXUjIoN_0rMIcd9xopwEcPSpH0RpusXidsHBlKmXgg2vLBAaQhoC2isQAvD_BwE&gclsrc=aw.ds");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void TwoSeriesClick () throws InterruptedException {		
	
	WebElement openCarList =	driver.findElement(By.xpath("//span[@class='globalnav-primary__link-content headline-5--bold' and text()='Models']"));
	WebElement dismiss = driver.findElement(By.xpath("//button[@class='view cta-2--bold']"));
	WebElement twoSeries = driver.findElement(By.xpath("//a[@href='/vehicles/2-series/overview.html' and @class='header-vehicle-tile__link']"));
	dismiss.click();
	openCarList.click();
	twoSeries.click();
	
	WebElement exploreButton = driver.findElement(By.xpath("//a[@href='/vehicles/m-models/m2-coupe/overview.html' and @class='cta cta-rounded-corners  full-width  align--left icon-none ']"));
	exploreButton.click();
	
	WebElement buildButton = driver.findElement(By.xpath("//a[@href='/build-your-own.html#/studio/232R' and @analytics-event='overview-fma.build-your-own.build-yours.button'] "));
	buildButton.click();
	
	
	WebElement closeZip = driver.findElement(By.xpath("//button[@class='inventory-zip-entry__close-icon']"));
	WebElement colorPick = driver.findElement(By.xpath("//div[@class='byo-rail-option' and @code='P0C6E']"));
	WebElement nextButtonWheels = driver.findElement(By.xpath("//a[@class='button-next byo-core-type label-1 theme-core']"));
	closeZip.click();
	colorPick.click();
	nextButtonWheels.click();
	WebElement nextButtonUpHolstrey = driver.findElement(By.xpath("//a[@class='button-next byo-core-type label-1 theme-core']"));
	nextButtonUpHolstrey.click();
	
	WebElement closeButton = driver.findElement(By.xpath("//button[@class='close-button']"));
	WebDriverWait wait = new WebDriverWait(driver, 10); // 10-second wait
	wait.until(ExpectedConditions.elementToBeClickable(closeButton));
	closeButton.click();
	WebElement seatColor = driver.findElement(By.xpath("//figure[@style='background-image: url(\" https://cache.bmwusa.com/cosy.arox?brand=wbbm&client=byoc&view=tile_wide&fabric=FMAMM&resp=jpg&width=300 \"); animation-delay: 1.2s;']"));
	seatColor.click();
	WebElement nextButtonTrim = driver.findElement(By.xpath("//a[@class='button-next byo-core-type label-1 theme-core']"));
	nextButtonTrim.click();
	WebElement carbonFiber = driver.findElement(By.xpath("//figure[@style='background-image: url(\" https://cache.bmwusa.com/cosy.arox?brand=wbbm&client=byoc&view=tile_wide&sa=S04MC&vehicle=232R&resp=jpg&width=300 \"); animation-delay: 1.5s;']"));
	carbonFiber.click();
	WebElement nextButtonOptions = driver.findElement(By.xpath("//a[@class='button-next byo-core-type label-1 theme-core']"));
	nextButtonOptions.click();
	WebElement nextSummary = driver.findElement(By.xpath("//span[@class='byo-dock__link-icon']"));
	nextSummary.click();
	Thread.sleep(10000);
	}
	

	
	
	@After
	public void shutDown() throws InterruptedException {
	
		driver.close();
		driver.quit();
	}
}
