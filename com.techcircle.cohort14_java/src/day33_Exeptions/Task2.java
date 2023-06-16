 package day33_Exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
	/*
     *  Using finally:
     *  Write a Java program that simulates a simple file-reading operation. 
     *  Create a class with methods to open, read, and close a file. 
     *  Use exception handling to address any issues that might occur during file operations,
     *  such as FileNotFoundException or IOException.
     *  Use a finally block to ensure that the file is always closed, 
     *  regardless of whether an exception is thrown or not.*/
    
    public static void main(String[] args) throws Exception {
        
        File file = new File( "/Users/alexanderabiaad/eclipse-workspace/com.techcircle.cohort14_java/src/day33_Exeptions/Task2.java");

        FileReader fr = null;
        try {
        	fr = new FileReader(file);
        	
        	// fr.close();
        	int i;
        	// holds true till there is nothing to read
        	while((i=fr.read()) != -1) {
        		System.out.println((char)i);
        	}
        }catch(Exception e) {
        	e.printStackTrace();
        	
        }finally {
        	
        	if (fr != null) {
        	fr.close();
        	}
        }
        	
        	
   
    
    }
}
