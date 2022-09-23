package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_01 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter degree Celcius: ");

		double celsius = input.nextDouble();
		
		double fahrenheit = (9/5) * celsius + 32;
		
		System.out.println(celsius + " Celsius Degree is " + fahrenheit + " Fahrenheit Degree" );
	}

}
