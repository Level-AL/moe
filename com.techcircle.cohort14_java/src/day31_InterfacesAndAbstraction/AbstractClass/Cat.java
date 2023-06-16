package day31_InterfacesAndAbstraction.AbstractClass;

public class Cat extends Animal implements Playable {

	
	
	public void eat() {
		System.out.println("Cat is eating");
		
	}

	public void move() {
		System.out.println("Cat is moving");
	}

	
	public void play() {
		System.out.println("Cats love playing");		
	}

	
	


}
