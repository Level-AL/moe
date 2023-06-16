package day34_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		
		list1.addAll(Arrays.asList(3,5,7));
		
		System.out.println(list1 );
		
		List <Integer> list2 = new ArrayList<>();
		
		list2.add(2);
		list2.addAll(list1);
		list2.addAll(Arrays.asList(4,6,8));
		
		System.out.println(list2);
		
		Collections.sort(list2);
		
		System.out.println(list2);
		
		System.out.println(Collections.max(list2));
		
		System.out.println(Collections.min(list2));
		
		System.out.println("Min value is " + list2.get(0));
		
		System.out.println("Max value is " + list2.get(list2.size()-1));
		
		
		Collection <Integer> list3 = new ArrayList<>(Arrays.asList(2,1,4,22,44,66,78,9));
		
		System.out.println(list3);
		
		Integer max = 0;
		
		
		for (Integer a : list3) {
			
			if (a > max) {
				max = a;
			}
		}
		
		System.out.println(max);
		
		
		System.out.println(list3.contains(44));
		
		
		
	}
}
