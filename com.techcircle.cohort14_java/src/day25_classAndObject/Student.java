package day25_classAndObject;

public class Student {

	String name;
	 char gender;
	 int age;
	 long ID;
	 char grade;
	
	public void code () {
System.out.println(name +  ": is coding");
	}
	
	public void sleep () {
System.out.println(name +  ": is sleeping");
	}
	
	public void submitHomework () {
		System.out.println(name + " is submitting homeowrk using GitHub");
	}
	
	public void getInfo () {
		System.out.println("Name: " + name + ", ID: " + ID + ",Gender: "+ gender+ ", Age: " + age);
	}
	
}
