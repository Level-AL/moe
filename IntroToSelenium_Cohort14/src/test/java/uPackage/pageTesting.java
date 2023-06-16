package uPackage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utilities.ConfigurationReader;
import Utilities.cM;
import Utilities.driverClass;
 



public class pageTesting extends cM{
    

	
	@BeforeMethod
    public void openBrowser() {
    		driverClass.getDriver();
    }
    
    
    @Test
    public void loginWithValidUsernameValidPassword() {
    	
//        driverClass.getDriver().findElement(By.name("username")).sendKeys("Admin");
    	lp.userNameField.sendKeys(ConfigurationReader.getProperty("orangeHRM_username"));
//        driverClass.getDriver().findElement(By.name("password")).sendKeys("admin123");
    	lp.passwordField.sendKeys(ConfigurationReader.getProperty("orangeHRM_password"));
//       driverClass.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    	lp.loginButton.click();
    	Assert.assertTrue(dp.dashboardText.isDisplayed());
        
    }
    
    @Test
    public void loginWithInValidUsernameValidPassword() {
    	
//        driverClass.getDriver().findElement(By.name("username")).sendKeys("Admin");
    	lp.userNameField.sendKeys(ConfigurationReader.getProperty("orangeHRM_invalidUsername"));
//        driverClass.getDriver().findElement(By.name("password")).sendKeys("admin123");
    	lp.passwordField.sendKeys(ConfigurationReader.getProperty("orangeHRM_invalidPassword"));
//       driverClass.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    	lp.loginButton.click();
        
    }
}
