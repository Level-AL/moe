package day07_controlFlowStatements;

public class Task1 {

	public static void main(String[] args) {

		double n1 = -1.0;
		double n2 = 4.5;
		double n3 = -5.3;

		double maxValue = 0;

		if (n1 > n2 && n1 > n3) {
			maxValue = n1;
		} else if (n2 > n1 && n2 > n3) {
			maxValue = n2;
		} else if (n3 > n1 && n2 > n3) {
			maxValue = n3;
		} else {
			maxValue = n3;
		}
			System.out.println(maxValue);

	
	
	
	}

}
