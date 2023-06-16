package day34_collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
	public static void main(String[] args) {
		
//		Map <key, value> variableName = new HashMap <>();
		
		Map <String , Integer> phoneBook = new HashMap <>();
		
		phoneBook.put("Shafkat", 1234556443 );
		phoneBook.put("peys", 6456789 );
		phoneBook.put("TechCircle", 800);
		
		// read value'
		System.out.println(phoneBook.get("peys"));
		
		phoneBook.put("peys", 645689789);
		System.out.println(phoneBook.get("peys"));
		
		System.out.println(phoneBook.size());
		
		System.out.println(phoneBook.get("Abdul"));
		
		
		System.out.println(phoneBook.containsKey("Shafkat"));
		System.out.println(phoneBook.containsKey("Syed"));
		
		
		
		for (Map.Entry<String, Integer> entry: phoneBook.entrySet()) {
			
			System.out.println("Key : " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
			System.out.println("**********");
		}
		
	}
}
