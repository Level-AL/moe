package day19_array;

import java.util.Arrays;

public class ArraySortMethod {

	public static void main(String[] args) {
  
		int [] nums = {4,3,2,5,7,1,0};
		System.out.println(nums);
		Arrays.sort(nums);
		System.out.println(nums);
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println(nums.length);
		System.out.println(nums[6]);
		System.out.println(nums[nums.length-1]); // largest value
		
		System.out.println(nums[0]); //smallest value
		// [0, 1, 2, 3, 4, 5, 7]
		
		System.out.println(nums[nums.length-2]); // second largest value
	}

}
