package day14_String;

public class GetDomainName {

	public static void main(String[] args) {
// Write a program to get domain name from an email
		
		String email = "angelo.abiaad@hotmail.fr"; // -- gmail
		
		System.out.println(email.substring(15,20));
		System.out.println("-----");
		int indexOfAt = email.indexOf('@') +1 ;
		int indexOfDot = email.lastIndexOf('.');
		
		System.out.println(email.substring(indexOfAt, indexOfDot));
		
		String firstName = email.substring(0, email.indexOf('.'));
		System.out.print(firstName);
		
		String lastName = email.substring(email.indexOf('.')+1, 
				email.indexOf('@'));
		
		System.out.println(" "+lastName);
		
		
	}

}
