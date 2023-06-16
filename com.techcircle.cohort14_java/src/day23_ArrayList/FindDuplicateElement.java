package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateElement {

	public static void main(String[] args) {

	ArrayList <String> list = new ArrayList <String> ();
		
		
		list.add("Bea");
		list.add("Abdusamat");
		list.add("Trookie");
		list.addAll(Arrays.asList("Trookie", "Maria", "Sharuhan","Ananas"));
		
		System.out.println(list);
		
		
		System.out.println(list.contains("Trookie"));
	
		System.out.println(list.contains("Pays"));
		
		
		
//		[Bea, Abdusamat, Trookie, Trookie, Maria, Sharuhan, Ananas]
		
//		list2										
		
		
		ArrayList <String> list2 = new ArrayList <> ();
		
		for (int i = 0; i < list.size(); i++) {
			
			if (!list2.contains(list.get(i))) {
				list2.add(list.get(i));
			}else {
				System.out.println(list.get(i) + " is duplicated");
			}
		}
		
		// Task 16 
		// write a program to extract distinct character from a string 
		// input : abcabcabcabc output : abc
		
		
		String str = "abcabcabcabc";
		
		String distinctCharacters = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			if(!distinctCharacters.contains(Character.toString(str.charAt(i)))) {
				distinctCharacters += str.charAt(i);
				
			}
		
		}
		
		System.out.println(distinctCharacters);
		
		
// write a program that can verify if a password is a strong password
// Characteristics of a strong password are:
// 1. Passowrd must be at least 8 chars long
// 2. contain 1 upper case
// 3. contain 1 lower case
// 4. contain 1 special char
// 5. contain at least 1 digit
		
		
		
		
		String password = "Alexander1@";
		
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasSpecialChar = false;
		boolean hasDigit = false;
		
		if (password.length() >=8 ) {
			
			for(int i=0; i < password.length(); i++) {
				
				char letter = password.charAt(i);
				
				if( letter >= 'A' && letter <= 'Z') {
					hasUpperCase= true;
				}
				if( letter >= 'a' && letter <= 'z') {
					hasLowerCase = true;
				}
				if( letter >= '0' && letter <= '9') {
					hasDigit = true;
				}
				if(Character.isLetterOrDigit(letter)) {
					hasSpecialChar = true;
				}
				
				}
			}
			
		if ( hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
			
			System.out.println("PAss is vlaid");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
