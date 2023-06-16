package day34_collections;

import java.util.HashSet;
import java.util.Set;
//Write a program to print frequency of each character from a string
//input: apple
//output:
//a 1
//p 2
//l 1
//e 1

public class Task2 {
	 public static void main(String[] args) {
			
		 String input = "apple";
//		 char targetChar = '1';
//		 int count = 0;
////		 printFrequency(str);
////		 System.out.println(str);
//		 
//		 for (int i = 0; i < input.length(); i++) {
//	            System.out.println(input.charAt(i));
//	            
//	            if (input.charAt(i) == targetChar) {
//	            	count++;
//	            }
//	        }
//		 System.out.println(targetChar+" occured " + count + " times");
		 
	Set <Character> set = new HashSet <>();
		 for (int i = 0; i < input.length(); i++) {
			 set.add(input.charAt(i));
		 }
	 System.out.println(set);
	 
	 
	 for (Character c : set) {
		 System.out.println(charCount(input, c));
	 }
	 
	 
	 
	 
	 
	 }
    
//	    public static void printFrequency(String str) {
//	        Set<Character> charSet = new HashSet<>();
//	        for (int i = 0; i < str.length(); i++) {
//	            charSet.add(str.charAt(i));
//	        }
//	        for (char c : charSet) {
//	            int frequency = 0;
//	            for (int i = 0; i < str.length(); i++) {
//	                if (c == str.charAt(i)) {
//	                    frequency++;
//	                }
//	            }
//	            System.out.println(c + " " + frequency);
//	        }
//	    }
	 
	 public static int charCount (String input, char targetChar) {
		 int count = 0;
		 for (int i = 0; i < input.length(); i++) {
         System.out.println(input.charAt(i));
         
         if (input.charAt(i) == targetChar) {
         	count++;
         }
     }
	 System.out.println(targetChar+" occured " + count + " times");
		 
		 
		 
		 
		 
		 return count;
	 }
}
