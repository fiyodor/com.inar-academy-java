package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_23 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		
		double drivingDistance = input.nextDouble();
		
		System.out.println("Enter miles per gallon: ");

		double milesPerGalon = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");

		double pricePerGalon = input.nextDouble();
		
		double costOfDriving = drivingDistance / milesPerGalon * pricePerGalon;
		
		System.out.println("The cost of driving is " + costOfDriving);
		
	}
}
