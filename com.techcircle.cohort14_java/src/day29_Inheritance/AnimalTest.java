package day29_Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		
		
		Dog dog1 = new Dog("Level", 2 , "Male" , 90, "Golden Retriever");
		
		System.out.println(dog1.toString());
		dog1.eat();
		dog1.sleep();
		
		dog1.bark();
	}
}
