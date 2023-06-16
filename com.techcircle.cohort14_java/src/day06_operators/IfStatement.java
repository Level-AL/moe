package day06_operators;

public class IfStatement {

	public static void main(String[] args) {
		
		int count = 2;
		int total = 4;
		
//		if (condition) {
//			true block
//			} else {
//				false block 
//			}
		
		
		if ( count < 3) {
			total = 0;
		}else {
			total += count;
		}
		
		System.out.println(total);
		
		if ( count > 3) {
			total = 0;
		}else {
			total += count;
		}
		
		System.out.println(total);
		
		
		
		
		
		// everOrOdd
		
		int num = 5;
		
		if(num % 2 == 0) {
			
			System.out.println("Even");
			System.out.println("Even");
			System.out.println("Even");
			System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
		
	}

}
