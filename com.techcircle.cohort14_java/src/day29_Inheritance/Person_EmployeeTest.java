package day29_Inheritance;

public class Person_EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee ();
		
		employee1.name= "Unknown Name";
		employee1.age= 24;						// from person
		employee1.phoneNumber = "7038428429";
		//-------
		employee1.jobTitle = "Software Development";
		employee1.salary = 100000;						// from Employee
		employee1.employeeId = 700;
		
		
		System.out.println(employee1.toString());
		
		Person person1 = new Person ();
		
		person1.name= "Unknown Name";
		person1.age= 24;						// from person
		person1.phoneNumber = "7038428429";
		//-------
		
//		Cannot access the variables from SubClass 
//		person1.jobTitle = "Software Development";
//		person1.salary = 100000;						// from Employee
//		person1.employeeId = 700;
//	
		
		
		Teacher teacher1 = new Teacher ();
		teacher1.name = "John";
		teacher1.age = 20;
		teacher1.phoneNumber = "5712940299";
		
		teacher1.jobTitle = "Teacher";
		teacher1.salary = 60000;
		teacher1.employeeId = 394839;
		
		teacher1.schoolName = "TechCircle";
		teacher1.gradeLevel = "12th";
		teacher1.subject = "Java";
		
		System.out.println(teacher1.toString());
		
		
	}
	
	
}
