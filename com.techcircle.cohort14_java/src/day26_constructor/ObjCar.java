package day26_constructor;

public class ObjCar {
	public static void main(String[] args) {
		
		Car car = new Car (); // no argument constructor 
		
		car.make = "Tesla";
		car.model = "S";
		car.year = 2023;
		car.color = "White";
		
		Car car2 = new Car ("BMW");
		
		car2.model = "Z4";
		car2.year = 2023;
		car2.color = "Black";
		
		Car car3 = new Car ("Tesla" , "X" , 2022 , "Red");
		
		
		System.out.println(car.getInfo());
		
		System.out.println(car2.getInfo());
		
		System.out.println(car3.getInfo());
		
		
		
		
		
		
	}
}
