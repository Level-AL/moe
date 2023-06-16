package day29_Inheritance;

public class CarTest {
	public static void main(String[] args) {
		
		BMW bmw1 = new BMW ("x6", 2023, 90000, "White", 5);
		
		bmw1.breaksDown();
		bmw1.racing();
		
		bmw1.start(); // from super Class -- Car class
		
		bmw1.toString();
 
		System.out.println(	bmw1.toString());
		
		Tesla tesla1 = new Tesla ("Y", 2023, 75000, "Black", 3 );
		
		tesla1.autoPilot(); //subClass method
		tesla1.start();		//super class
		tesla1.drive();
		
		System.out.println(tesla1.toString());
		
		
		Car car1 = new Car ("Ford", "Mustang", 2023, 70000, "Black", 15);
		
		car1.start();
		car1.drive();
		
		System.out.println(car1.toString());
		
		
		
	}
}
