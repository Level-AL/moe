package week03;

import java.util.Scanner;

public class CampusTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter the time (1-24): ");
	        int time = input.nextInt();

	        if (time >= 8 && time <= 23) {
	            System.out.println("Open");
	        } else {
	            System.out.println("Closed");
	        }
	    
	input.close();
	
	}
	}
	

