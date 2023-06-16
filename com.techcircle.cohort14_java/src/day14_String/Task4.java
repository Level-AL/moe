package day14_String;

public class Task4 {

	public static void main(String[] args) {

		
		/*
 * Write a program that can check if the first and last characters
 * of the string are the same 
 * ex: level output: same
*
*/
		String input = "level";
		char firstLetter = input.charAt(0);
		char lastLetter = input.charAt(input.length()-1);
		
		
		if(firstLetter == lastLetter) {
			System.out.println( " same");
		} else {
			System.out.println(" not the same");
			
		}
		
		
		
		
		
	}

}
