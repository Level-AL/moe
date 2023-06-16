package day23_ArrayList;

public class CharacterClass {
	public static void main(String[] args) {
		
		String str = "a1a2a3bc4d";
		// 10
		char letter = 'a';
		char letter2 = '3';
		char letter3 = '@';
		
		int sum = 0;
		System.out.println(Character.isDigit(letter2));
		System.out.println(Character.isDigit(letter));
		
		
		System.out.println(Character.isLetter(letter));
		System.out.println(Character.isLetter(letter2));

		
		System.out.println(Character.isLetterOrDigit(letter2));
		
		System.out.println(Character.isLetterOrDigit(letter3));
		
		
		for (int i = 0; i < str.length(); i++) {
			
			char currentChar = str.charAt(i);

			if(Character.isDigit(str.charAt(i))) {
//				System.out.println(str.charAt(i));
			
				String str2 = Character.toString(currentChar);
				int num = Integer.parseInt(str2);
				sum += num;
			}
		}
			System.out.println("Here is the sum: " + sum);
		
		
		
		
		
		
		
		
		
		
	}
}
