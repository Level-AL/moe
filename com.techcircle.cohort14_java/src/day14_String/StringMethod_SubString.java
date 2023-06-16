package day14_String;

public class StringMethod_SubString {
	public static void main(String[] args) {
			// 	   0123456789
	String word = "television";
	
	System.out.println(word.substring(4));
	
	
	System.out.println(word.substring(2,5));
		
    
	System.out.print(word.charAt(2));
	System.out.print(word.charAt(3));
	System.out.println(word.charAt(4));
	
	for(int i=2; i<5; i++) {
		System.out.print(word.charAt(i));
	}

	
	
	
	
	}
}
