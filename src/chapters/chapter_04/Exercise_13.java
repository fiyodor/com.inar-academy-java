package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter: ");

		String str = input.nextLine();

		char ch = str.charAt(0);

		if (Character.isLetter(ch)) {

			switch(Character.toUpperCase(ch)){
			
			case 'A' : System.out.println(Character.toUpperCase(ch) + " is a vowel"); break;
			case 'E' : System.out.println(Character.toUpperCase(ch) + " is a vowel"); break;
			case 'I' : System.out.println(Character.toUpperCase(ch) + " is a vowel"); break;
			case 'O' : System.out.println(Character.toUpperCase(ch) + " is a vowel"); break;
			case 'U' : System.out.println(Character.toUpperCase(ch) + " is a vowel"); break;
			default  : System.out.println(Character.toUpperCase(ch) + " is a consonant");
			
			}
		}else{
			
			System.out.println(ch + " is an invalid input");
		}

	}

}
