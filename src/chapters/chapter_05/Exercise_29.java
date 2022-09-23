package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_29 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year:");
		
		int year = input.nextInt();

		System.out.println("Enter the first day of the year (enter 1 for monday, 7 or 0 for sunday)");
		
		int day = input.nextInt();

		int firstDayOfTheMonth = 0;
		int numberOfDay;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		int count = 0;

		for (int i = 1; i <= 12; i++) {
			switch (i) {
			case 1:
				numberOfDay = 31;
				
				count = 0;
				
				firstDayOfTheMonth = day;
				
				System.out.println("       January " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
				
					System.out.printf("%4s", " ");
				}
				
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
				
					System.out.printf("%4d", z);
				}
				
				if (firstDayOfTheMonth != 7) {
				
					System.out.println();
				}
				
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
				
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
						System.out.printf("%4d", x);
					}
				}
				break;
			
			case 2:
			
				count = 0;
				
				firstDayOfTheMonth = (day + 31) % 7;
				
				if (isLeapYear == true) {
				
					numberOfDay = 29;
				} 
				else{
					numberOfDay = 28;
				System.out.println("       February " + year);
				System.out.println("____________________________");
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				}
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
				
					System.out.printf("%4s", " ");
				}
				
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
				
					System.out.printf("%4d", z);
				}
				
				if (firstDayOfTheMonth != 7) {
				
					System.out.println();
				}
				
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
				
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
						System.out.printf("%4d", x);
					}
				}
				break;
			
			case 3:
			
				numberOfDay = 31;
				
				count = 0;
				
				firstDayOfTheMonth = isLeapYear == true ? (day + 60) % 7 : (day + 59) % 7;
				
				System.out.println("         March " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
				
					System.out.printf("%4s", " ");
				}
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
					
					System.out.printf("%4d", z);
				}
				
				if (firstDayOfTheMonth != 7) {
				
					System.out.println();
				}
				
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
				
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
						System.out.printf("%4d", x);
					}
				}
				break;
			
			case 4:
			
				numberOfDay = 30;
				
				count = 0;
				
				firstDayOfTheMonth = isLeapYear == true ? (day + 91) % 7 : (day + 90) % 7;
				
				System.out.println("         April " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
				
					System.out.printf("%4s", " ");
				}
				
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
				
					System.out.printf("%4d", z);
				}
				
				if (firstDayOfTheMonth != 7) {
				
					System.out.println();
				}
				
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
				
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
						System.out.printf("%4d", x);
					}
				}
				break;
			
			case 5:
				
				numberOfDay = 31;
				
				count = 0;
				
				firstDayOfTheMonth = isLeapYear == true ? (day + 121) % 7 : (day + 120) % 7;
			
				System.out.println("          May " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
				
					System.out.printf("%4s", " ");
				}
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
				
					System.out.printf("%4d", z);
				}
				if (firstDayOfTheMonth != 7) {
				
					System.out.println();
				}
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
					
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					}
					else{
						System.out.printf("%4d", x);
					}
				}
				break;
			
			case 6:
				
				numberOfDay = 30;
				
				count = 0;
				
				firstDayOfTheMonth = isLeapYear == true ? (day + 152) % 7 : (day + 151) % 7;
				
				System.out.println("          June " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
				
					System.out.printf("%4s", " ");
				}
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
				
					System.out.printf("%4d", z);
				}
				if (firstDayOfTheMonth != 7) {
				
					System.out.println();
				}
				
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
				
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
						System.out.printf("%4d", x);
					}
				}
				break;
			
			case 7:
				
				numberOfDay = 31;
				
				count = 0;
				
				firstDayOfTheMonth = isLeapYear == true ? (day + 182) % 7 : (day + 181) % 7;
				
				System.out.println("          July " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
				
					System.out.printf("%4s", " ");
				}
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
				
					System.out.printf("%4d", z);
				}
				if (firstDayOfTheMonth != 7) {
					
					System.out.println();
				}
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
					
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
						System.out.printf("%4d", x);
					}
				}
				break;
			
			case 8:
				
				numberOfDay = 31;
				
				count = 0;
				
				firstDayOfTheMonth = isLeapYear == true ? (day + 213) % 7 : (day + 212) % 7;
				
				System.out.println("        August " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
					
					System.out.printf("%4s", " ");
				}
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
					
					System.out.printf("%4d", z);
				}
				if (firstDayOfTheMonth != 7) {
					
					System.out.println();
				}
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
					
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
						System.out.printf("%4d", x);
					}
				}
				break;
			
			case 9:
			
				numberOfDay = 30;
				
				count = 0;
				
				firstDayOfTheMonth = isLeapYear == true ? (day + 244) % 7 : (day + 243) % 7;
				
				System.out.println("       September " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
					
					System.out.printf("%4s", " ");
				}
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
					
					System.out.printf("%4d", z);
				}
				if (firstDayOfTheMonth != 7) {
					
					System.out.println();
				}
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
					
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
						System.out.printf("%4d", x);
					}
				}
				break;
			
			case 10:
			
				numberOfDay = 31;
				
				count = 0;
				
				firstDayOfTheMonth = isLeapYear == true ? (day + 274) % 7 : (day + 273) % 7;
				
				System.out.println("       October " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
					System.out.printf("%4s", " ");
				}
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
					
					System.out.printf("%4d", z);
				}
				if (firstDayOfTheMonth != 7) {
					
					System.out.println();
				}
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
					
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
						System.out.printf("%4d", x);
					}
				}
				break;
			
			case 11:
			
				numberOfDay = 30;
				
				count = 0;
				
				firstDayOfTheMonth = isLeapYear == true ? (day + 305) % 7 : (day + 304) % 7;
				
				System.out.println("       November " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
				
					System.out.printf("%4s", " ");
				}
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
				
					System.out.printf("%4d", z);
				}
				if (firstDayOfTheMonth != 7) {
					
					System.out.println();
				}
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
				
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
					
						System.out.printf("%4d", x);
					}
				}
				break;

			case 12:
			
				numberOfDay = 31;
				
				count = 0;
				
				firstDayOfTheMonth = isLeapYear == true ? (day + 335) % 7 : (day + 334) % 7;
				
				System.out.println("       December " + year);
				
				System.out.println("____________________________");
				
				System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
				
				for (int t = firstDayOfTheMonth; 0 < t && t < 7; t--) {
				
					System.out.printf("%4s", " ");
				}
				for (int z = 1; z <= 7 - firstDayOfTheMonth; z++) {
				
					System.out.printf("%4d", z);
				}
				if (firstDayOfTheMonth != 7) {
				
					System.out.println();
				}
				for (int x = 8 - firstDayOfTheMonth; x <= numberOfDay; x++) {
				
					count++;
					
					if (count % 7 == 0) {
					
						System.out.printf("%4d\n", x);
					} 
					else{
						
						System.out.printf("%4d", x);
					}
				}
				break;
			}
			System.out.println();
		
			System.out.println();
		}
	}
}