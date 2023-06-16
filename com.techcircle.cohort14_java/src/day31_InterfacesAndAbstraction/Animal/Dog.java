package day31_InterfacesAndAbstraction.Animal;

public class Dog implements Animal {

	private String name;
	
	public Dog (String name) {
		this.name = name;
	}
//	public void getName () {
//		
//	}
//	public void setName (String name) {
//		this.name = name;
//	}
//	public  setName () {
//		return name;
//	}
	
	@Override
	public void speak() {
		System.out.println( name + " is barking : Woof Woof!");		
	}

	@Override
	public void eat(String food) {
		System.out.println(name + " is eating food");
		
	}

	@Override
	public void sleep() {
		System.out.println(name + " is sleeping");		
	}

}
