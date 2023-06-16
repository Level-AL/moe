package com.levelal.personal_java;

import java.util.Scanner;

public class VaTax {
public static void main(String[] args) {
	
	
	 double income;
     double tax;

     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter your income for the year: ");
     income = scanner.nextDouble();

     if (income <= 3000) {
         tax = 0;
     } else if (income <= 5000) {
         tax = (income - 3000) * 0.02;
     } else if (income <= 17000) {
         tax = (income - 5000) * 0.03 + 40;
     } else if (income <= 27000) {
         tax = (income - 17000) * 0.05 + 550;
     } else if (income <= 40000) {
         tax = (income - 27000) * 0.0575 + 1200;
     } else if (income <= 60000) {
         tax = (income - 40000) * 0.06 + 1737.50;
     } else if (income <= 80000) {
         tax = (income - 60000) * 0.065 + 2737.50;
     } else {
         tax = (income - 80000) * 0.0575 + 3937.50;
     }

     System.out.printf("Your income tax for the year is: $%.2f", tax);
     
     scanner.close();
	
	
}


}
