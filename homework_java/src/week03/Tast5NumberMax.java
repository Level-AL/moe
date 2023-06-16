package week03;

import java.util.Scanner;

public class Tast5NumberMax {

	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);
		int maxNumber = Integer.MIN_VALUE;
		System.out.println("Enter 5 random digits: ");
		
		for (int i = 1; i<=5; i++) {
			int number = input.nextInt();
			
			if(number>maxNumber)
			{
				maxNumber = number;
			}
			}
			
		System.out.println("The greatest number is: "+ maxNumber);
		
		
		
		input.close();
		
		
	}

}
