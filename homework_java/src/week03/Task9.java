package week03;

public class Task9 {

	public static void main(String[] args) {

		int number = 15981;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
		
	}

}
