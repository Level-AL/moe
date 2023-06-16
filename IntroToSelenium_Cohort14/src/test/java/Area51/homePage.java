package Area51;



import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Utilities.cM;
import Utilities.driverClass;
import pages.pages51;


public class homePage extends pages51{

	
	
	@BeforeMethod
	public void openBrowser () {
		driverClass.getDriver();
	}
	
//	@AfterMethod
//	public void closeBrowser () {
//		driverClass.tearDown();
//	}
	
	@Ignore
	@Test 
	public void homePageWithThreeSlidersOnly () {
		
		shopButton.click();
		pages51.iframe51();
		cM.switchToDefaultContent();
		cM.waitForVisibilty(p51.homeButton);
		p51.homeButton.click();
		p51.hasThreeSliders();
		
	}
	
	@Ignore
	@Test 
	public void homePageWtihThreeArrivalsOnly () {
		
		p51.shopButton.click();
		pages51.iframe51();
		cM.switchToDefaultContent();
		cM.waitForVisibilty(p51.homeButton);
		p51.homeButton.click();
		p51.hasThreeArrivals();
		
	}
	
	@Test
	public void ImagesInArrivalsShouldNavigate () {
		p51.shopButton.click();
		pages51.iframe51();
		cM.switchToDefaultContent();
		cM.waitForVisibilty(p51.homeButton);
		p51.homeButton.click();
		p51.hasThreeArrivals();
		p51.seleniumBookProduct.click();
		cM.wait(4);
		try {
		p51.isOutOfStockButtonVisible();
		}catch(NoSuchElementException e) {
			System.out.println(" Not navigating to the next page where user can place a book in their basket ");
		}
	}
		
	}

