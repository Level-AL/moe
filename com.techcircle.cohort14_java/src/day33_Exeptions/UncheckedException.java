package day33_Exeptions;

public class UncheckedException {
	public static void main(String[] args) {
		
		String str = "Welcome!";
		
		char arr[]= str.toCharArray();
		
		try {
		for (int i = 0; i <= arr.length; i++) {
			System.out.print(arr[i]);
		 }
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
