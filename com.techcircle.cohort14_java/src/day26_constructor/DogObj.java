package day26_constructor;

public class DogObj {

	public static void main(String[] args) {
	
		
Dog boss = new Dog ("Boss", "German Shepherd", "Large", 2, "Black & Brown" );
		
	System.out.println(boss.getInfo());	
	
Dog vodka = new Dog ("Vodka", "Alaskan Malamute", "Huge", 1, "White & Black");

System.out.println(vodka.getInfo());
	
Dog dogs [] = new Dog [4];

	dogs[0] = boss;
	dogs[1] = vodka;
	dogs[2] = boss;
	dogs[3] = vodka;

	
	for (Dog allDogs : dogs) {
		
		

	}
	
	
	}

}
