package day27_Ecapsulation;

public class ObjPerson {
	public static void main(String[] args) {
		
		
		Person alex = new Person ("Alex Level",19,"7424 Tilman Dr Falls Church Va 22043");
		
		Person wilson = new Person ("Wilson Driller",19,"7049 Bradley Circle Annandale Va 22003");
		
		System.out.println("Name: " + alex.getName());
		System.out.println("Age :"+ alex.getAge());
		System.out.println( "Address: "+ alex.getAddress());
		
		System.out.println("----------");
		
		System.out.println("Name: " +wilson.getName());
		System.out.println("Age :"+ wilson.getAge());
		System.out.println("Address: "+wilson.getAddress());
		
		System.out.println("----------");
		
		Person jawad = new Person ("    ",350," ");
		
		
		
		
	}
}
