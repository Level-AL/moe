package week02;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

//		Write a program that takes a user's 
//		score as input and prints out their letter 
//		grade based on the following scale: 
//		A = 90-100 B = 80-89 C = 70-79 D = 60-69 F = 0-59
	
	
		Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter your score: ");
		int score = scan.nextInt();
	
		if (score <=59) {
			System.out.println("Your grade is F");
		}
		
		if (score >= 60 && score <= 69) {
			System.out.println("Your grade is D");
		}
		
		if ( score >=70 && score <= 79) {
			System.out.println("Your grade is C");
		}
		
		if (score >=80 && score <=89) {
			System.out.println("Your grade is B");
		}
		
		if (score >=90 && score <=100) {
			System.out.println("Your grade is A");
		}
		scan.close();
	
	}

}
