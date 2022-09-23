package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN : ");

		String str = input.next();

		int isbnDigits = Integer.parseInt(str);

		int digit1 = isbnDigits / 100000000;
		int remainingDigits = isbnDigits % 100000000;
		int digit2 = remainingDigits / 10000000;
		remainingDigits %= 10000000;
		int digit3 = remainingDigits / 1000000;
		remainingDigits %= 1000000;
		int digit4 = remainingDigits / 100000;
		remainingDigits %= 100000;
		int digit5 = remainingDigits / 10000;
		remainingDigits %= 10000;
		int digit6 = remainingDigits / 1000;
		remainingDigits %= 1000;
		int digit7 = remainingDigits / 100;
		remainingDigits %= 100;
		int digit8 = remainingDigits / 10;
		remainingDigits %= 10;
		int digit9 = remainingDigits;

		int checksum = ((digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5 + digit6 * 6 + digit7 * 7
				+ digit8 * 8 + digit9 * 9) % 11);

		if (checksum == 10) {
			System.out.println("The ISBN-10 number is " + digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5
					+ "" + digit6 + "" + digit7 + "" + digit8 + "" + digit9 + "" + "X");

		} else {
			System.out.println("The ISBN-10 number is " + digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5
					+ "" + digit6 + "" + digit7 + "" + digit7 + "" + digit8 + "" + digit9 + "" + checksum);
		}

	}

}