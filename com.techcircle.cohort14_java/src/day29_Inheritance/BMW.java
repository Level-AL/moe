package day29_Inheritance;

public class BMW extends Car{
 
	
	//  2. BMW:
//        extra methods:
//            breaksDown()
//            racing()

	
	public BMW( String model, int year, double price, String color, int miles) {
		super("BMW", model , year, price, color, miles);
	}

	public void breaksDown () {
		
		System.out.println( brand +" " + " " +  model+ " has broken down." );
		
	}
	
	public void racing () {
		
		System.out.println(year +" " +  color +" " +  brand +" " + model + " is winning the race.");
		
	}

	@Override
	public String toString() {
		return "BMW [Brand =" + " " + brand + ", model=" + model + ", year=" + year + ", price=" + price
				+ ", color=" + color + ", miles=" + miles + "]";
	}
	
	
	
}
