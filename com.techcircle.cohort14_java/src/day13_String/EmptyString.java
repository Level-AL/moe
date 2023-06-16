package day13_String;

public class EmptyString {

	public static void main(String[] args) {

		String str = "";
		System.out.println(str);
		System.out.println(str.length());

		String str2 = new String();
		System.out.println(str2);
		System.out.println(str2.length());

		str += 'a';
		System.out.println(str);

		char letter = 'c';
		str += letter;
		System.out.println(str);

		str = str + 'b';
		System.out.println(str);

		str = str + "d";
		System.out.println(str); // acbd
		
		str += 5;
		System.out.println(str); //acbd5

	}
}
