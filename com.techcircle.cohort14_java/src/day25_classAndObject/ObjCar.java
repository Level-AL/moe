package day25_classAndObject;

public class ObjCar {

	public static void main(String[] args) {
		// Syntax for Class Instantation
		// ClassName variable = new ClassName ();
		
		// create car object
		
		Car bmw_x5 = new Car (); // default condtrutor of car class
		
		bmw_x5.drive();
		bmw_x5.start();
		bmw_x5.stop();
		
		System.out.println("---------");
		bmw_x5.brand = "BMW"; // Assignging value to instance variable brand
		bmw_x5.model = "X5";
		bmw_x5.year = 2023;
		bmw_x5.color = "Black";
		bmw_x5.price = 68000;
		
		
		bmw_x5.drive();
		bmw_x5.start();
		bmw_x5.stop();
		
		System.out.println("----------");
		
		Car bmw_m3_competition = new Car ();
		
		bmw_m3_competition.brand = "BMW";
		bmw_m3_competition.model = "M3 Competition";
		bmw_m3_competition.year = 2023;
		bmw_m3_competition.color = "Black";
		bmw_m3_competition.price = 78000;
		
		bmw_m3_competition.drive();
		bmw_m3_competition.start();
		bmw_m3_competition.stop();

		
	
	}

}
