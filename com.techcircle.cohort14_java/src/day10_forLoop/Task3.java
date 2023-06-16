package day10_forLoop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Input positive number to recive a "
				+ "multiplaction table");
		
		
		 int input = scan.nextInt();     
		 for (int a = 1; a <= 10; a++) {        
			 System.out.println(input + " x " + a + " = " + input * a); 
			 
		}
		
		scan.close();
		
		
		
	}

}
