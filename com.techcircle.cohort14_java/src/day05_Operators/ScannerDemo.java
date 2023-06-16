package day05_Operators;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
// scanners are for user input 
//		int a = -25;
//		int b = -67;
//
//		System.out.println(a > b);

		Scanner scan = new Scanner(System.in);
		System.out.println("enter value a");

		int a = scan.nextInt();

		System.out.println("enter value b");

		int b = scan.nextInt();

		System.out.println(a > b);

		scan.close();
	}

}
