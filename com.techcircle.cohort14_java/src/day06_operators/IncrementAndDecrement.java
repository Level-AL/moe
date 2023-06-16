package day06_operators;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		int num = 1;

		// postfix update the variable value in the next line.

		System.out.println(num++); // 1
		System.out.println(num); // 2

		System.out.println(++num); // 3

		// prefix updates the value of the variable in the same line

		++num;
		++num; // these update the value while the print statement
		++num; // only prints the most recent value on the variable ++num;

		System.out.println(num); // 6

		num--;
		System.out.println(num); // 5
		
		System.out.println(num--); //5
		System.out.println(num--); //4
		System.out.println(num--); //3
		

	}

}
