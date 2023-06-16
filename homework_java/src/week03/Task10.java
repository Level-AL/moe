package week03;

public class Task10 {

	public static void main(String[] args) {

		int num = 9087;
		int reverse = 0;

		while (num != 0) {
		    reverse = reverse * 10 + num % 10;
		    num /= 10;
		}

		System.out.println("The reverse of the numbers is: " + reverse);
		
		
	}

}
