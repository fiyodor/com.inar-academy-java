package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates:");

		double x = input.nextDouble();
		double y = input.nextDouble();
		boolean inTheCircle = (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

		System.out.print("Point (" + x + "," + y + ") is " + ((inTheCircle) ? "in the circle" : "not in the circle"));

	}

}