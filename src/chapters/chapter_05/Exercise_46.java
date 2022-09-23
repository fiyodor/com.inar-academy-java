package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_46 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String str = input.next();
		
		String reverse = "";
		
		for(int i = str.length() - 1; i >= 0; i--){
			
			reverse += str.charAt(i);
		}
		System.out.print("The reversed string is " + reverse);
	}

}
