package day11_nestedForLoop;

import java.util.Random;

public class StringTest {

	public static void main(String[] args) {

		// dataType variableName = value;
		int age = 10;
		Random  random = new Random();
		
		String name = "techCircle";
		System.out.println(name);

		String str2 = " ";
		name += str2; // name = name + str2
		System.out.println(name);

		String str3 = "Cohort14";

		System.out.println(name + str3);
		System.out.println(name);

		System.out.println("TechCircle");
//							0123456789
		System.out.println("TechCircle".charAt(0)); // T
		System.out.println("TechCircle".charAt(1)); // e
		
		System.out.println("Irfan".length());
		
		System.out.println("TechCircle".length()); // 10
		System.out.println("Tech Circle".length());// 11
	}

}
