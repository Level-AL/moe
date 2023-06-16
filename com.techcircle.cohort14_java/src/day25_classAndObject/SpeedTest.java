package day25_classAndObject;

public class SpeedTest {
	public static void main(String[] args) {
		
		Car2 camry = new Car2();
		
		camry.make = "Toyota";
		camry.model = "Camry";
		camry.year = 2019;
		camry.speed = 45;
		
		System.out.println("My car's speed is " + camry.getSpeed());
		
		camry.acceleration(40);
		
		System.out.println("My car's speed is " + camry.getSpeed());
		
		camry.brake(20);
		
		System.out.println("My car's speed is " + camry.getSpeed());
		
		camry.acceleration(30);
		
		System.out.println("My car's speed is " + camry.getSpeed());
		
		camry.brake(70);
		
		System.out.println("My car's speed is " + camry.getSpeed());
		
	}
}
