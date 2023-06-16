package day06_operators;

public class OmittingElsePart {

	public static void main(String[] args) {

//		syntax:
//			if ( condition ) {
//				true block
//			}else {
//				false block
//			}

		int num = 5;

		if (num % 2 == 0) {
			System.out.println("Even");
		}

		if (num % 2 == 1) {
			System.out.println("Odd");
		}

		int num2 = 9;
		int max = 0;

		
//		if (num > num2) {
//			max = num;
//		} else {
//			max = num2;
//		}						^these 2 codes have the same result. Both work.m
		
		if (num > num2) {
			max = num;
		}
		
		if (num < num2) {
			max= num2;
		}
		
		System.out.println("the value of max is: " + max);
		
		
//		if (conditionA && conditionB) {
//			true block
//		}
		
		
		int score = 179;
		
		if (score >= 0 && score <= 100) {
		
			if (score >= 90 && score <=100) {
				System.out.println("A");
			}
			
			if (score >= 75 && score <=79) {
				System.out.println("C+");
			}
			
			
		}else {
			System.out.println("Invalid Score");
		}
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
