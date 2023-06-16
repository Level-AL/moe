package day27_Ecapsulation.A;

public class TestingAccessModifiers {
	public static void main(String[] args) {
		
		AccessModifiers am = new AccessModifiers ();
		
		// accessign default access modifiers 
		
		am.name = "TechCircle";
		am.methodA();
		
		// private memebrs
		
	//	am.age = 10; // the field AccessModifiers is not visible 
		
		
	// Protected 
		// protected declarations are visible wihtin the package or all subclasses
		
		am.phoneNumber = "1231231234";
		am.methodC();
		
		
		
	}
}
