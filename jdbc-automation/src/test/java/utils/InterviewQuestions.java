package utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InterviewQuestions {
	public static void main(String[] args) {
		
		Integer arr [] = {1,2,3,3,3,3,2,5,2};
		
// Write a java code to display frequency of each unique element 
		
//		1 1
//		2 3
//		3 4
//		5 1
		
//		System.out.println(frequencyOfElement(arr,1));
//		
//		System.out.println(frequencyOfElement(arr,2));
//		
//		System.out.println(frequencyOfElement(arr,3));
//
//		System.out.println(frequencyOfElement(arr,5));


		Set <Integer> set = new HashSet <>(Arrays.asList(arr));
		System.out.println(set);
		
		for (Integer i : set) {
			System.out.println(i + " = "+frequencyOfElement(arr,i));

		}
		
		
		
//		for (int num : arr ) {
//			System.out.println(frequencyOfElement(arr,num));
//
//		}
//		
		
		// Solution with MAP
		// Map is key value pair --> key is unique , cannot be duplicated
		
		Map <Integer , Integer> map = new HashMap <>();
		
		for (Integer num : arr) {
//			System.out.println(num);
			
			if(!map.containsKey(num)) {
				map.put(num, 1);
			}else {
				map.put(num, map.get(num)+1);
			}
		}
		System.out.println(map);
		
		
	} //main end
	
	// frequency of an element 
	
	public static int frequencyOfElement(Integer [] arr, int targetElement) {
		int count = 0;
		
		for (int element : arr) {
			if (element == targetElement) {
				count ++;
			}
		}
		
		
		
		return count;
	}
	
	
	
	
	
}
