package day29_Inheritance;

public class SuperClass { // Parent class 
// Instance variables 
	
	String url = "www.techcircle.com";
	String userName = "techcircle";
	String password = "circle123";
	
	public void openBrowser () {
		System.out.println("Opening Browser");
	}
	
	public void closeBrowser () {
		System.out.println("Closing Browser");
	}
}
