package day22_methodReturnValue;

import java.util.Arrays;

public class Task {

	public static void main(String[] args) {

// Create a method that accepts an array of integers and returns largest value
		
		
//		int nums[] = {4,100,1,9,3};
//		int maxVal = 0;
//		
//		Arrays.sort(nums);
//		
//	System.out.println(Arrays.toString(nums));
//	System.out.println("The largest number is: "+nums[nums.length -1]);
		
		
		
		
		
		//		for (int i = 0; i < 5; i++) {
//			
//			System.out.println(nums[i]);
//			
//			if(nums[i] > maxVal) {
//				maxVal = nums[i];
//			}
//		}
//				System.out.println("The largest number is: "+maxVal);
	
		
		
		int nums[] = {4,100,1,9,3};
		
		System.out.println(maxValue(nums));
		
	
	}		
	

	
	
	public static int maxValue (int nums[]) {
		
		int maxVal = 0;
				for (int i = 0; i < 5; i++) {
		
		System.out.println(nums[i]);
		
		if(nums[i] > maxVal) {
			maxVal = nums[i];
					}
				}
				return maxVal;

	}
}
