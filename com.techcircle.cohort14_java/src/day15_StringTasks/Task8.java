package day15_StringTasks;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a 3 letter word: ");
		
		String str = scan.next();
		
		
		if (str.length() < 3) {
			System.out.println("Word is too short");
		}
		
		if(str.length() > 3) {
			System.out.println("Word is too long");
		}
		
		
		
		if (str.length() == 3) {
			if( str.charAt(1) == 'a') {
				System.out.println("Cool Word");
			}else  {
				System.out.println("Okay Word");
			}
		}
	
		scan.close();
	}

}
