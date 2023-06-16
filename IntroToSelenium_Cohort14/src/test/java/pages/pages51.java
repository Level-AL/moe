package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.driverClass;
import Utilities.pageInitializer;

public class pages51 extends pageInitializer{
	// here I have my xpaths and methods ik your not supposed to mix but this makes
	// it easier for me to understand what's going on
	public pages51() {

		PageFactory.initElements(driverClass.getDriver(), this);

	}

	@FindBy(xpath = "//a[text()='Shop']")
	public WebElement shopButton;

	@FindBy(xpath = "//a[text()='Home']")
	public WebElement homeButton;

	@FindBy(xpath = "//a[@href='https://practice.automationtesting.in/product/selenium-ruby/' and @class='woocommerce-LoopProduct-link']")
	public WebElement seleniumBookProduct;

	/*
	 * 
	 * 
	 * buttons on top 
	 * 
	 * 
	 * methods down belo
	 * 
	 * 
	 * 
	 * 
	 */
	

	
	
	public static void iframe51() {
		try {
			Actions actions = new Actions(driverClass.getDriver());

			// Find the iframe element
			WebElement iframe = driverClass.getDriver().findElement(By.name("aswift_7"));

			// Switch to the iframe
			driverClass.getDriver().switchTo().frame(iframe);

			// Perform the click at the specified location
			actions.moveByOffset(96, 144).click().perform();
		} catch (Exception e) {
			// Handle exception if any error occurs
			e.printStackTrace();
		}
	}

	public  boolean hasThreeSliders() {
		// Locate the sliders on the webpage
		List<WebElement> sliders = driverClass.getDriver().findElements(By.xpath("//div[@data-slide-duration='0']"));

		if (sliders.size() == 3) {
			System.out.println("The website has three sliders on the homepage.");
		} else {
			System.out.println("The website does not have three sliders on the homepage.");
		}
		return sliders.size() == 3;
	}

	public  boolean hasThreeArrivals() {
		// Locate the sliders on the webpage
		List<WebElement> arrivals = driverClass.getDriver().findElements(By.xpath("//ul[@class='products']"));
		if (arrivals.size() == 3) {
			System.out.println("The website has only three arrivlas on the homepage.");
		} else {
			System.out.println("The website does not have three arrivals on the homepage.");
		}
		return arrivals.size() == 3;
	}

	public  boolean isOutOfStockButtonVisible() {
		WebElement element1 = driverClass.getDriver().findElement(By.xpath("//p[text()='Out of stock8']"));

		if (element1.isDisplayed()) {
			System.out.println("The 'Out of stock' button is visible.");
		} else {
			System.out.println("The 'Out of stock' button is not visible.");
		}
		return element1.isDisplayed();

	}
}
