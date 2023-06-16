package StudyGuide;

public class SwitchCases {
	public static void main(String[] args) {
		
int day = 3;

		

		if (day == 1) {

			System.out.println("Sunday");

		}else if(day ==2){

			System.out.println("Monday");

		}else if (day == 3) {

			System.out.println("Tuesday");

		}else if (day == 4) {

			System.out.println("Wednesday");

		}else if (day == 5) {

			System.out.println("Thursday");

		}else if (day == 6) {

			System.out.println("Friday");

		}else if (day == 7) {

			System.out.println("Saturday");

		}

		

		System.out.println("---------------------------------------");

		// above is the if else statement for the days of the week

		// this can be done an easier way using a Switch Case statement

		

		int day1 = 23;

		

		switch (day1) {

			case 1: 

				System.out.println("Sunday");

				break;

			case 2: 

				System.out.println("Monday");

				break;

			case 3: 

				System.out.println("Tuesday");

				break;

			case 4: 

				System.out.println("Wednesday");

				break;

			case 5: 

				System.out.println("Thursday");

				break;

			case 6: 

				System.out.println("Friday");

				break;

			case 7: 

				System.out.println("Saturday");

				break;

			default: 

					System.out.println("Not a valid day number");

		}

	

	

		// now this is a switch case using a string
		
		
		String dog = "bitch";
		
		switch (dog) {
		case "pomeranian":
			System.out.println("small dog");
			break;
		case " great dane":
			System.out.println("Big dog");
			break;
		default:
			System.out.println("Try a different type of dog");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
