package day31_InterfacesAndAbstraction.AbstractClass;

public class Shark extends Animal implements Wild , Swimmable {

	public void eat() {
		System.out.println("Shark loves to eat humans");
	}

	public void move() {
		System.out.println("Shark is moving");
	}

	public void hunt() {
		System.out.println("Shark is hunting for humans");
	}

	public void swim() {
		
	}

	
	
}
