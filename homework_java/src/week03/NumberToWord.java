package week03;

import java.util.Scanner;

public class NumberToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 9: ");
        int number = input.nextInt();

        String word = "";

        switch (number) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            case 8:
                word = "eight";
                break;
            case 9:
                word = "nine";
                break;
            default:
                System.out.println("Invalid input");
                
        }

        System.out.println( word);
        input.close();
	}

}
