package day13_String;

public class StringMethodChatAt {
public static void main(String[] args) {
//				  0123	
	String str = "Java";
	
// chatAt(i); // Returns the char at position i.
	
//	System.out.println(str);
//	System.out.println(str.charAt(0));
//	System.out.println(str.charAt(1));
//	System.out.println(str.charAt(2));
	System.out.println(str.charAt(3));

	
	System.out.println(str.length()); //4
	
	System.out.println("----------");
	
//	for(int i = 0; i < str.length(); i++) {
//		System.out.println(i);
//		System.out.println(str.charAt(i));
//	}
//				    01234
	String fruit = "Apple";
	
	System.out.println(fruit.charAt(4));
	System.out.println(fruit.charAt(3));
	System.out.println(fruit.charAt(2));
	System.out.println(fruit.charAt(1));
	System.out.println(fruit.charAt(0));
//	System.out.println(fruit.charAt(10)); // prints error since doesn't
											// have enough characters
	System.out.println("---------------");
	
	String str2 = "ab";
	String str3 = "";
	
	str3 += str2.charAt(1); // b is assigned to str3
	System.out.println(str3);

	str3 += str2.charAt(0); // a is assigned to str3
	System.out.println(str3);
	
	
	
	
	
	
}
}

