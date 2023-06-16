package day23_ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		
//		PrimitiveType      objectType
//		byte				Byte
//		char				Character
//		short				Short
//		int					Integer
//		float				Float
//		boolean 			Boolean
//		double				Double
		
		int num = 5;
		System.out.println(num);
//		System.out.println(num);
		
		Integer num2 = num;
		
		System.out.println(num2);
		
		String str = num2.toString();
		
		System.out.println(num2);
		System.out.println(str); // 5
		System.out.println(str.length());
		
		str += 10;
		
		System.out.println(str); // 510
		
		int num3 = Integer.parseInt(str);
		
		System.out.println(num3); // 510
		
		System.out.println(num3 + num);
		
		
		
		System.out.println("------------");
		
		String str2 = "9.99";
		System.out.println(str2.length());
		
		double num4 = Double.parseDouble(str2);
		
		System.out.println(num4);
			
		System.out.println(num4 + 10);
		
		String str3 = Double.toString(num4);
		
		
		
		String result = "true";
		
		boolean result2 = Boolean.parseBoolean(result);
		
		if (result2) { 
			System.out.println("it's boolean");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
