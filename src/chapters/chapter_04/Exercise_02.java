package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");

		double point1Latitude = Math.toRadians(input.nextDouble());
		double point1Longitude = Math.toRadians(input.nextDouble()); 

		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");

		double point2Latitude = Math.toRadians(input.nextDouble());
		double point2Longitude = Math.toRadians(input.nextDouble());

		double radius = 6731.01;

		double distance = radius * Math.acos((Math.sin(point1Latitude) * Math.sin(point2Latitude))
				+( Math.cos(point1Latitude) * Math.cos(point2Latitude) * Math.cos(point1Longitude - point2Longitude)));

		System.out.println("The distance between the two points is " + distance + "km");

	}

}
