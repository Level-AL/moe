package day11_nestedForLoop;

public class NestedForLoopDemo {

	public static void main(String[] args) {

//	for (int i = 1; i<=10; i++) {
//		System.out.println(i);
//	}
//	for (int i = 1; i<=10; i++) {
//		System.out.println(i);
//	}
//	for (int i = 1; i<=10; i++) {
//		System.out.println(i);
//	}
//	for (int i = 1; i<=10; i++) {
//		System.out.println(i);
//	}
//	for (int i = 1; i<=10; i++) {
//		System.out.println(i);
//	}
//	

//		for (int j = 1; j <= 5; j++) {
//			System.out.println("Hello"+j);

			for (int i = 1; i <= 10; i++) {
				System.out.println(i); // 1-10
				for (int j = 1; j <= 5; j++) {
					System.out.println("Hello"+j);
			}
		}

		// print A to H 10 times
			
			for (int a = 'A'; a<='H'; a++) {
			char letter = (char)a;
				System.out.println(letter);
				
			}
		
		for (int j = 1; j < 11; j++) {
			
			for (int a = 'A'; a<='H'; a++) {
				char letter = (char)a;
				System.out.print(letter);
				
			}
			System.out.println();
		}
		
		
		
		
	}
}
