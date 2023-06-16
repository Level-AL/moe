package day31_InterfacesAndAbstraction.Animal;

public class AnimalTest {
public static void main(String[] args) {
	
	Dog myDog = new Dog ("Rex");
	
	myDog.speak();
	myDog.eat("Dog Food");
	
	Cat myCat = new Cat ("Whiskey");
	
	myCat.speak();
	myCat.eat("Cat Food");
	
	Animal cat1 = new Cat ("King");
	
	cat1.speak();
	
	Animal dog1 = new Dog ("Bitch");
	
	System.out.println("By overriding the methods from  ");
	System.out.println();
	dog1.speak();
	dog1.eat("Dog Food");
	dog1.sleep();
	
}
	
	
	
	
}
