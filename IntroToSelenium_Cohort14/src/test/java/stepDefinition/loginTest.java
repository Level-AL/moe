package stepDefinition;

import Utilities.ConfigurationReader;
import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;

public class loginTest extends cM {
	
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {

	String titleOfPage =	driverClass.getDriver().getTitle();
	System.out.println(titleOfPage);
		
		
	}

	@When("the user enters valid credentials")
	public void the_user_enters_valid_credentials() {
		lp.userNameField.sendKeys(ConfigurationReader.getProperty("orangeHRM_username"));
		lp.passwordField.sendKeys(ConfigurationReader.getProperty("orangeHRM_password"));	
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		lp.loginButton.click();
	}

	@Then("the user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() {

		System.out.println("User has been logged in successfully!");
			
	}

	@When("the user enters invalid credentials")
	public void the_user_enters_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("the user should see an error message")
	public void the_user_should_see_an_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
