package day09_loops;

public class PrintAToZ {

	public static void main(String[] args) {

	char letter1 = 'a';
	
	int num = letter1;
	
	System.out.println(num);
	
	
	char letter2= 'z';
	int num2 = letter2;
	
	System.out.println(num2);
	//      65 <= 90
	while (num <= num2) {
		char letter3 = (char)num;
		System.out.println(letter3);
		num ++;
	}
	
	System.out.println("--------------"); 
	int value = 122;
	  while (value >= 97) {
		  char letter4 = (char)value;
		  System.out.println(letter4);
		  value --;
	  }
	  
	
	
	}

}
