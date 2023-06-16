package day27_Ecapsulation;

public class AnanasClass {

	int num = 5;
	
	static int maxPlayer = 4;
    static String name = "TechCircle";

	
	
	
	public void displayMessage () {
		
		System.out.println("Hello TechCircle");
		
	}
	
	public static void displayStaticMessage () {
		
		System.out.println("This is static method");
		
	}	
	
	static {
		System.out.println("From static member class line number 21");
		maxPlayer = 10;
		name = "techcircle";
				
	}
	
	
	
	
}
