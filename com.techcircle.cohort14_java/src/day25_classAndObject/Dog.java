package day25_classAndObject;

public class Dog {

	// Update Dog class by creating a couple of constructors 
	// and create 4 dog object
	
	
	// instance variable 
	String name;
	String breed;
	String size;
	int age;
	String color;
	
//public Dog (String name1, String breed1, String size1, int age1, String color1) {
//	
//	name = name1;
//	breed = breed1;
//	size = size1;
//	age = age1;
//	color = color1;
//}
//	
//public String getInfo() {
//	String info = "Dog name: " + name +  ", Dog breed: " + breed + 
//			", Dog size: "+ size + ", Dog age: " + 
//			age + ", Dog color: "+ color ;
//	return info;
//}
//	
	
	
	
	
	
	
	
	
		public void eat () {
System.out.println(name + " is eating");
	}

	
	
	public void play () {
System.out.println(name + " is playing");
	}
	
	
	public void sit () {
System.out.println(name + " is sitting");
	}
	
	

	public void bark () {
System.out.println(name + " is barking");
	}
	
	public void intro () {
		System.out.println("Hi wooff wooff");
		System.out.println("My name is " + name + ".");
		System.out.println("I'm a " + color + " " + breed + " and I am " + age + " years old.");
	}
	
	public void wagTail () {
		System.out.println(name + " is wagging tail");
			}
}
