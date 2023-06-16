package day10_forLoop;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in) ;
			
			System.out.println("What are you and your date stylishness?");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt(); 
			
			System.out.println(num1 + " " + num2);
			scan.close();
		
		
		
	}

}
