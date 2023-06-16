package day26_constructor;

public class StudentObject {
	public static void main(String[] args) {
		
		Student s = new Student(); // calling default constructor if student class/ 
		
		s.name = "Arad";
		s.gender = 'M';
		s.age = 18;
		s.id = 123;
		
		
		
		s.takeExam("Java");
		s.study("Selenium");
		
	}
}
