package day29_Inheritance;

public class Toyota extends Car{

//	  1. Toyota:
//        extra methods:
//                reliabile()
//
	
	public Toyota( String model, int year, double price, String color, int miles) {
		super("Toyota", model, year, price, color, miles);
		// TODO Auto-generated constructor stub
	}

	public void reliable () {
			
			System.out.println( brand + " " + model + " is a super reliable car.");
	}

	@Override
	public String toString() {
		return "Toyota [brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + ", color="
				+ color + ", miles=" + miles + "]";
	}
	
	
	
}
