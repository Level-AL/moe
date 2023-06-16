package day07_controlFlowStatements;

public class Task02 {

	public static void main(String[] args) {

//	System.out.println("Good Morning"); 
//	System.out.println("5<12");
//	System.out.println("Good Afternoon");
//	System.out.println("12-17");
//	System.out.println("Good Evening");
//	System.out.println("17-24");

		int a = 13;

		String timeofday = "";

		if (a >= 5 && a <= 12) {
			timeofday = "Good Morning";
		}
		if (a >= 12 && a <= 17) {
			timeofday = "Good Afternoon";		}
		if (a >= 17 && a <= 24) {
			timeofday = "Good evening";		
			}else {
			
		}
			System.out.println( timeofday);
	}

}
