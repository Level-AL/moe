package day33_Exeptions;

public class RunTimeException {
	public static void main(String[] args) {
		
// A run time exeption happens due to a programming error
// they are also known as unchecked exeptions
// these expections are not checked at compile-time but run-time
		
		String str = null;
		
//		System.out.println(str.charAt(0));
		
		RunTimeException rm = new RunTimeException();
			int result = rm.methodA("1","2");
		    int result2 = methodB(1,2);
		    
		    System.out.println(result);
		    System.out.println(result2);
		    
		    String str2 = "java";
		    
		    System.out.println(str2.charAt(5));
	
	}
	
	
	
	
	public  int methodA(String a, String b) {
		
		
		
		return Integer.parseInt(a)+ Integer.parseInt(b);
	}
	
	
	public static int methodB(int a, int b) {
		
		
		
		return a+b;
	}
	
	
}
