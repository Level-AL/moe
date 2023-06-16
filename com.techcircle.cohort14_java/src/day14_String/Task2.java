package day14_String;

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	
	/* Create a class called reverse 
	 * write a program that will reverse a string
	 * Your program should reverse a string only 5 charvters long
	 * If word is shorter display message : "Too short"
	 * If word is longer display message : "Too long" 
	 * Otherwise, reverse this word and print out resut into the console]
	 * 
	 * input :pizza
	 * output:azzip
	 * input: techcircle
	 * output: too long
	 * input :car
	 * output : too short
	 */
	
//		Scanner scan1 = new Scanner(System.in);
//	
//	
////		String input1 = "pizza" ;
//		String input2 = "techcircle";
//		String input3 = "car";
//		
//		String output1 = "";
//		String output2 = "";
//		String output3 = "";
//		
////		output1 += input1.charAt(4);
////		output1 += input1.charAt(3);
////		output1 += input1.charAt(2);
////		output1 += input1.charAt(1);
////		output1 += input1.charAt(0);
////		
//		System.out.println(output1);
//		
//		System.out.println("Enter 5 letter word to be reversed");
//		
//		String input1 = scan1.next();
//
//		
//
//		
//		scan1.close();
	Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a 5 letter word:");
    String input = scan.next();
    String output = "";
    int length = input.length();
    
    for (int i = input.length()-1  ; i >= 0 ; i--) {
        output+= input.charAt(i);
    }if( length <5) {
        System.out.println("Sorry too short");
        
        }else if (length > 5) {
            System.out.println("Sorry too long");
            
        }else {
        	System.out.println(output);
        }
    		
    		
    		scan.close();
}


}
