package day25_classAndObject;

public class Person {

	String name;
	int age;
	String occupation;
	
	
//	public static void main(String[] args) {
//		
//		Person alex = new Person ();
//		
//		alex.person();
//		
//	
//	}
	
	public void getInfo () {
		System.out.println(name + " is " + age +" and he is a " + occupation);
	}
	
	public String whatsYourName () {
		return name;
	}
	
	public int howOldAreYou () {
		return age;
	}
	
	public String whatDoYouDoForWork () {
		return occupation;
	}
	
	
//	public  void person () {
//		
//		name = "Alex";
//		age = 19;
//		occupation = "Super Hero";
//		
//	System.out.println("Hi my name is " + name + " I am " + age + " years old" 
//					+ " my occupation is " + occupation + ".");
//	}
//	
	
	
}


