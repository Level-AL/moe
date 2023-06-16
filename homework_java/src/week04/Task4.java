package week04;

public class Task4 {
	public static void main(String[] args) {
		
		String input = "ab123c4d56efg";
		
		String output = "";
		
		for (int i = 0; i < input.length(); i++) {
			char numbers = input.charAt(i);
			
			if(Character.isDigit(numbers)) {
				output += numbers;
				
			}
		}
		
		System.out.println(output);
		
	}
}
