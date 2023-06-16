package day06_operators;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {

		int a, b;
		a = 10;
		b = (a == 1) ? 20 : 30;
	//  b = condition ? true block : false block;
		System.out.println("The value of b is: " + b);

		b = (a == 10) ? 20 : 30;

		System.out.println("The value of b is: " + b);

		int num = 23;
		
		String oddOrEven =  ( num % 2==0) ? "even" : "odd" ;      
	
		System.out.println("Is num odd or even: " + oddOrEven );
	
	}

}
