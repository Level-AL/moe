package day33_Exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) throws IOException   {
//IO exeption is also known as a checked expression
//They are checked by the complier at the compile-time and
//the programer is promted to handle these exeptions
		
		File file = new File("/Users/alexanderabiaad/eclipse-workspace/com.techcircle.cohort14_java/src/day33_Exeptions/NoErrorHandlingCode.java");
		
		try {
		FileReader fr = new FileReader(file);
		int i ;
		
		while ((i= fr.read()) != -1) {
			System.out.println((char)i);
			}
		
		}catch(FileNotFoundException e) {
			
			System.out.println("The file that you are trying to open is not available.");
		}
		
	}
}
