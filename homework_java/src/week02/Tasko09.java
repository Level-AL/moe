package week02;

import java.util.Scanner;

public class Tasko09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        double a = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double b = sc.nextDouble();
	        System.out.print("Enter an operator (+, -, *, /): ");
	        String operator = sc.next();
	        double result;
	        switch (operator) {
	            case "+":
	                result = a + b;
	                break;
	            case "-":
	                result = a - b;
	                break;
	            case "*":
	                result = a * b;
	                break;
	            case "/":
	                result = a / b;
	                break;
	            default:
	                System.out.println("Invalid operator. Please enter a valid operator (+, -, *, /).");
	                return;
	        }
	        System.out.println("Result: " + result);
	
	
	
	}

}
