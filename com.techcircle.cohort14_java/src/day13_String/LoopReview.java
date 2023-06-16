package day13_String;

public class LoopReview {

	public static void main(String[] args) {

		
		for(int i = 1; i<=100; i++) {
			System.out.print(i+" ");
			if(i % 10 == 0){
				System.out.println();
			}
		}
		
		System.out.println("-----");
		
		for(int i = 2; i<=100; i = i + 2) {
			System.out.print(i+" ");
			
		if(i % 10 == 0){	// to print all even numbers 1-100
			System.out.println();
		}
		}
		
		System.out.println("----");
		
		for(int i = 1, j = 10; i<=10 ; i++ , j--) {
//			System.out.print(i+" ");
//			System.out.println();
			System.out.print(j+" ");
		}
		
		
	}

}
