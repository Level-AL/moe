package day29_Inheritance;

public class TestSubClass {
	public static void main(String[] args) {
		
		SuperClass superClass = new SuperClass ();
		
		superClass.openBrowser();
		superClass.closeBrowser();
		
		
		SubClass subClass = new SubClass();
		
		subClass.openBrowser();
		superClass.closeBrowser();
		
		
		
		
		
		
	}
}
