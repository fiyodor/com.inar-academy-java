package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of sides: ");

		int numberOfSides = input.nextInt();

		System.out.println("Enter the side: ");

		double lengthOfASide = input.nextDouble();

		double area = (numberOfSides * Math.pow(lengthOfASide, 2)) / (4 * Math.tan(Math.PI / numberOfSides));

		System.out.println("The area of the polygon is " + area);
	}

}
