package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_20 {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a string: ");
		
		String str = input.next();
		
		int strLength = str.length();
		
		char firstCharacter = str.charAt(0);
		
		System.out.println("The String you have entered has " + strLength + " length and it's first letter is " + firstCharacter);
	}
	
	
	

}
