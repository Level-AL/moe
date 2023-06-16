package day29_Inheritance;

public class Dog  extends Animal {

	String breed; // Instance variable 
	
	public Dog(String name, int age, String gender, double weight,String breed) {
		super(name, age, gender, weight);
		this.breed = breed;
		
	}
		
	public void bark () {
		System.out.println(name + " is barking");
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
	
	
}
