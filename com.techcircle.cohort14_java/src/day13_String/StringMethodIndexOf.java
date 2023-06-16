package day13_String;

public class StringMethodIndexOf {
public static void main(String[] args) {
//		  		    0123456789
	 String name = "President George Washington";
	 System.out.println(name.charAt(0)); //P
	 
	 System.out.println(name.indexOf('P')); // 0
	 
	 System.out.println(name.indexOf('e')); // 2
 	 
	 System.out.println(name.indexOf("e")); // 2
	 
	 System.out.println(name.indexOf('e', 5)); // 6
	 
	 System.out.println(name.indexOf('e', 7)); // 11
	 
	 System.out.println(name.indexOf(9)); // -1
	 
	 System.out.println(name.charAt(9)); // displays the space
	 
	 System.out.println(name.indexOf("Geo")); // 10,  shows the starting position
	 System.out.println(name.indexOf("Leo")); // Because "leo" doesn't exsist
	 
	 System.out.println(name.length()); //27 ,, characters 
	 
	 System.out.println(name.charAt(27-1)); //n or place "26"
	 
	 System.out.println(name.charAt(name.length()-1));
	 
	 System.out.println(name.indexOf('n'));
	 
	 System.out.println(name.lastIndexOf('n')); //26
	 
	 System.out.println(name.lastIndexOf('e')); //15
	 
	 System.out.println(name.indexOf('G')); //10
	 
	 System.out.println(name.lastIndexOf('G')); //10
	 
	 
}
}
