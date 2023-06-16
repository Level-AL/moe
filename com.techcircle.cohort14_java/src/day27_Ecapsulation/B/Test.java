package day27_Ecapsulation.B;

import day11_nestedForLoop.Timer;
import day27_Ecapsulation.A.AccessModifiers;

public class Test {
	public static void main(String[] args) {
		
		// default 
		// declarations are visible only within the package (package private)
		
		AccessModifiers am = new AccessModifiers ();
		
		// accessign default access modifiers
		
//		am.name = "TechCircle"; // package private

		am.callingPrivateMethod();
		
//		am.phoneNumber = "1231231234";
//		am.methodC();
		
		// Protected 
				// protected declarations are visible wihtin the package or all subclasses
				
		Timer t = new Timer ();
		t.fifteenMinuteTimer();
		
	}
}
