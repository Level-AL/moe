package day29_Inheritance;

public class Employee extends Person { // Child class

	// instance variables
	String jobTitle;
	double salary;
	long employeeId;
	
	// Instance Method
	
	public void work () {
		System.out.println(name + " is working");
	}

	public String toString () {
		return "Person [name : " +name + ", age: " + age + " , Phone Number: " + phoneNumber + ", Job: " + jobTitle + ", Salary: " + salary + ", Employee ID: " 
				+ employeeId ;
	}
	
}
