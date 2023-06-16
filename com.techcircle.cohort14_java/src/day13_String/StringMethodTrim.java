package day13_String;

public class StringMethodTrim {

	public static void main(String[] args) {

		String str = "        hello";
		System.out.println(str);
		System.out.println(str.length());
		str = str.trim(); // .trim removes all the empty spaces

		System.out.println(str);
		System.out.println(str.length());

		String str2 = "hello            ";
		System.out.println(str2);
		System.out.println(str2.length());

		System.out.println(str2.trim());
		System.out.println(str2);
		str2 = str2.trim();
		System.out.println(str2);

		String str3 = "       Hello            java           ";

		System.out.println(str3);

		str3 = str3.trim();
		System.out.println(str3);
		
		

	}

}
