package day05_Operators;

import java.util.Scanner;

public class RelationalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = b - a;

		System.out.println(a == b);
		System.out.println(a == c);

		boolean result = a == b;

		System.out.println("a == b" + result);
		System.out.println(a == c);

		System.out.println(a > b);
		System.out.println(a < b);

		System.out.println(a != b);

		System.out.println(a <= c);
		System.out.println(a <= c);
		System.out.println("aaaaaaaaaaaaaaaa");

		int x = 10;
		int y = 20;
//
//		System.out.println(x == y);
//		System.out.println(x != y);
//		System.out.println(x > y);
//		System.out.println(x < y);
//		System.out.println(x >= y);
//		System.out.println(x <= y);
		
		
		
		System.out.println("------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the value of x");
		 x = scan.nextInt();
		System.out.println("enter the value of y");		
		 y = scan.nextInt();

		x=10;
		y=20;
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x >= y);
		System.out.println(x <= y);
		
		
		scan.close();
		
	}

}
