package week04;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter first name: ");
		
		String firstName = scan.next();
		
		System.out.println("Please enter last name: ");
		
		String lastName = scan.next();
		
		firstName = firstName.substring(0,1).toUpperCase()+ firstName.substring(1).toLowerCase();
		lastName =  lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();
		
		
		
		
		System.out.print(firstName + " " + lastName );

			
			
			

		scan.close();
	}
}
