package week02;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program that takes a letter grade as 
		//input (A, B, C, D, or F) and prints whether 
		//the grade is passing or failing. A grade of 
		//A, B, or C is considered passing, and a grade of 
		//D or F is considered failing.
	
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your grade (A, B, C, D, or F): ");
	        String grade = sc.nextLine();
	        if (grade.equals("A") || grade.equals("B") || grade.equals("C")) {
	            System.out.println("You have passed.");
	        } else if (grade.equals("D") || grade.equals("F")) {
	            System.out.println("You have failed.");
	        } else {
	            System.out.println("Invalid grade entered.");
	        }
	
	
	}

}
