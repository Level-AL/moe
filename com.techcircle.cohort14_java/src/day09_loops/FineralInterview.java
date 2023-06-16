package day09_loops;

public class FineralInterview {

	public static void main(String[] args) {

		 int i = 1;
		    do {
		      if (i % 3 == 0 && i % 5 == 0) {
		        System.out.println("FINRA");
		      } else if (i % 3 == 0) {
		        System.out.println("FIN");
		      } else if (i % 5 == 0) {
		        System.out.println("RA");
		      } else  {
		        System.out.println(i);
		      }
		      i++;
		    } while (i <= 100);
	
   	
		 
		    
		  
		    
		    
	}

}
















