package day42_JavaInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayTask {

	/*
	 *Write a program that can move all the zeros to the end of an array 
	 * */
		public static void main(String[] args) {
			
			int arr[] = {14,33,0,0,66,0,0,86,0,43};
			ArrayTask at = new ArrayTask ();
			at.moveZeroTotheEndOfArray(arr);
			
			int arr1[] = {1,1,1,2,2,2,3,3,34,4,4,};
			 
			removeDuplicates(arr1); 
			
		}
		
		// syntax:
		// accessModifier returnType methodName (Parameters) {
		//		Method Body
		//	}
		

	    
	    
	    
	    public int[] moveZeroTotheEndOfArray(int arr[]) {
	        System.out.println("Before: " + Arrays.toString(arr));
	        int nz = 0; // first pointer
	        int z = 0; // second pointer
	        int size = arr.length;

	        if (size == 0 || size == 1) {
	            return arr;
	        }

	        while (nz < size) {
	            if (arr[nz] != 0) {
	                int temp = arr[nz];
	                arr[nz] = arr[z];
	                arr[z] = temp;
	                nz++;
	                z++;
	            } else {
	                nz++;
	            }
	        }
	        System.out.println("After: " + Arrays.toString(arr));
	        return arr;
	    }
	
	    /*Write a function that can remove the duplicates from an array of integers
	     * input : {1,3,2,4,2,3,4}
	     * output: {1,2,3,4}
	     * */
	    
	    public static Set <Integer> removeDuplicates (int [] arr){
	    	Set <Integer> set = new HashSet <>();
	    	
	    	for (int i: arr) {
	    		set.add(i);
	    	}
	    	System.out.println(set);
	    	return set;
	    }
	    
	
}
