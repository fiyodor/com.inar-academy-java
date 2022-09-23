package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_06 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a number between 0 and 1000: ");

		int number = input.nextInt();
		
		int number1 = number % 10;
		
		int number2 = (number / 10) % 10;
		
		int number3 = (number / 100);
		
		
		System.out.println("The sum of the digits is " + (number1 + number2 + number3));
		
	}
}
