package day25_classAndObject;

public class DogActivities {

	public static void main(String[] args) {

		
//Dog dog1 = new Dog ("Boss", "German Shepherd", "Large", 2, "Black & Brown" );
//		
//		System.out.println(dog1.getInfo());
		
		
		Dog Bob = new Dog ();   
		
		Bob.name = "Bob";
		Bob.size = "small";
		Bob.age = 2;
		Bob.color = "white";
		Bob.breed = "Chihuahua";
		
		
		
		 Dog Max = new Dog();
	        Max.age = 9;
	        Max.breed = "Chow Chow";
	        Max.color = "Maroon";
	        Max.name = "Max";
	        Max.size = "Large";
	        
	        Dog BigShow = new Dog();
	        BigShow.age = 15;
	        BigShow.breed = "Maltese";
	        BigShow.color = "White";
	        BigShow.name = "BigShow";
	        BigShow.size = "X-Large";
	        
	        Dog Charlie = new Dog();
	        Charlie.age = 5;
	        Charlie.breed = "Labradog";
	        Charlie.color = "Brown";
	        Charlie.name = "Charlie";
	        Charlie.size = "Small";
	        
	        Max.intro();
	        Max.eat();
	        Max.bark();
	        Max.sit();
	        Max.play();
	        Max.wagTail();
	        System.out.println("----------");
	        BigShow.intro();
	        BigShow.eat();
	        BigShow.bark();
	        BigShow.sit();
	        BigShow.play();
	        BigShow.wagTail();
	        System.out.println("----------");
	        Charlie.intro();
	        Charlie.eat();
	        Charlie.bark();
	        Charlie.sit();
	        Charlie.play();
	        Charlie.wagTail();
	        System.out.println("----------");
			Bob.intro();
			Bob.eat();
			Bob.bark();
			Bob.sit();
			Bob.play();
		Bob.wagTail();
			
			System.out.println("----------");
			
			Dog dogs [] = new Dog [4];
			
			dogs[0] = Bob;
			dogs[1] = Max;
			dogs[2] = BigShow;
			dogs[3] = Charlie;
			
			System.out.println(dogs.length);
			
			int nums [] = {1,2,3,4};
			
			for ( Dog eachDog: dogs) {
				
				System.out.println(eachDog.name);
				
			}
			
			
			
			
			
		
	}

}
