package day24_mondayReviewWithIrfan;

import java.util.Arrays;

public class TestingClass {

	public static void main(String[] args) {

		
		Method.printHello();
		
		Method.sayHelloToSomeone("Miran");
	
		String msg = Method.message("Miran");
	
		System.out.println(msg);
		
		char[] msg2 = Method.messagewithCharArray("TechCircle!!23!!");
		
		System.out.println(msg2);
		
		System.out.println(Arrays.toString(msg2));
		
		Arrays.sort(msg2);
		
		System.out.println(Arrays.toString(msg2));
	}

}
