package uPackage;

import com.github.javafaker.Faker;

public class testingFaker {
	public static void main(String[] args) {
		
		Faker faker = new Faker();
		
		 System.out.println(faker.funnyName().name());
		 System.out.println( faker.name().fullName());
		 System.out.println(faker.address().fullAddress());
		 System.out.println(faker.chuckNorris().fact());
		 System.out.println(faker.rickAndMorty().character());
		 System.out.println(faker.crypto().sha512());
	}
}
