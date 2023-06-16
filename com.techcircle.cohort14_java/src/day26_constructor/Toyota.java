package day26_constructor;

public class Toyota {

	
	String make;
	String model;
	int year;
	double engineSize;
	String color;
	
	// No arguement constructor 
	// it has same name as your class name
	// has no return type 
	// 
	
	public Toyota () {
		System.out.println("Calling no argument constructor of Toyota class");
		make = "Toyota";
		start();
	}
	
//	instance method
	
	public void start () {
		System.out.println(year + " " + make + " " + model + " has started" );
	}
	
	public void stop () {
		System.out.println(year + " " + make + " " + model + " has stopped" );
	}
	
	public void drive () {
		System.out.println("Driving " + year + " " + make + " " + model);
	}
	
}
