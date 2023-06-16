package day11_nestedForLoop;

public class PrintPattern {

	public static void main(String[] args) {

//		for (int i = 4 ; i>=0; i++ ) {
//			System.out.println("*");
//			}
		
		// print this pattern 
		// * * * * * 
		// * * * *
		// * * * 
		// * *
		// *
	
		
		for (int row =4 ; row>=0; row--) {
		
		for(int starCount = row; starCount>=0; starCount--) {
			System.out.print("*");
			
		}
		    System.out.println();
	}
		
		System.out.println("----------------------");
	
		
		
		 int rows1 = 5;
	        for (int i = 1; i <= rows1; i++) {
	          for (int j = 1; j <= rows1; j++) {
	            if (j == i) {
	              System.out.print("*"+" " );
	            } else {
	            	System.out.print(j+" ");
	            }
	            
	          }
	          System.out.println();
	        }
		System.out.println("----------------------");
	        
	      for (int i = 1; i <= 5; i++) {
	    	
	    	   for (int j=i-1; j>=0; j--) {
		    	  System.out.print(i);
		      }
		      System.out.println();
	      }
	      

	      
	        
	        
	        
	}

}
