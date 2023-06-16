package day25_classAndObject;

public class LocalVariable {
// instance variable 
	int c = 5;
	int d = 7;
	
	
	public static void main(String[] args) {
		// local variable
		int a = 4;
		int b = 3;
		
		addition( );
	
	for (int i = 0; i < 5; i++) {
		
		System.out.println("Hello" + i);
		
	}
	
		System.out.println(a+b); // 7
	
	LocalVariable lv = new LocalVariable ();
		
		lv.subtraction();
		
		lv.c = 100;
		lv.d = 50;
		lv.subtraction();
	
	}
	
	
	public static void addition () {
		
		int a = 20;
		int b = 90;
		
		System.out.println(a+b);
	}
	
	public void subtraction () {
		
		System.out.println(c - d);
	}


	
	
	
}
