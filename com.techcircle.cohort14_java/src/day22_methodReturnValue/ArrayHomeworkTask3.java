package day22_methodReturnValue;

public class ArrayHomeworkTask3 {

	public static void main(String[] args) {

		String arr [] = { "anna", "level", "Java"};
		int count = 0;
		
		for (String s: arr) {
			if(StringUtil.isPalendorm(s)) {
				count++;
			}
		}
	System.out.println(count);
		
	}

}
