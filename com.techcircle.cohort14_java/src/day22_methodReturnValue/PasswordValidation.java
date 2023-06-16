package day22_methodReturnValue;

public class PasswordValidation {

	public static void main(String[] args) {

		/*Must contain:
		 * 8-20 characters
		 * and 2 of the following :
		 * 
		 * 
		 */
		
	
	
//		String password = "Password1#";
		
		System.out.println(isValidPassword("ppPaswword1@"));
		
		
		
		}

	public static boolean isValidPassword(String password) {
		boolean isValid = false;
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;
		
		
		if (password.length()>=8 && password.length() <=20 
				&& !password.contains(">")
				&& !password.contains("<")) {
			
			
		for (int i = 0; i < password.length(); i++) {
//			System.out.print(password.charAt(i));
			
			char letter = password.charAt(i);
			
			if (letter >= 'A' && letter <= 'Z') {
			
			hasUpperCase = true;
		    }
			if (letter >= 'a' && letter <= 'z') {
				
				hasLowerCase = true;
			}	
			if (letter >= '0' && letter <= '9') {
				
				hasDigit = true;
			}
			if(!Character.isLetterOrDigit(letter)) {
				hasSpecialChar = true;
			}
				
	}
		
		   if(hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
//			System.out.println("Valid Password");
		  isValid = true;
		   }
	}
	
		
		return isValid ;
		
		
		}
	}
	
	


