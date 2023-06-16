package day21_Method;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		addition(5, 10);
//		addition(5, -10);
//		
//		
//		multiplication(0,7); 
//		
//		multiplication(-10,-7); 

//		Create method for - , *  , / 
		
		calculator(1,2,"+");
		calculator(1,2,"*");
		calculator(1,2,"-");
		calculator(1,2,"/");
		
		

	}

	public static void addition (int a, int b) {

//		int a = 5;
//		int b = 10;
		System.out.println( a+ b);

	}

//	public static void addition() {
//		
//		int a = 5;
//		int b = 10;
//		System.out.println(a + b);
//		
//	}

	
	public static void calculator(int a , int b, String operator) {
		if (operator.equals("+")) {
			addition(a,b);
		}else if (operator.equals("-")) {
			subtraction(a,b);
		}else if (operator.equals("*")) {
			multiplication(a,b);
		}else if (operator.equals("/")) {
			divison(a,b);
		}else {
			modulus(a,b);
		}
	}
	
	
	

	public static void subtraction(int a, int b) {
		System.out.println(a - b);
	}

	public static void divison(int a, int b) {
		System.out.println(a / b);
	}

	public static void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public static void modulus(int a, int b) {
		System.out.println(a % b);
	}
	
	
	/// Write a method that accepts a string parameter and display reverse string 
	/// input = "abc"
	//  output = "cba";
	
	
	}


