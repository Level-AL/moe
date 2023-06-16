package day14_String;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

/*
 * 	Write a program that can return the initials of the user	
 *  
 *  ex: techcircle school
 *  
 *  output: T.S
   
 */
		
		
		String input = "jawad iskandar";
		input = input.trim();
		
		input = input.toUpperCase();
		System.out.print(input.charAt(0)+ "." );
		
		System.out.println(input.charAt(input.indexOf(" ")+1));
		
		
		
		
		
	}

}
