package day13_String;

public class CharacterCount {

	public static void main(String[] args) {
//					   0123456789
		String name = "President George Washington";
		char targetChar = 'n';
		int count = 0;
	
		for (int i =0; i <name.length(); i++) {
//			System.out.println(i);
//			System.out.println(name.charAt(i));
			if(name.charAt(i)== targetChar) {
				System.out.println(i);
			count++;
		}
		}
//		if(name.charAt(2)== targetChar) {
//			count++;
//		}
//		
//		if(name.charAt(3)== targetChar) {
//			count++;
//		}
//		
//		if(name.charAt(6)== targetChar) {
//			count++;
//		}
		
		System.out.println(count); 
		
	}

}
