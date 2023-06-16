package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class loginPage {

	public loginPage() {
		
		PageFactory.initElements(driverClass.getDriver(), this);
	
	}
	
	
	@FindBy(name="username")
	public WebElement userNameField;
	
	@FindBy(name="password")
	public WebElement passwordField;
	
	@FindBy(xpath="//button[text()=' Login ']")
	public WebElement loginButton;
	
	
}
