package day05_Operators;

import java.util.Scanner;

public class Task3 {
//Task 3 Write a Java program that prompts the user to enter three 
//integer values. The program should then compare each pair of values 
//using the relational operators and print the results to the console. 
//For example, if the user enters the values 10, 20, and 30, the program 
//should output:

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z = 30;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the value of x:");
		x = scan.nextInt();
		System.out.println("Enter the value of y:");
		y = scan.nextInt();
		System.out.println("Enter the value of z:");
		z = scan.nextInt();

		System.out.println(x + " " + y + " " + z);

		scan.close();

		boolean result1 = x < y;
		System.out.println(x < y);
		System.out.println("x<y" + result1);
		System.out.println(x + "<" + y + " " + result1);
	}
}
