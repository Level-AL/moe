package day10_forLoop;

public class ForLoop {

	public static void main(String[] args) {

		int count = 1;

		while (count <= 10) {
			System.out.println(count);
			count++;
		}

		System.out.println("-------------");

		count = 1;

		do {
			System.out.println(count);
			count++;
		} while (count <= 10);

		System.out.println("-------------");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("-------------");
		
		for (int i =25; i <36; i++) {
			// System.out.println(i);
			System.out.println("Hello Java");
		}
		
		System.out.println("-----------");
		
		for (int a = 10; a>=1; a--) {
			System.out.println(a);
		}
		
		System.out.println("------------");
		
		for (int c=10; c>=1; c--) {
			System.out.println(c);
			if(c==5) {
				break;
			}
		}
		
		// task 1 
		
		String str1 = "*";
		String str2 = "**";
		String str3 = "***";
		String str4 = "****";
		String str5 = "*****";
		
		
System.out.println("----------");
        
        
        for(int i = 1; i <= 5; i++) {
            
            
            switch(i) {
            case 1:
                System.out.println(str5);
                break;
            case 2:
                System.out.println(str4);
                break;
                
            case 3:
                System.out.println(str3);
                break;
                
            case 4:
                System.out.println(str2);
                break;
                
            case 5:
                System.out.println(str1);
                break;
            }
            
            
        }
       System.out.println("-----------");
			
      // task 2 print sum of all numbers 1 to 100
       
       int sum = 0;

       for (int i = 1; i <= 100; i++) {
         sum += i;
       }
       System.out.println("The sum of all numbers between 1 and 100 is: " + sum);

			
		
		
		
	}
}
