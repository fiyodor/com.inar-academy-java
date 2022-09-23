package weeks.week_03;

import java.util.Scanner;

public class Question_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your salary: ");

		double salary = input.nextDouble();

		System.out.println("Enter your year of service: ");

		double yearOfService = input.nextDouble();

		double netBonusAmount = salary * 0.05;

		if (yearOfService > 5) {

			System.out.println("Your net bonus amount is: " + netBonusAmount);

		} else {

			System.out.println("Your net bonus amount is: 0");
		}

	}

}
