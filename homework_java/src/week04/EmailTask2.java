package week04;

public class EmailTask2 {

	public static void main(String[] args) {

		String email = "angelo_bossman@aws.com";
		
		int underScore = email.indexOf("_");
		
		String firstName = email.substring(0,underScore);
		
//		System.out.println(firstName);
		
		String lastName = email.substring(underScore + 1, email.indexOf("@"));
		
//		System.out.println(lastName);
		
		String domain  = email.substring(email.indexOf("@")+1, email.indexOf("."));
		
//	    System.out.println(domain);
	 
	    firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1) ;
	    lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
	    
		
		System.out.println("First name: "+ firstName);
		System.out.println("Last name: "+ lastName);
		System.out.println("Domain: " + domain);
	}

}
