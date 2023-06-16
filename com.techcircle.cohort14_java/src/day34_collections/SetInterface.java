package day34_collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {
// Cannot have duplicated dtat or element 
	public static void main(String[] args) {
			
		HashSet <Integer> set1 = new HashSet <>();
		
		set1.add(1);
		set1.addAll(Arrays.asList(2,3,3,3,3,3,3,3));
			
		System.out.println(set1.size());	
			
		System.out.println(set1);
		
									//optional "String"
		Set <String> set2 = new HashSet<String>();
		
		set2.addAll(Arrays.asList("A","B","C"));
		
		
		Collection <String> set3 = new HashSet <>();
		
		set3.add("A");
		
		set3.addAll(set2);
		
		set3.clear();
		
		set3.addAll(set2);
		
		System.out.println(set3);
		
		
		
		
		  
		
		
		
		
		
		
		
		
			
	}
}
