package day14_String;

public class Task {

	public static void main(String[] args) {

		// Write a program to reverse a string
//				intput = "abc";
//				output = "cba";		
		
		String input = "abc";
		
		String output= "";
		
		output += input.charAt(2);
		output += input.charAt(1);
		output += input.charAt(0);
		
		System.out.println(output);
		
		
		output = "";
		
		for (int i = input.length()-1; i >=0; i--) {
				output += input.charAt(i);
				
		}
		System.out.println(output);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		char[] charArray = str.toCharArray();
//
//		for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
//		    
//		    char temp = charArray[i];
//		    charArray[i] = charArray[j];
//		    charArray[j] = temp;
//		}
//
//		String reversedStr = new String(charArray);
//		System.out.println(reversedStr); // prints "cba"
		




		
		
		
		
	}

}
