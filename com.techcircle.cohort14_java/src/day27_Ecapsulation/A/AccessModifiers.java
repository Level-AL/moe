package day27_Ecapsulation.A;

public class AccessModifiers {

//	default
//	declarations are visible only within the package (package private)
//	private
//	declarations are visible within the class only
//	protected
//	declarations are visible within the package or all subclasses
//	public
//	declarations are visible everywhere

	
	
	// instance variables
	String name; // default access modifiers
	private int age;
	protected String phoneNumber;
	public long id;
	
	
	void methodA () {
		System.out.println("methodA Default Access modifier");
	}
	
	private void methodB () {
		System.out.println("methodB Private Access modifier");
	}
	
	protected void methodC () {
		System.out.println("methodC Protected Access modifier");
	}
	
	public void methodD () {
		System.out.println("methodD Publid Access modifier");
	}
	
	public void callingPrivateMethod () {
		 age = 10;
		System.out.println(age);
		
		methodB();
	}




}

