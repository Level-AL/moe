package day19_array;

public class MaxValueFromAnIntArray {

	public static void main(String[] args) {

		int nums [] = {900,2,400,600,1}; 
//		
//		System.out.println(nums[0]); // 90
//		System.out.println(nums[1]); // 2
//		System.out.println(nums[2]); // 400
//		System.out.println(nums[3]); // 6
//		System.out.println(nums[4]); // 1
		
		int maxVal = 0;
//		
//		if(nums[0] > maxVal) {
//			maxVal = nums[0];
//		}
//		
//		System.out.println(maxVal);
//		
//		if(nums[1] > maxVal) {
//			maxVal = nums[1];
//		}
//		
//		System.out.println(maxVal);
//		
//		if(nums[2] > maxVal) {
//			maxVal = nums[2];
//		}
//		
//		System.out.println(maxVal);
//		
//		if(nums[3] > maxVal) {
//			maxVal = nums[3];
//		}
//		
//		System.out.println(maxVal);
		
		
		for (int i = 0; i < 5; i++) {
			 System.out.println(nums[i]);
		
		if(nums[i] > maxVal) {
			maxVal = nums[i];
		}
		
		}
		
		 System.out.println("Max Value is: "+maxVal);
	}

}
