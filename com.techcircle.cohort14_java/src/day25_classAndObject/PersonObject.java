package day25_classAndObject;

public class PersonObject {
	public static void main(String[] args) {
		
		Person Alex = new Person (); // class instantiation
		
		// assign value to instance variables
		
		Alex.age = 19;
		Alex.name = "Alex";
		Alex.occupation = "Super Hero";
		
		System.out.println(Alex.whatsYourName());
		System.out.println(Alex.whatDoYouDoForWork());
		System.out.println(Alex.howOldAreYou());
		System.out.println();
		Alex.getInfo();
		System.out.println("----------");
		
		Person wilson = new Person ();
		
		wilson.age = 19;
		wilson.name = "Wilson";
		wilson.occupation = "Bob the builder";
		

		System.out.println(wilson.whatsYourName());
		System.out.println(wilson.whatDoYouDoForWork());
		System.out.println(wilson.howOldAreYou());
		System.out.println();
		wilson.getInfo();
		System.out.println("----------");
		
		
		
	
		
	}
}
