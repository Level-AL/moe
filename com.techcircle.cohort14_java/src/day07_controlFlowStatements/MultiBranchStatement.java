package day07_controlFlowStatements;


public class MultiBranchStatement {

	public static void main(String[] args) {

	int day = 7;
	
	String name = "";
	
	if(day == 1  ){
		
		name = "Monday";
	}else if (day ==2 ) {
		name = "Tuesday";
	}else if (day ==3) {
		name = "Wednsday";
	}else if(day == 4) {
		name = "Thrusday";
	}else if (day  ==5) {
		name = "Friday";
	}else if (day==6) {
		name = "Saturday";
	}else if (day == 7) {
		name = "Sunday";
	}else {
		System.out.println("Invalid number of the day");
	}
	
	System.out.println("it's "+ name);
	
	
	
	//	if(day == 1  ){
//		System.out.println("Monday");
//	}else if (day ==2 ) {
//		System.out.println("Tuesday");
//	}else if (day ==3) {
//		System.out.println("Wednesday");
//	}else if(day == 4) {
//		System.out.println("Thursday");
//	}else if (day  ==5) {
//		System.out.println("Friday");
//	}else if (day==6) {
//		System.out.println("Saturday");
//	}else if (day == 7) {
//		System.out.println("Sunday");
//	}else {
//		System.out.println("Invalid number of the day");
//
//	}
	
	
	
	
	}

}
