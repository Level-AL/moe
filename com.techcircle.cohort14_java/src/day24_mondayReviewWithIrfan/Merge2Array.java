package day24_mondayReviewWithIrfan;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge2Array {
	public static void main(String[] args) {
		
		int num[] = {1,3,5,7};
		int num2[] = {2,4,6,8};
		
		int num3[] = new int [num.length + num2.length];
		
		System.out.println(num3.length);
		System.out.println(Arrays.toString(num3));
		
		int index =0;
		
		for (int element : num) {
			num3[index] = element;
			index++;
		}
		
		System.out.println(Arrays.toString(num3));
		
		for (int element : num2) {
			num3[index] = element;
			index++;
		}
		
		System.out.println(Arrays.toString(num3));
		
		
		ArrayList <Integer> list = new ArrayList <> ();
		
		for (int element : num) {
			list.add(element);
		}
		
		for (int element : num2) {
			list.add(element);
		}
		
		System.out.println(list);
		
		
		// convert list to array
		
		int [] num4 = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			
			num4[i]= list.get(i);
			
		}
		
		System.out.println(Arrays.toString(num4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
