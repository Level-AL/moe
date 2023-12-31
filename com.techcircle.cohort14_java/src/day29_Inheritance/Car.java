package day29_Inheritance;

public class Car {
//  1. carTask:
//  Create a class called Car
//      instance variables:
//          brand, model, year, price, color, miles

//  add a constructor to set all the fields

//      instance methods:
//          start(), drive(),

  //toString()


//  Create the following sub classes of Car:
//      1. Toyota:
//              extra methods:
//                      reliabile()
//
//      2. BMW:
//              extra methods:
//                  breaksDown()
//                  racing()
//
//      3. Tesla:
//              extra methods:
//                  autoPilot();
	String brand;
	String model;
	int year;
	double price;
	String color;
	int miles;
	
	public Car (String brand, String model, int year, double price, String color, int miles) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
		this.color = color;
		this.miles = miles;
		
		
	}
	
	public void start () {
		System.out.println( year + " " +  color + " " + brand + " " + model + " started.");
	}
	
	public void drive () {
		System.out.println( "Driving " + year + " " + color + " " + brand + " " + model );
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + ", color=" + color
				+ ", miles=" + miles + "]";
	}
	
	
	
}
