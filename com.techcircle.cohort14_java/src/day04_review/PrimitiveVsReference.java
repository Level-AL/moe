package day04_review;

import java.util.Arrays;

public class PrimitiveVsReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Copy Value
		int x = 1;
		int y = x; // y =1

		System.out.println(x);
		System.out.println(y);

		x = 2; // x= 2
		System.out.println(x);
		System.out.println(y);

	 
		int[] a = { 1 };

		int[] b = a; // b= {1}

		System.out.println(a);
		System.out.println(b);

		a[0] = 2; // ={2} changing a value here

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
 