package week03;

public class Task4Calculator {

	public static void main(String[] args) {

		
		double salary = 150000; 
        boolean isMarried = true; 

        double taxRate = 0.0;

        if (salary >= 130000) {
            taxRate = 0.35;
        } else if (salary >= 100000) {
            taxRate = 0.30;
        } else if (salary >= 80000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        if (isMarried) {
            taxRate = taxRate - 0.05;
        }

        double tax = salary * taxRate;
        double salaryAfterTax = salary - tax;

        System.out.println("Salary: $" + salary);
        System.out.println("Tax rate: " + (taxRate * 100) + "%");
        System.out.println("Tax: $" + tax);
        System.out.println("Salary after tax: $" + salaryAfterTax);
		
		
		
		
	}

}
