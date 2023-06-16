package week02;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
// write a program that takes an integer 
// as input and prints whether the number is even or odd
	
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = sc.nextInt();
	        if (number % 2 == 0) {
	            System.out.println(number + " is an even number.");
	        } else {
	            System.out.println(number + " is an odd number.");
	        }
	
	
	
	}

}
