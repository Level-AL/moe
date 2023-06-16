package day26_constructor;

public class Car {
// instance variables
	String make;
	String model;
	String color;
	int year;

	// no argument constructor 
	public Car () {
		
		System.out.println("Defualt constructor of Car class");
		
	}
	
	// Parameterized constructor 
	public Car (String make1) {
		System.out.println("Parameterized constructor of car class with make ");
		make = make1;
		
	}
	
	// Parameterized constructor 
	public Car (String make1 , String model1) {
		System.out.println("Parameterized constructor of car class with make ");
		make = make1;
		model = model1;
			
	}
		
	// Parameterized constructor 
	public Car (String make1 , String model1, int year1 , String color1) {
		System.out.println("Parameterized constructor of car class with make ");			
		make = make1;
		model = model1;
		year = year1;
		color = color1;
				
	}
		
	// instance method 
	public String getInfo() {
		
String message = "Car class: Make = "+make+", model= "+model+", year= "+ year+", color= "+ color;
		
		return message;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
