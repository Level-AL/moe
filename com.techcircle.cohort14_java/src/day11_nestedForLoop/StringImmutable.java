package day11_nestedForLoop;

public class StringImmutable {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = " techCircle";
		String str3 = "Java techCircle";
		String str4 = str1 + str2;
		
		System.out.println(str4);
		System.out.println(str3);
		
		System.out.println(str3 == str4); // false 
		
		System.out.println(str3.toUpperCase());
		System.out.println(str3);
	}

}
