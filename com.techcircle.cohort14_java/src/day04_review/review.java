package day04_review;

public class review {

	// Pascal notation
	// OneTwoThreeFour
	// every new word is upper case except

	// Camel Case notation
	// every word starts upper case except for the first one

	public static void main(String[] args) {

		System.out.println("hello");

		// variable - box to hold your value
		// dataType varName = value;

		String fruit = "apples";
		int age = 43;
		double price = 10.95;
		boolean isActive = true;
		char a = 'a';

		// Name Variable rules
		// - cannot start with number
		// - special char can start with _ and $
		// camel case
		// - cannot have spaces and special char
		// cannot use a reserve java keyword
		// cannot use the same variable name (in the same scope)

		{

			String name = "leng";
		} 

		// String - sequence of character in " "
		// int - number
		// double - float number / decimal / fraction
		// boolean - true/false
		// char - single character / integer (Hex ASCII)

		// Primitive Type
		// Number - byte, short, int, long
		// Float - float, double
		// Character -char
		// Boolean - boolean

		// Non-primitive/ Reference Type
		// String
		// Array
		// Object - everything
		// any classes

		int number;

		number = 10; // assign value
		System.out.println(number);
		number = 20; // reassign value
		System.out.println(number);

		// Constant
		// Variable that cannot be reassigned
		// use when declaring some facts
		// naming convention will use screaming sneak case
		// ONE_TWO_THREE_FOUR
		final double MILK_PRICE = 2.95;
		final double pi = 3.14;
		// MILK_PRICE = 3.5;

	}

}
