package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
	public static void main(String[] args) {
		
		/* Write a return method that can concat two arrays
		 * input: arr1 = {1,2,3} , arr2 = {1,2,3,4}
		
		 * output: {1,2,3,1,2,3,4}*/
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {1, 2, 3, 4};
		int[] result = concatArrays(arr1, arr2);
		System.out.println(Arrays.toString(result)); 
		
		
		}
	
	
	
	public Integer [] combineTwoArray(Integer [] arr1, Integer [] arr2) {
		
		List <Integer> list = new ArrayList <>();
		list.addAll(Arrays.asList(arr1));
		list.addAll(Arrays.asList(arr2));
		
		Integer [] numArr = new Integer [list.size()];
		
		for (int i = 0; i <numArr.length; i++) {
			numArr[i] = list.get(i);
		}
		
		return numArr;
	}
	
	
	
	public static int[] concatArrays(int[] arr1, int[] arr2) {
	    ArrayList<Integer> tempList = new ArrayList<Integer>();
	    for (int element : arr1) {
	        tempList.add(element);
	    }
	    for (int element : arr2) {
	        tempList.add(element);
	    }
	    int[] result = new int[tempList.size()];
	    for (int i = 0; i < tempList.size(); i++) {
	        result[i] = tempList.get(i);
	    }
	    return result;
	}
}
