package day43_Leng;

public class ReverseWords {

	
		public static String reverseWords(String sentence) {
			
			StringBuilder sb = new StringBuilder ();
			
			String [] strArr = sentence.split("\\s+"); // " " enter tab carat-return
			// + : one or more
			//" " , "    ", enter enter
			
			// b+
			// b, bb, bbbbbbbbbb
			
			for (int i = strArr.length-1; i>0; i--) {
				sb.append(strArr[i]).append(" ");
			}
			
			
			return sb.toString().trim();
		}
			public static void main(String[] args) {
				
				String str = " I love sql        more than java";
				System.out.println(reverseWords(str));
			
			}
}
