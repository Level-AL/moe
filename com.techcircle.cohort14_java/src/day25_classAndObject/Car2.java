package day25_classAndObject;

public class Car2 {
 
	// instance variables
	String make;
	String model;
	int year;
	double speed;
	
	
//	 create the following methods for the class:
//	  acceleration (double): increase the speed of the car by the given amount 

	public void acceleration (double amount) {
		
		speed += amount;
	}
	
	
//	 brake (double) : decreases the speed of the car by the given amount

	public void brake (double amount) {
		speed -= amount;
	}

//	  getSpeed(): returns the current speed of the car		 
	
	public double getSpeed () {
		
		return speed;
	}
	 
}
