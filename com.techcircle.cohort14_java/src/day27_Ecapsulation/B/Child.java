package day27_Ecapsulation.B;

import day27_Ecapsulation.A.AccessModifiers;

public class Child extends AccessModifiers{

	public static void main(String[] args) {
		
		
		
		// Protected 
			// protected declarations are visible wihtin the package or all subclasses
			
			Child c = new Child ();
			
			c.phoneNumber = "1231231234";
			c.methodC();
		
		
	}
	
	
}
