package day04_review;

public class swapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		int y = 2;
		System.out.print("x : ");
		System.out.println(x); // 1
		System.out.print("y : ");
		System.out.println(y); // 2

		// swap value in these 2 variables
		// x :2
		// y :1

		int temp = x;
		x = y;
		y = temp;
		System.out.println(x);
		System.out.println(y);

		int a = 5;
		int b = 1;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	
	
	}

}
