package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_07 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the number of minutes: ");

		int minute = input.nextInt();
		
		int day = ( (minute / 60) / 24 ) ;
		
		int year = (day / 365);
		
		System.out.println("The sum of the digits is " + year + " years and " + day % 365 + " days");
		
	}
}
