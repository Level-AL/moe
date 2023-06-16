package week02;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

//		 Write a program that takes two integers as 
//		 input and prints "The numbers are equal" if 
//		 they are equal, "The first number is greater" 
//		 if the first number is greater, and "The second "
//		 "number is greater" if the second number is greater.
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int firstNumber = sc.nextInt();
	        System.out.print("Enter the second number: ");
	        int secondNumber = sc.nextInt();
	        if (firstNumber == secondNumber) {
	            System.out.println("The numbers are equal.");
	        } else if (firstNumber > secondNumber) {
	            System.out.println("The first number is greater.");
	        } else {
	            System.out.println("The second number is greater.");
	        }
		
		
		
	}

}
