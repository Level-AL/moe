package day19_array;

import java.util.Arrays;

public class StringSplitMethod {

	public static void main(String[] args) {

		String str = "Java is fun";
		
		String arr[] = str.split(" ");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[1]); // is
		System.out.println("------------");
		
		
		for (String s : arr) {
			System.out.println(s);
		}

		System.out.println("-------");
		
		//						0	1	2		3		
		String str2 = "BUY EURO SELL DOLLAR";
		// 			   SELL EURO BUY DOLLAR
		
		String arr2 [] = str2.split(" ");
		
		System.out.println(Arrays.toString(arr2));
		
		String str3 = arr2[2]
				.concat(" ") 
				.concat(arr2[1])
				.concat(" ")
				.concat(arr2[0])
				.concat(" ")
				.concat(arr2[3]);
		
		System.out.println(str3);
		
	}

}
