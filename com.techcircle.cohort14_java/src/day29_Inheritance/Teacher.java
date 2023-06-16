package day29_Inheritance;

public class Teacher extends Employee {

	String subject;
	String gradeLevel;
	String schoolName;
	
	
	public void teach () {
		System.out.println(name + " is teaching " + subject +  " for " + gradeLevel + " graders at " + schoolName);
	}
	public void suspendStudents () {
		System.out.println("suspending a student at "+ schoolName);
		
		
	}
	public void giveExams () {
		System.out.println(name + " is giving exams at " + schoolName);
	}
	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", gradeLevel=" + gradeLevel + ", schoolName=" + schoolName
				+ ", jobTitle=" + jobTitle + ", salary=" + salary + ", employeeId=" + employeeId + ", name=" + name
				+ ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}
}
