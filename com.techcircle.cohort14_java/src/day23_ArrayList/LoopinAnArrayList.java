package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopinAnArrayList {
	public static void main(String[] args) {

	ArrayList <String> list = new ArrayList <String> ();
		
		list.add("Bea");
		list.add("Abdusamat");
		list.add("Trookie");
		list.addAll(Arrays.asList("Trookie", "Maria", "Sharuhan","Ananas"));		
		
		System.out.println(list);
		
		System.out.println(list.size()); // number of element in the list
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		
		for (int i=0; i < list.size(); i++) {
//				System.out.println(i);
				System.out.println(list.get(i));
		}
		
		System.out.println("----------");
		// using for loop
		for (String s: list) {
			System.out.println(s);
		}
		
		System.out.println("----------");
		
//		using a do while loop
		int index = 0;
		
		do {
			System.out.println(list.get(index));
			index++;
		}while (index < list.size());
		
		System.out.println("---------");
		// using while loop
		index = 0; // index reset
		
		while(index < list.size()) {
			System.out.println(list.get(index));
			index++;
		}
		
		
		
		
		
		
			
		
		
		
		
	}

}
