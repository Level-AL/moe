package day14_String;

public class ConvertNumberToString {

	public static void main(String[] args) {

		int a = 5, b= 100;
		
		System.out.println(a+b);  // 105
		
		String str1 = "" + a;
		
		System.out.println(str1); // 5
		
		String str2 = "" + b;
		
		System.out.println(str2); //100
		
		System.out.println(str1 + str2); //5100 
		
		
		System.out.println(str1.length());
		System.out.println(str2.length());

		
		
		double price = 9.99;
		
		String str3 = "" + price;
		
		System.out.println(str3.length());
		System.out.println(str3.charAt(1));
		
		
		/*
		 primitive Type     Wrapper Class
		 
		 boolean            Boolean
		 char				Character
		 short				Short
		 int				Integer
		 byte				Byte
		 long				Long
		 float				Float
		 double				Double
		 
		*/
		
		float amount = 10.5F;
		
		String str4 = Float.toString(amount);
		System.out.println(str4);
		System.out.println(str4.substring(0,str4.indexOf('.')));
		
		
		
		String str5 = Double.toString(price);
		
		System.out.println(str5);
		System.out.println(str5.length());
		
		
		String str6 = String.valueOf(price);
		System.out.println(str6);
		
		System.out.println(str6.length());
		
		System.out.println(str6.substring(str6.indexOf('.')+1));
		
		
		
	}

}
