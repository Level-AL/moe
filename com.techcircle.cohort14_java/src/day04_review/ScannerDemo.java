package day04_review;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		// Scanner class => accept input from user

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name?");
		//String input = scanner.nextLine();

		//int input = scanner.nextInt();
		
		double input = scanner.nextDouble ();
		
		System.out.println(input); 
		
		// .next() = will capture the word until the white space
		// .nextLine()= will capture the whole line
		// .nextInt()=> integer
		// .nextDouble()= double
		// .nextBoolean = boolean 
 		        
		    
		
		
		
		
		
		scanner.close();
	}

}
      