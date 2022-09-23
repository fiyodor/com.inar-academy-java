package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number1 = (int) (Math.random() * 100);

		int number2 = (int) (Math.random() * 100);

		System.out.print("What is " + number1 + " + " + number2 + "? ");

		int answer = input.nextInt();

		if (number1 + number2 == answer) {

			System.out.println("Right!");
		} else {

			System.out.println("Wrong Answer!!");

			System.out.println(number1 + " + " + number2 + " is " + (number1 + number2));
		}
	}
}