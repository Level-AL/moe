package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

import day22_methodReturnValue.StringUtil;

public class Task8 {
	public static void main(String[] args) {
		
		
	ArrayList <String>	list = new ArrayList < > ();
	ArrayList <String>	list2 = new ArrayList < > ();
	
	list.add("Bea");
	list.add("Abdusamat");
	list.add("Trookie");
	list.addAll(Arrays.asList("Trookie", "Maria", "Sharuhan","Ananas"));	
	
	System.out.println(list);
	
		for (int i = list.size()-1; i >=0; i--) {
			list2.add(StringUtil.reverse(list.get(i)));
		}
		System.out.println(list2);
		
		
		
		
		
		}
	}
