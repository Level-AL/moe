package week02;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program and compute the sum of the digits 
//		of an integer. Input Data:
//			Input an integer: 25
//			Expected Output
//			The sum of the digits is: 7
		
		
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = sc.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
	
	}

}
