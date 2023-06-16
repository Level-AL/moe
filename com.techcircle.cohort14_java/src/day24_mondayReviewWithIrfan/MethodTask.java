package day24_mondayReviewWithIrfan;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTask {

	
// Print each char of the given string space separated ;
		
//		intput str = "abc"
//		output : a b c
		
	public static void main(String[] args) {
		
		
		printStringWithSpaceSeparated("abc");
		
		System.out.println(reverseStr("abc"));
		
		System.out.println(isPalendrome("abcBA"));
		System.out.println(isPalendrome("java"));

		String str1 = "sosb";
		String str2 = "boss";
		
		System.out.println(isAnagram(str1,str2));
		
		System.out.println("----");
		
		String str3 = removeDuplicates("aaabbbccc");
		
		System.out.println(str3.equals("abc"));
		
		System.out.println(removeDuplicates("aaabbbdddd"));

	System.out.println("-------------");
	
	
	
//	
//	String str4 = "AAABBBCCC";
//	
//	String str5 = "";
//		
//	System.out.println(str4.substring(0,1));	
//	
//	str5 += (str4.substring(0,1));
//	System.out.println(str5);
//	
//	str4 = str4.replace("A", "");
//	System.out.println(str4);
//	
//	str5 += str4.substring(0,1);
//	
//	System.out.println(str5);
//	
//	str4 = str4.replace(str4.substring(0,1), "");
//	
//    str5 += str4.substring(0,1);
//	
//	System.out.println(str5);
//	
//	str4 = str4.replace(str4.substring(0,1), "");
//	
//	System.out.println(str4.length());
//	
	
	
//	String str4 = "aabbccdd";
//	
//	String str5 = "";
//	
//	
//	while (str4.length()>0) {
//		str5 += str4.substring(0,1);
//		str4 = str4.replace(str4.substring(0,1), "");
//	}
//	
//			System.out.println(str5);
//	
//	
	
	System.out.println(removeDuplicate2("aabbccddee"));
	System.out.println("-----");
	
	
	
	System.out.println(removeDuplicate3("aabbccffggyyuu"));
	
	
	int nums [] = {1,3,5,7,9};
	
	ArrayList<Integer> list = reverseArray(nums);
	
	System.out.println(list);
	
	
	
	
	
	}
	

	
		
	
	public static void printStringWithSpaceSeparated (String str) {
	
			System.out.println(str);
			System.out.println("----------");
			for (int i =0; i < str.length(); i++ ) {
			
			System.out.println(str.charAt(i)+ " ");
			
		}
	}
		
		
	
	// return the reversed of the given string
	
	public static String reverseStr (String str) {
		
		String str2 = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		
		return str2;
		
	}
	
	// checks if the given string is palidrome (incasesensitively)
	
	public static boolean isPalendrome (String str) {
		return str.equalsIgnoreCase(reverseStr(str));
	}
	
	
// checks if the given strings are anagram, returns a boolean
	
	
	
	
	public static boolean isAnagram (String str1, String str2) {
		
		char [] arr1 = str1.toCharArray();
		char [] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1,arr2);
		
	}
	
	

// removes the duplicates from the given string, returns a new string
	
	String str = "aabbcc";
	
	public static String removeDuplicates (String str) {
		 
		String str2 = "";
		
		for ( int i = 0; i< str.length(); i++) {
			
			char currentChar = str.charAt(i);
			
			if(!str2.contains(Character.toString(currentChar))) {
				str2+= currentChar;
			}
		}
		
		return str2;
				
	}



	public static String removeDuplicate2 (String str4) {
		
//		String str4 = "aabbccdd";
		
		String str5 = "";
		
		
		while (str4.length()>0) {
			str5 += str4.substring(0,1);
			str4 = str4.replace(str4.substring(0,1), "");
		}
		
				
		
		
		return str5;
		
		
		
	}



	public static String removeDuplicate3 (String str4) {
		
//		String str4 = "aabbccdd";
		
		String str5 = "";
		
		
		while (str4.length()>0) {
			str5 += str4.charAt(0);
			str4 = str4.replace(Character.toString(str4.charAt(0)), "");
		}
		
				
		
		
		return str5;
		
		
		
	}


// write a java program that reads in 10 integers fromt tge user and stores them in
// an array list. Then, output the elements of the ArrayList in reverse order
	/* 
	 * input 1 2 3 4 5
	 * output 5 4 3 2 1
	 */

	public static ArrayList<Integer> reverseArray (int arr []){
		
		ArrayList <Integer> list = new ArrayList <> ();
		
		for (int i = arr.length ; i>=0; i--) {
				list.add(arr[1]);
		}
		
		return list;
	}





}
/*    HomeWork tasks
 * Write a Java program that creates an ArrayList of 20 random integers between 1 and 100. 
   Then, output the sum of all even numbers in the ArrayList.
 */

/*
Write a Java program that reads in a list of names from the user and stores them in an ArrayList. 
Then, sort the ArrayList in alphabetical order and output the sorted list
*/

/*Write a Java program that reads in a list of strings from the user and stores them in an ArrayList. 
 * Then, remove all duplicates from the ArrayList and output the resulting list.

*/


/*Write a Java program that reads in a list of numbers from the user and stores them in an ArrayList. Then, 
 * calculate and output the average of the numbers in the ArrayList.*/

/*
 * Write a Java program that reads in a list of integers from the user and stores them in an ArrayList. Then, 
 * remove all negative numbers from the ArrayList and output the resulting list.
 */

/*
 * Write a Java program that reads in a list of strings from the user and stores them in an ArrayList. 
 * Then, output the strings in reverse order, with each string's characters reversed
 */

