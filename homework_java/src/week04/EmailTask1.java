package week04;

public class EmailTask1 {

	public static void main(String[] args) {

		String email = "nigga123_isk@gmail.com";
		
		int underscore = email.indexOf("_");
		 
		String firstName = email.substring(0, underscore);
		
//		System.out.println(firstName);
		
		String lastName = email.substring(underscore +1 , (email.indexOf("@")));
		
//		System.out.println(lastName);
		
		System.out.println(lastName + "_" + firstName + (email.substring(email.indexOf("@"))));
	}

}
