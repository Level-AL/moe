package day26_constructor;

public class Dog {
	String name;
	String breed;
	String size;
	int age;
	String color;
	

		
public Dog(String name1, String breed1, String size1, int age1, String color1) {
	name = name1;
	breed = breed1;
	size = size1;
	age = age1;
	color= color1;
}

public String getInfo() {
	String info = "Dog name: " + name +  ", Dog breed: " + breed + 
			", Dog size: "+ size + ", Dog age: " + 
			age + ", Dog color: "+ color ;
	return info;
}
	
}
