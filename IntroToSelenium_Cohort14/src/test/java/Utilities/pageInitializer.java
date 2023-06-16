package Utilities;

import pages.alertPage;
import pages.dashboardPage;
import pages.loginPage;
import pages.pages51;

public class pageInitializer extends driverClass{

	public static loginPage lp;
	
	public static dashboardPage dp;
	
	public static pages51 p51;
	
	public static alertPage ap;
	
	public static void initialize () {
		
		lp = new loginPage();
		dp = new dashboardPage();
		p51 = new pages51();
		ap = new alertPage();
	}
	
	 
}
