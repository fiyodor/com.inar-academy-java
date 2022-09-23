package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a decimal value (0 to 15): ");

		int decimal = input.nextInt();

		if (0 <= decimal && decimal <= 9) {

			System.out.println("The hex value is " + decimal);
		
		} else if (10 <= decimal && decimal <= 15) {
			
			System.out.println("The hex value is " + (char)(decimal + 'F' - 15));
		}

	}

}
