package day10_forLoop;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
	
		Random random = new Random();
		
		int secretNumber = random.nextInt(100);
		
		System.out.println("A number is chosen between 1 to 100");
		 System.out.println("Guess a number within 5 trials");
	
		 Scanner scan = new Scanner(System.in);
		 
		 int attempCount = 0;
		 boolean isFound = false;
		 
		 for (int i= 1; i<6; i++) {
			 
			 System.out.println("Guess a number:");
			 
			 int num = scan.nextInt();
			 
			 if (num == secretNumber) {
				 System.out.println("Congrats, You guessed the number!!");
				 break;
			 }else if(num > secretNumber) {
				 System.out.println("Too high");
			 }else { 
				 System.out.println("Too low");
			 }
		
			 
			 attempCount ++;
	}
		 if(!isFound) {
			 System.out.println("Secret Number is: " + secretNumber);
		 }
		 System.out.println("Game over, see you next time!");
		 
	scan.close();
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
