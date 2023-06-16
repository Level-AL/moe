package day24_mondayReviewWithIrfan;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReview {
	public static void main(String[] args) {
		
//		ArrayList <objectType> variable name = new ArrayList <> ();
		
		ArrayList <Character> list = new ArrayList <> ();
		
		list.add('a');
		list.add("Hello".charAt(0));
		
		list.addAll(Arrays.asList('a', '2','D','@','c','l'));
		
		System.out.println(list);
		
		// create an array list of lowerCase element only
		
		ArrayList <Character> lowerCaseLetters = new ArrayList <> ();
		ArrayList <Character> digits = new ArrayList <> ();
		ArrayList <Character> upperCaseLetters = new ArrayList <> ();
		ArrayList <Character> specialChars = new ArrayList <> ();

		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			
//			if (list.get(i) >= 'a' && list.get(i) <= 'z') {
//				lowerCaseLetters.add(list.get(i));
//			}else if (list.get(i) >= 'A' && list.get(i) <= 'Z') {
//				upperCaseLetters.add(list.get(i));
//			}else if (list.get(i) >= '0' && list.get(i) <= '9') {
//				digits.add(list.get(i));
//			}else {
//				specialChars.add(list.get(i));
//			}
//		}
		
		for (int i = 0; i < list.size(); i++) {
			
			if (Character.isLowerCase(list.get(i))) {
			lowerCaseLetters.add(list.get(i));
		} 
			if (Character.isUpperCase(list.get(i))) {
				upperCaseLetters.add(list.get(i));
				
			}
			if (Character.isDigit(list.get(i))) {
				digits.add(list.get(i));
				
			}else {
			  
				Character.isLetterOrDigit(list.get(i)); 
				specialChars.add(list.get(i));
			}
			
				
			
			
		}
	
		System.out.println(lowerCaseLetters);
		System.out.println(digits);
		System.out.println(upperCaseLetters);
		System.out.println(specialChars);
		

		
	}
}
