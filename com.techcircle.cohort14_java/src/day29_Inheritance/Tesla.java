package day29_Inheritance;

public class Tesla extends Car{

	
	
	

	public Tesla( String model, int year, double price, String color, int miles) {
		super("Tesla", model, year, price, color, miles);
		// TODO Auto-generated constructor stub
	}

	public void autoPilot () {
		System.out.println( brand + " " + model + " has full self driving (FSD)");
	}

	@Override
	public String toString() {
		return "Tesla [brand=" + brand + ", model=" + model + ", year=" + year + ", price=" + price + ", color=" + color
				+ ", miles=" + miles +  "]";
	}
	
	
}
