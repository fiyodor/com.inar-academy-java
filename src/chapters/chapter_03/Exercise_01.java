package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");

		double a = input.nextDouble();

		double b = input.nextDouble();

		double c = input.nextDouble();

		double discriminantOfTheQuadraticEquation = Math.pow(b, 2) - 4 * a * c;

		System.out.print("The equation has ");

		if (discriminantOfTheQuadraticEquation > 0) {

			double root1 = (-b + Math.pow(discriminantOfTheQuadraticEquation, 0.5)) / (2 * a);

			double root2 = (-b - Math.pow(discriminantOfTheQuadraticEquation, 0.5)) / (2 * a);

			System.out.println("two roots " + root1 + " and " + root2);
		}

		else if (discriminantOfTheQuadraticEquation == 0) {

			double root1 = (-b + Math.pow(discriminantOfTheQuadraticEquation, 0.5)) / (2 * a);

			System.out.println("one root " + root1);
		} else {
			System.out.println("no real roots");
		}

	}

}
