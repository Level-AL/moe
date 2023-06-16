package day27_Ecapsulation;

public class Person {

	private String name;
	private int age;
	private String address;

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		
		if (!name.trim().isEmpty()) {
			this.name = name;
		}else {
			System.out.println("Name cannot be empty");
		}
		
	}

	// --

	public int getAge() {
		
		
		return age;
	}

	public void setAge(int age) {
		if( age <= 120 && age >= 0 ) {
			this.age = age;
		}else {
			System.out.println("Age must be between 0 and 120");
		}
		
	}

	// --

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		
		if (!address.trim().isEmpty()) {
		this.address = address;
		}else {
			System.out.println("Address cannot be empty");
		}
		}

	public Person (String name, int age, String address) {
		setName(name);
		setAge(age);
		setAddress(address);
	}
	
	
	
	
	
}
