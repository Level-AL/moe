package utils;

import java.util.HashMap;
import java.util.Map;

public class SolutionWithMap {
	public static void main(String[] args) {
		Integer arr [] = {1,2,3,3,3,3,2,5,2};

		Map <Integer , Integer> map = new HashMap <>();

		System.out.println(map);
		
		
		System.out.println(map.containsKey(1));
		
		map.put(1, 1);
		
		System.out.println(map);

//		System.out.println(map.containsKey(1));
		
		
//		System.out.println(map.containsKey(2)); // false
//		
//		map.put(2, 1); // added 2 1 times
//		
//		System.out.println(map); // display whole map
//
//		System.out.println(map.containsKey(2)); // true
//		
//		System.out.println("------------------");
//		
//		if (map.containsKey(2)) {
//			map.get(2);
//			System.out.println(map);
//			System.out.println(map.get(2));
//			map.put(2, map.get(2)+1);
//			System.out.println(map);
//
//		}
//		
        Integer arr2[] = {1,2,3,4,5,6,7,8,9,10,6,7,8,9,10};
        Map<Integer, Integer> map1 = new HashMap<>();
        
        
        for (Integer num : arr2) {
            ///System.out.println(num);
            
            if (!map1.containsKey(num)) {
                map1.put(num,1);
            }else {
                map1.put(num, map1.get(num)+1);
            }
            
        }
        
        System.out.println(map1);
		
		
	}
}
