package day10_forLoop;

public class Homework11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Tas11: write a java  program to convert seconds to hour, minute to seconds
	// sample output:
		// input seconds: 86399
		// result : 23:59:59
		
		int input = 86399;
		
		int hour = (input / 3600);
		System.out.println(hour);
		
		int minute = (input % 60) %60; 
		System.out.println(minute);
		
		int seconds = ((input %60)%60) %60;
		System.out.println(seconds);
		
		
		
		System.out.println("---");
		
		
		System.out.println(hour*3600);		
		System.out.println(input - hour * 3600);
		
		int minute2 = (input - hour)/60;
		
		System.out.println((input - hour * 3600)/60);
		
		System.out.println(minute2);
		
		int second2 = (input - hour * 3600) - (minute2 *60);
		
		System.out.println(minute2);
		
		
		System.out.println("-------------");
		
		int input2 = 86399;
		
		int hour2 = input / 3600;
		
		int minute3 = (input % 60) / 60;
		
		int second3 = input % 60;
	
		System.out.println(hour2  + minute3  + second3 );
	}

}
