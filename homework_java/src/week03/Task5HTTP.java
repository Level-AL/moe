package week03;

import java.util.Scanner;

public class Task5HTTP {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a protocol status code: ");
		int statusCode = scan.nextInt();
		
		String word = "";
		
		switch (statusCode) {
		 
		case 200:
			word = "OK";
			break;
		case 201:
			word = "Created";
			break;
		case 202:
			word = "Accepted";
			break;
		case 301:
			word = "Moved Permanently";
			break;
		case 303:
			word = "See Other";
			break;
		case 304:
			word = "Not Modified";
			break;
		case 307:
			word = "Temporary Redirect";
			break;
		case 400:
			word = "Bad Request";
			break;
		case 401:
			word = "Unauthorized";
			break;
		case 403:
			word = "Forbidden";
			break;
		case 404:
			word = "Not Found";
			break;
		case 410:
			word = "Gone";
			break;
		case 500:
			word = "Internal Server Error";
			break;
		case 503:
			word = "Service Unavailable";
			break;
			
		}
		
		System.out.println("Staus: "+word);
		
		
		
		scan.close();
		
	}

}
