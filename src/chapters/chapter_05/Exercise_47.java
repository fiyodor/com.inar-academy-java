package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_47 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		
		String isbn = input.next();
		
		if(isbn.length() != 12){
			
			System.out.println(isbn + " is an invalid input");
			
			System.exit(1);
		}
		
		int isbnDigit13 = 0;
		
		
		
		for(int i = 0; i < isbn.length(); i++){
			
			if(i % 2 == 0){
				
				isbnDigit13 += 3 * Integer.parseInt(isbn.charAt(i) + "");
			}
			if(i % 2 != 0){
				
				isbnDigit13 += Integer.parseInt(isbn.charAt(i) + "");
			}
		}
		isbnDigit13 = 10 - (isbnDigit13 % 10);
		
		System.out.println("The ISBN-13 number is " + isbn + (isbnDigit13 == 10 ? 0 : isbnDigit13));
	}

}
