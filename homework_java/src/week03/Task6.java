package week03;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		        for (int i = 1; i <= 100; i++) {
		            if (i % 3 == 0 && i % 5 == 0) {
		                System.out.println("FINRA ");
		            } else if (i % 3 == 0) {
		                System.out.println("FIN ");
		            } else if (i % 5 == 0) {
		                System.out.println("RA ");
		            } else {
		                System.out.println(i + " ");
		            }
		        }
	
	
	}

}
