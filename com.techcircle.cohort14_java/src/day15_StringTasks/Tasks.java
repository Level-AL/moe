package day15_StringTasks;

public class Tasks {
	public static void main(String[] args) {
		
		String email = "atestexample.c@om";
		
		// the email string must contain the "@" character.
		
		boolean containAt = (email.indexOf('@') > -1); // -1 means that it exists
		
		if (email.contains("@")) {
			containAt = true;
		}
		
          // email must contain a '.' charcter 
		
		
		boolean containDot = (email.indexOf('.') > -1 );
		
		if (email.contains(".")) {
			containDot = true;
		}
		
		boolean hasLetterInFrontOfAt = false;
		
		if (email.indexOf('@') > 0) {
			hasLetterInFrontOfAt = true;
		}
		
		
		
		boolean atAndDotIsApropriatePlace = false;
		
		if (email.indexOf('.') > email.indexOf('@')) {
			atAndDotIsApropriatePlace = true;
		}
		
		boolean isValidEmail = containAt && 
								containDot && 
							hasLetterInFrontOfAt && 
							atAndDotIsApropriatePlace;
		
//		System.out.println(email + "is valid" + isValidEmail);
		
		if (isValidEmail) {
			System.out.println("Given email is a valid email address");
		}else {
			System.out.println("Given email is an invalid email address");
		}
				
 
		         
		
	}
}
