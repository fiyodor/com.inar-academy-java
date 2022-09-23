package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length from the center to a vertex: ");
		
		double length = input.nextDouble();
		
		double lengtOfASide = 2 * length * (Math.sin(Math.PI / 5));
		
		double areaOfThePentagon = ( 5 * Math.pow(lengtOfASide, 2)) / ( 4 * Math.tan(Math.PI / 5)); 
	
		System.out.println("The area of the pentagon is " + areaOfThePentagon);
		
		
	}

	
}
