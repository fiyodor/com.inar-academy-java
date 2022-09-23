package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_14 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter weight in pounds: ");
		
		double weight = input.nextDouble();
		
		System.out.println("Enter height in inches: ");
		
		double height = input.nextDouble();
		
		double weightInKilogram = weight * 0.45359237;
		
		double heightInMeter = height * 0.0254; 
		
		System.out.println("BMI is " + weightInKilogram / ( heightInMeter * heightInMeter ) );
		
	}
}