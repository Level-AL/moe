package day42_JavaInterview;

import java.util.Arrays;

public class StringTasks {
	public static void main(String[] args) {
		//Write a java program to check if two strings are anagrams
		// for example, race and care
		
		Boolean result = isAnagram("race","care");
		System.out.println(result);
		System.out.println(isAnagram("race","care"));
		
		System.out.println(isPalindrome("aba   "));
		 
	}
	
	public static Boolean isAnagram (String str1, String str2) {
		
		char [] arr1 = str1.toLowerCase().toCharArray();
		char [] arr2 = str2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		
		return Arrays.equals(arr1, arr2);
	}
	
	public static Boolean isPalindrome (String str1) {
		
		StringBuilder sb = new StringBuilder (str1);
	
		
		return sb.reverse().toString().equals(str1);
	}
}
