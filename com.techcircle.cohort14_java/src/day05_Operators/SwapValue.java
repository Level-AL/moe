package day05_Operators;

public class SwapValue {

	public static void main (String []args) {
		
	
	int a = 5;
	int b = 10;
	
	a= a+ b;
	b= a-b;
	a= a-b;
	
	System.out.println(a);
	System.out.println(b);
	
	
	int x = 5;
	int y = 10;
	
	int temp = x;
	x= y;
	y= temp;
	
	System.out.println(x);
	System.out.println(y);
	
	
	}
}
