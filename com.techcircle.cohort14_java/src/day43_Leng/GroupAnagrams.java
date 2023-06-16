package day43_Leng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
//  [ "eat","tea", "tan", "ate", "nat" , "bat"]
	// 1      1
	// 2           2
	// 3                3 
// "eat" : 3
// "tan" : 2
// "bat" : 1
	public static void main(String[] args) {
		
		System.out.println(isAnagram("ant","nat"));
		
		groupAnagrams(new String [] {"eat","tea", "tan", "ate", "nat" , "bat"});
		
		
		
		
	}
	
	
	
	public static String [][] groupAnagrams (String [] anagramArr){
		//count the same anagrams
		//use that count to creates new String[count]
		
		
		ArrayList <String> strings = new ArrayList <>(List.of(anagramArr));
		Map <String, Integer> map = new HashMap<>();
		for (int i =0; i < strings.size(); i++) {
		  
			for(int j = i+1; j < strings.size(); j++) {
				
				String firstWord = strings.get(i);
				String secondWord = strings.get(j);
				map.put(firstWord, 1);

				boolean isAna = isAnagram(firstWord, secondWord);
				if (isAna) {
					map.put(firstWord, map.get(firstWord) + 1);
					strings.remove(j);
					j--;
				}
			}
		}
		System.out.println(strings);
		System.out.println(map);
		return null;
	}
	
	
	public static int countAnagram (String [] strArr) {
		
		return (Integer) null;
	}
	
	
	
	public static boolean isAnagram (String word1, String word2) {
		// convert to charArray
		char [] chars1 = word1.toCharArray();
		char [] chars2 = word2.toCharArray();
		// sort the array
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		//check if equal
		return Arrays.equals(chars1, chars2);

		}
	
}
