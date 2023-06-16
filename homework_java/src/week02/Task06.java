package week02;

import java.util.Scanner;

public class Task06 {

public static void main(String[] args) {
	
//	 Write a program that takes an integer as input and 
//	 checks if it's positive, negative, or zero.

	 Scanner sc = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     int number = sc.nextInt();
     if (number > 0) {
         System.out.println(number + " is a positive number.");
     } else if (number < 0) {
         System.out.println(number + " is a negative number.");
     } else {
         System.out.println(number + " is zero.");
     }


}


}
