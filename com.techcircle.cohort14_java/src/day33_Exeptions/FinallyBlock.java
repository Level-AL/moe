package day33_Exeptions;

public class FinallyBlock {
	public static void main(String[] args) {
		
		int a = 7, b = 0;
		
		
		try {
		int result = a/b;
		
		System.out.println(result);
		
		}catch(ArithmeticException e){
			e.printStackTrace();
		}finally {
			System.out.println("Finally block always executed!");
			System.out.println("Finally block always executed!");
			System.out.println("Finally block always executed!");
			System.out.println("Finally block always executed!");

		}
		
		System.out.println("Program is completed.");
		
		
	}
}
