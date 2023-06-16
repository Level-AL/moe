package day25_classAndObject;

public class Car {

	// instance variable 
	
	String color; 
	String model;
	String brand;
	double price;
	int year;
	
	
	// instance method
	public void drive () {
		
		System.out.println("Driving " + year + " " + brand + " " + model);
		
		
	}
	
	public void stop () {
		
		System.out.println(year + " " + brand + " " + model + " has stopped");
		
	}

	public void start () {
		
		System.out.println(year + " " + brand + " " + model + " has started");
		
	}
}
