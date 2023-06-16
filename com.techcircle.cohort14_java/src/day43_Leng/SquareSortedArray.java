package day43_Leng;

import java.util.Arrays;

public class SquareSortedArray {
 /*
  * input : [ -4, -1, 0, 3, 10]
  * output : [ 0, 1, 9, 16, 100]
  * */
	public static void main(String[] args) {
		
		int [] arr = squareArray(new int [] {-4, -1, 0, 3, 10});
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	
	public static int [] squareArray (int [] arr) {
		
		for (int i =0; i < arr.length; i++) {
			arr[i] = (int)Math.pow(arr[i],2);
			// arr[i] =* arr[i]
		}
		
		return arr;		
	}
}
