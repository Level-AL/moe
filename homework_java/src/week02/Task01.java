package week02;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

	//Write a program that takes a user's age as input and prints out if the 
		//user is an adult or a minor. 
		//The legal age of adulthood is 18 years.
	
	
		Scanner scan = new Scanner(System.in);
		
		 System.out.print("Enter your age: ");
	        int age = scan.nextInt();
	        if (age >= 18) {
	            System.out.println("You are an adult.");
	        } else {
	            System.out.println("You are a minor.");
	        }
		
	        scan.close();
	}

}
