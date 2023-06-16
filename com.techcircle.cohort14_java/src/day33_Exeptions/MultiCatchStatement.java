package day33_Exeptions;

public class MultiCatchStatement {
	public static void main(String[] args) throws Error {
		
		/*
		 * for each block, there can be zero or more catch blocks
		 * multiple catch blocks allow us to handle each exception differently
		 * 
		 */
		
		String str = "Welcome!";
		
		char arr []= str.toCharArray();
		
		
		
		try {
			System.out.println(str.charAt(11));
			
			for (int i = 0;i<= arr.length; i++) {
				System.out.println(arr[i]);
				
			}
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("String index problem");
		}catch (Exception e) {
			System.out.println("Array index issue");
		}catch(Error e){
			System.out.println(e.getMessage());
		}catch(Throwable e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally block will run again");
		}
		
		System.out.println("Program is complete");
	}
}
