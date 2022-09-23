package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a year: ");
		
		int year = input.nextInt();
		
		System.out.println("Enter first three letters of a month with the first letter in uppercase:");
		
		String month = input.next();
		
		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
			
			switch (month) {
			
			case "Jan" :
			case "Mar" :
			case "May" :
			case "Jul" :
			case "Aug" :
			case "Oct" :
			case "Dec" :System.out.print(month + " " + year + " has " + 31 + " days"); break;
			case "Apr" :
			case "Jun" :
			case "Sep" :
			case "Nov" :System.out.print(month + " " + year + " has " + 30 + " days"); break;
			case "Feb" :System.out.print(month + " " + year + " has " + ((leapYear) ? 29 : 28) + " days"); break;
			}			
	}
}

