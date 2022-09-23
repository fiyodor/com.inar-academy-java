package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		
		String str = input.nextLine();
		
		char ch = Character.toUpperCase(str.charAt(0));
		
		int correspondingNumber = 0;
		
		if (Character.isLetter(ch)){
			
			if 		(ch >= 'W')	correspondingNumber = 9;
			else if (ch >= 'T') correspondingNumber = 8;
			else if (ch >= 'P') correspondingNumber = 7;
			else if (ch >= 'M') correspondingNumber = 6;
			else if (ch >= 'J') correspondingNumber = 5;
			else if (ch >= 'G') correspondingNumber = 4;
			else if (ch >= 'D') correspondingNumber = 3;
			else if (ch >= 'A') correspondingNumber = 2;
			
			System.out.println("The corresponding number for " + ch + " is " + correspondingNumber);
	
		}else{
			
			System.out.println(ch + " is an invalid input");
		}
		
		
		
	}
	
	


}
