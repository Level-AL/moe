package day34_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatedValueFromAnArray {
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,2,3,4,5};
		
//		output :
//			[1,2,3,4,5]
//		int n = arr.length;
//		 
//		for (int i = 0; i < n; i++) {
//	       for (int j = i + 1; j < n; j++) {
//	             if (arr[i] == arr[j]) {
//	                 arr[j] = arr[n - 1];
//	                  n--;
//	                  j--;
//	                }
//	            }
//	        }
//		int [] result = Arrays.copyOf(arr, n);
//		System.out.println(Arrays.toString(result));
		
	
	Set <Integer> set = new HashSet <>();
	
		for (int i = 0; i <arr.length; i++) {
//			System.out.println(arr[i]);
			set.add(arr[i]);
		
		}
	
			System.out.println(set);
	
	
			
		String str = "TechCircle";
		
		str = str.toLowerCase();
		
		char [] chars = str.toCharArray();
		
		Set <Character> set2 = new HashSet <>();
		
		for (int i = 0; i < chars.length; i++) {
			set2.add(chars[i]);
		}
		
			System.out.println(set2);
			
//			Collections.sort(set2);
			
			RemoveDuplicatedValueFromAnArray r = new RemoveDuplicatedValueFromAnArray();
			
			r.sort(set2);
			
			System.out.println(r.sort(set2));
			
			 
			
			
	}
	
	
	public  char [] sort (Set<Character> set) {
		
		char charArr [] = new char[set.size()];
		int index = 0;
		for (Character c : set) {
			charArr [index]= c;
			index++;
		}
		
		Arrays.sort(charArr);
		
		return charArr;
	}

	

	 
	 
	 
	 
	 
	 }

	
	 
	
	
	
	
	
	
	
	 
	

