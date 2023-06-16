package day13_String;

public class StringMethodReplace {

	public static void main(String[] args) {

		String str = "car car car car car car";
		String str2 = str.replace('r', 't');
		
		System.out.println(str2);
		
		String str3 = "Republican Nikki Haley enters 2024 presidential race in challenege to Trump";
		
		String str4 = str3.replace("Nikki Haley", "Irfan");
		
		System.out.println(str4);
		
		String str5 = str.replace(" ", ",");
		
		System.out.println(str5);
				
	}

}
