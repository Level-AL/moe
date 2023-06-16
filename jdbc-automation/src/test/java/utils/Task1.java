package utils;

import java.util.Arrays;

public class Task1 {
//   Write a function that can find the maximum number from an int Array
	
		public static void main(String[] args) {
			
			
			        int[] arr = {1,2,4,5,7,89};

			        int max = arr[0];
			        for (int i = 1; i < arr.length; i++) {
			            if (arr[i] > max) {
			                max = arr[i];
			            }
			        }

			        System.out.println("The maximum number in the array is: " + max);
			   
		}
	
		public int getMaxValue (int arr[]) {
			
			Arrays.sort(arr);
			
			
			
			return arr.length -1;
		}
		
		public static int returnMax(int[] a) {
	        int max = 0;
	        for (int i : a) {
	            if (i > max) {
	                max = i;
	            }
	        }
	        return max;
		}
		
		
			}

			

			
			
		
