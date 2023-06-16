package day05_Operators;

public class ArithmaticOperaters {

	public static void main(String[] args) {
		// +, -, *, /, %, ++, --,

		double a = 10;
		int b = 5;

		System.out.println(a + b); // 10 + 5 = 15
		System.out.println(a - b); // 10 - 5 = 5
		System.out.println(a * b); // 10*5=50
		System.out.println(a / b); // 10 / 5 = 2
		System.out.println(a / 3); // 10 / 3 = 3

		// % remainder
		System.out.println(10 % 4); // (4+4+2)
		System.out.println(10 % 2); // 0 no remainder when divided
		System.out.println(10 % 3); // (3+3+3) 1 is the remainder
		System.out.println(11 % 2); // 1
		System.out.println(151 % 2); // 1 any odd number divided by 2 is left with 1 remainder
		System.out.println(1510 % 2);// 0 any even number has no remainder
		
		//increment ++
		int valueA= 5;
		
		System.out.println(valueA);
		
		valueA = valueA + 1;
		
		System.out.println(valueA); // 6
		
		valueA ++; //valueA = valueA + 1;
		System.out.println(valueA); // 7
		
		valueA ++;
		valueA ++;
		valueA ++;
		System.out.println(valueA); // 10 
	
		// decrement -- a = a-1
		
		valueA = 5;
		
		valueA= valueA -1; 
		System.out.println(valueA); //4
		valueA --;
		System.out.println(valueA); //3
		valueA --;
		valueA --;
		System.out.println(valueA); //1
		
	
		for (int i = 100; i > 100; i--) {
	System.out.println(i);					// a loop has its own set of curly braces
		}
	
	
	
	
	
	}

}
