package day29_Inheritance;

public class Animal { // SuperClass / Parent Class
	
	String name;
	int age;
	String gender;
	double weight;
	
	
	public Animal (String name, int age, String gender, double weight) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		
	}

	public void makeSound () {
		
		System.out.println(name + " Animal making sounds");
	}
	
	public void eat () {
		System.out.println(name + " Animal eating");
	}
	
	public void sleep () {
		System.out.println(name + " Animal is sleeping");
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", gender=" + gender + ", weight=" + weight + "]";
	}
	
	
}
