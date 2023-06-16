package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
	public static void main(String[] args) {
		
//	ArrayList <dataType> list = new ArrayList <dataType but optional> ();
		
		ArrayList <String> list = new ArrayList <String> ();
		
		list.add("Bea");
		list.add("Abdusamat");
		list.add("Trookie");
		
		System.out.println(list);
		System.out.println(list.size());
		
		list.add("Arezoo");
		
		System.out.println(list);

		
		// read element
		
		System.out.println(list.get(0));
		
		System.out.println(list.get(3));
		
		System.out.println(list.get(list.size()-1));
		
		
		list.add("Elizat");
		
		System.out.println(list.get(list.size()-1));

		
		list.set(2, "Alex");
		System.out.println(list);
		
		
		list.remove(0);
		
		System.out.println(list);
		
		list.remove("Abdusamat");
		
		System.out.println(list);
		
		
		ArrayList <String> list2 = new ArrayList <String>();
		
		list2.add("Waranya");
		list2.add("Payz");
		list2.add("Aytursun");
		
		System.out.println(list2);
		list2.addAll(list);
		
		System.out.println(list2);
		
		list2.addAll(Arrays.asList("Trookie", "Maria", "Sharuhan","Ananas"));
		
		System.out.println(list2);
		
		
		
		
		
		
		
		
		

	}
}
