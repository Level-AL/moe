package day12_3rdReview;

import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {

		//Infinite loop, receive input from user
		
		
//		Scanner sc = new Scanner (System.in);
//		
//		int  input ;
//		while (true) {
//			
//			input= sc.nextInt();
//					
//			if ( input <=10 && input>=0) {
//				System.out.println("input is valid");
//				break;
//			}
//		}
//		
//		System.out.println("Input: "+ input);
//			
//		
//		sc.close();
		
		
//		Scanner sc = new Scanner(System.in);
//	    int input;
//	    while (true) {
//	      System.out.println("Enter number between 0 and 10");
//	      input = sc.nextInt();
//
//	      if (input <= 10 && input >= 0) {
//	        System.out.println("input is valid");
//	        break;
//	      }
//	    }
//
//	    System.out.println("Input: " + input);
//	sc.close();
	
	int y = 0;
	
	int counter = 5;
	
	do {
		System.out.println("do something");
		y++;
	}while(y>counter);
	
	
	}

}
