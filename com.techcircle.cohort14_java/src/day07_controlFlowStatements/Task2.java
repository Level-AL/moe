package day07_controlFlowStatements;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int a = scan.nextInt();
	     
	    if (a>=1 && a<=2) {
	    	System.out.println("Infancy");
	    }
	    if (a>=2 && a<=4) {
	    	System.out.println("Toddler");
	    }
	    if(a>=5 && a<=7) {
	    	System.out.println("Early school age");
	    }
	    if(a>=8 && a<=12) {
	    	System.out.println("Middle school age");
	    }
	    if(a>=13 && a<=17) {
	    	System.out.println("Early adolescence");
	    }
	    if(a>=18 && a<=25) {
	    	System.out.println("Later adolescence");
	    }
	    if(a>=25 && a<=30) {
	    	System.out.println("Early adulthood");
	    }
	    if (a>=31 && a<=50) {
	    	System.out.println("Middle Adulthood");
	    }
	    if(a>=51 && a<=100) {
	    	System.out.println("Later Adulthood");
	    }else {
	    	System.out.println("DEAD");
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    scan.close();
	 
	
	
	
	
	
	}
	}
	



