package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ASCII code (an integer between 0 and 127): ");

		int AsciiCode = input.nextInt();

		char Ascii = (char) AsciiCode;

		System.out.println("The character for ASCII code " + AsciiCode + " is " + Ascii);
	}

}
