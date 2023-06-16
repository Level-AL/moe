package day24_mondayReviewWithIrfan;

public class Method {
// In java a method is a block of code that preforms a specific task or operation
// it is a set of statements that are grouped together and given a name,
// so they can be reused and called from other parts of the program
	
	
	// 										 optional to fill
	// AccessModifiers returnType methodName (parameter list) {
		// method body
	//  }
	
	public static void printHello () {
		System.out.println("Hello");
	}
	
	
	public static void sayHelloToSomeone (String name) {
		System.out.println("Hello " + name);
	}
	
	
	public static String message (String name) {
		
		return "Hello " + name;
	}
	            
	    
	public static char[] messagewithCharArray (String name) {
		String str = "Hello " + name;
		return str.toCharArray();
	}
	    
	
	
	
	
}
