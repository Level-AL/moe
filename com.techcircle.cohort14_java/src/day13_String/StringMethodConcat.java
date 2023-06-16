package day13_String;

public class StringMethodConcat {

	public static void main(String[] args) {
		String word1 = "re";
		String word2 = "think";
		String word3 = "ing";
		int num = 1;
		
		String result = word1 + word2;
		result += word3;	// result = result + word3;
		System.out.println(result);  
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		
		String result2 = word1.concat(word2).concat(word3);
		
		System.out.println(result2);
		
//		 result2 = result2.concat(num);
		
		char letter = 'a';
	//	result2 = result2.concat(letter); 
		
		result2 = result2 + letter;
		result2 = result2 + num;
		
		System.out.println(result2);
		
		result2 = result2.concat("").concat("123123123");
		System.out.println(result2);
		
	}

}
