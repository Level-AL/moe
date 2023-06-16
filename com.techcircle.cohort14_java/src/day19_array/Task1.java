package day19_array;

public class Task1 {

	public static void main(String[] args) {

String n[]  = {     "Alex Abi-Aad",
					"Wilson Tannous",
					"Jawad Iskandar",
					"Khalil Abdullah",
					"Jad Iskandar",
					"Level AL",
					"Sam Booth",
					"Micheal Jordan",
					"Lebron James",
					"Kobe Bryant"};
//
//	System.out.println(n[0].substring(0,1)+ "." + n[0].charAt(n[0].indexOf(" ")+1));
//	System.out.println(n[1].substring(0,1)+ "." + n[1].charAt(n[1].indexOf(" ")+1));
//	System.out.println(n[2].substring(0,1)+ "." + n[2].charAt(n[2].indexOf(" ")+1));
//	System.out.println(n[3].substring(0,1)+ "." + n[3].charAt(n[3].indexOf(" ")+1));
//	System.out.println(n[4].substring(0,1)+ "." + n[4].charAt(n[4].indexOf(" ")+1));
//	System.out.println(n[5].substring(0,1)+ "." + n[5].charAt(n[5].indexOf(" ")+1));
//	System.out.println(n[6].substring(0,1)+ "." + n[6].charAt(n[6].indexOf(" ")+1));
//	System.out.println(n[7].substring(0,1)+ "." + n[7].charAt(n[7].indexOf(" ")+1));
//	System.out.println(n[8].substring(0,1)+ "." + n[8].charAt(n[8].indexOf(" ")+1));
//	System.out.println(n[9].substring(0,1)+ "." + n[9].charAt(n[9].indexOf(" ")+1));

		for (String name : n) {
		String str = name ; // A.A
		String arr[] = str.split(" ");
		String firstName = arr[0].toUpperCase();
		String lastName = arr[1].toUpperCase();
//		System.out.println(firstName);
//		System.out.println(lastName);
		
		System.out.println(firstName.charAt(0)+ "." + lastName.charAt(0));
		}
	   
	}
}


