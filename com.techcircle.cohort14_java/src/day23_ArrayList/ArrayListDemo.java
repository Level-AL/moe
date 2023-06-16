package day23_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

//		ArrayList <DataType> variableName = new ArrayList <>();
		
		int [] nums = new int [3]; 

		System.out.println(nums.length);	
		
		nums[0] = 5;
		nums[1] = 3;
		nums[2] = 1; 
		
		ArrayList <Integer> list = new ArrayList <> ();		
		System.out.println(list.size());
		list.add(5);
		list.add(3);
		list.add(1);
		System.out.println("-----------");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		System.out.println(list.size());

		list.add(5);
		list.add(3);
		list.add(1);
		
		System.out.println(list.size());

		
		ArrayList <Character> list1 = new ArrayList <> ();		

		list1.add('a');
		list1.add('a');
		list1.add('a');

		
		
	}

}
