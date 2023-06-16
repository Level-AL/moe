package day25_classAndObject;

import java.util.ArrayList;

public class StudentNames {

	public static void main(String[] args) {

		Student Alex = new Student ();
		
		Alex.name = "Alex";
		Alex.age = 19;
		Alex.gender = 'M';
		Alex.ID = 1471761;
		Alex.grade = 'A' ;  
		
//		Alex.code();
//		Alex.sleep();
//		Alex.submitHomework();
//		Alex.getInfo();
		
		System.out.println("----------");
		Student Khalil = new Student ();
		Khalil.name = "Khalil";
		Khalil.age = 21;
		Khalil.gender = 'M';
		Khalil.ID = 1471313;
		Khalil.grade = 'A' ;  
		
//		Alex.code();
//		Alex.sleep();
//		Alex.submitHomework();
//		Alex.getInfo();
		
		System.out.println("----------");
		Student Wilson = new Student ();
		Wilson.name = "Wilson";
		Wilson.age = 19;
		Wilson.gender = 'M';
		Wilson.ID = 1471777;
		Wilson.grade = 'A' ;  
		
//		Alex.code();
//		Alex.sleep();
//		Alex.submitHomework();
//		Alex.getInfo();
		
		System.out.println("----------");
		Student Jawad = new Student ();
		Jawad.name = "Jawad";
		Jawad.age = 19;
		Jawad.gender = 'M';
		Jawad.ID = 1431361;
		Jawad.grade = 'A' ;  
		
//		Alex.code();
//		Alex.sleep();
//		Alex.submitHomework();
//		Alex.getInfo();
		
		System.out.println("----------");
		
		
		ArrayList <Student> list = new ArrayList < > ();
		
		list.add(Alex);
		list.add(Khalil);
		list.add(Wilson);
		list.add(Jawad);
		
		System.out.println(list.size());
		
//		for ( int i = 0; i < list.size(); i++) {
//		
//			list.get(i).sleep();
//			list.get(i).code();
//			list.get(i).submitHomework();
//			list.get(i).getInfo();
//			
//		}

		System.out.println("----------------");
		
        for (int i = 0 ; i < list.size(); i++) {
            
            if (list.get(i).gender == 'M') {
            
            list.get(i).getInfo();
            list.get(i).sleep();
    		list.get(i).code();
    		list.get(i).submitHomework();
    		System.out.println("----------------");
            }
        }
        
		
		
		
	}

}
