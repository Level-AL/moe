package day31_InterfacesAndAbstraction.AbstractClass;

public class AnimalTest {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal shark = new Shark();
		
		
		Animal arr [] = {cat,shark};
		
		for (Animal animal : arr) {
			animal.move();
			animal.drink();
			animal.eat();
		}
		
		
	}
}
