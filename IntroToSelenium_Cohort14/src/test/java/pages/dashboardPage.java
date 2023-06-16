package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class dashboardPage {

	
	public dashboardPage() {
		PageFactory.initElements(driverClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	public WebElement dashboardText;
	
	
}
