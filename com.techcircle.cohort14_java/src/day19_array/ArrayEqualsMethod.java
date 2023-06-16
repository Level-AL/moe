package day19_array;

import java.util.Arrays;

public class ArrayEqualsMethod {

	public static void main(String[] args) {

		int nums[] = {1,2,3,4,5};
		int nums2[]= {1,2,3};
		int nums3[] = nums;
		int nums4[] = {3,2,1,5,4};
		
		System.out.println(Arrays.equals( nums, nums2));
		
		System.out.println(Arrays.equals(nums,nums3 ));
		
		System.out.println(Arrays.equals(nums,nums4 ));
		
		Arrays.sort(nums);
		Arrays.sort(nums4);
		System.out.println(Arrays.equals(nums,nums4 ));


	}

}
