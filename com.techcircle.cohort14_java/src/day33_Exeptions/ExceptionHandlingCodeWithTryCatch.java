package day33_Exeptions;

public class ExceptionHandlingCodeWithTryCatch {
	public static void main(String[] args) {
		int a = 7 , b = 0;
		
		
		try {
		int result = a/b;
		System.out.println(result);
		}catch(Throwable e) {
			// exception handling code here
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Program is completed");
		
		
		System.out.println("You can run next test case");
	}
}
