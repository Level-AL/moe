package day33_Exeptions;

public class TraditionalWayOfHandlingError {
	public static void main(String[] args) {
		
		int a = 7 , b = 0;
		
		if (b != 0) {
			System.out.println("Result is " + a/b);
		}else {
			System.out.println("B is zero");
		}
		System.out.println("Program is completed");
		
		
		String str = null;
		
		
		
		if (str != null) {
			System.out.println(str.length());
		}else {
			System.out.println("String is null");
		}
		
	
		
		int nums [] = {1,2,3,4,5};
		
		
		
		if (nums.length >= 10) {
			System.out.println(nums[10]);
		}
		System.out.println(nums[1]);
		
	}
}
