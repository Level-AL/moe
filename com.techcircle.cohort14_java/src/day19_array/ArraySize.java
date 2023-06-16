package day19_array;

public class ArraySize {

	public static void main(String[] args) {

		int arr[] = {0,1,2,3,4,5}; // 6 element
		
		System.out.println(arr.length);
		
		
		String str = "Java";
		System.out.println(str.length());
		
		String strArr[] = new String [10];
		
		System.out.println(strArr.length);
		
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(i); // index position for the array
			System.out.println(arr[i]); // each element of the array
		}
		
	}

}
