package day31_InterfacesAndAbstraction.Animal;

public class Cat implements Animal{

	private String name;
	
	
	// Constructor Method 
	
	public Cat (String name) { 
		this.name = name;
	}
	
	public void speak () {
		System.out.println(name + " says meow!");
	}

	
	public void eat(String food) {
		System.out.println(name + " is eating " + food );
	}
	
	public void sleep () {
		System.out.println("Cat is sleeping");
	}
	
}
