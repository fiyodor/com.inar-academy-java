package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_28 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		
		int year = input.nextInt();
		
		System.out.println("Enter the first day of the year : ");
		
		int firstDay = input.nextInt();
		
		int firstDayOfTheMonth = 0;
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		for(int i = 1; i <=12; i++){
			
			switch (i) {
			
			case 1:  firstDayOfTheMonth = firstDay;System.out.print("January 1, ");break;
			case 2:  firstDayOfTheMonth =(firstDay + 31) % 7;System.out.print("February 1, "); break;
			case 3:  firstDayOfTheMonth = isLeap == true ? (firstDay + 60) % 7 : (firstDay + 59) % 7;System.out.print("March 1, ");break;
			case 4:  firstDayOfTheMonth = isLeap == true ? (firstDay + 91) % 7 : (firstDay + 90) % 7;System.out.print("April 1, ");break;
			case 5:  firstDayOfTheMonth = isLeap == true ? (firstDay + 121) % 7 : (firstDay + 120) % 7;System.out.print("May 1, ");break;
			case 6:  firstDayOfTheMonth = isLeap == true ? (firstDay + 152) % 7 : (firstDay + 151) % 7;System.out.print("June 1, ");break;
			case 7:  firstDayOfTheMonth = isLeap == true ? (firstDay + 182) % 7 : (firstDay + 181) % 7;System.out.print("July 1, ");break;
			case 8:  firstDayOfTheMonth = isLeap == true ? (firstDay + 213) % 7 : (firstDay + 212) % 7;System.out.print("August 1, ");break;
			case 9:  firstDayOfTheMonth = isLeap == true ? (firstDay + 244) % 7 : (firstDay + 243) % 7;System.out.print("September 1, ");break;
			case 10: firstDayOfTheMonth = isLeap == true ? (firstDay + 274) % 7 : (firstDay + 273) % 7;System.out.print("October 1, ");break;
			case 11: firstDayOfTheMonth = isLeap == true ? (firstDay + 305) % 7 : (firstDay + 304) % 7;System.out.print("November 1, ");break;
			case 12: firstDayOfTheMonth = isLeap == true ? (firstDay + 335) % 7 : (firstDay + 334) % 7;System.out.print("December 1, ");break;
			}
			switch (firstDayOfTheMonth) {
			
			case 0: System.out.println(year + " is Sunday");break;
			case 1: System.out.println(year + " is Monday");break;
			case 2: System.out.println(year + " is Tuesday");break;
			case 3: System.out.println(year + " is Wednesday");break;
			case 4: System.out.println(year + " is Thursday");break;
			case 5: System.out.println(year + " is Friday");break;
			case 6: System.out.println(year + " is Saturday");break;
			}
		}
		
		
	}

}
