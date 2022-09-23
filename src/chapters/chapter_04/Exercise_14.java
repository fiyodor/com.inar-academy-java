package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_14 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter grade:");
		
		String str = input.nextLine();
		
		char ch = Character.toUpperCase(str.charAt(0));
		
		if ( 'A' <= ch && ch <= 'F'  && 'E' != ch){
			
			switch(ch){
				
			case 'A': System.out.print("The numeric value for grade " + ch + " is " + 4); break;
			case 'B': System.out.print("The numeric value for grade " + ch + " is " + 3); break;
			case 'C': System.out.print("The numeric value for grade " + ch + " is " + 2); break;
			case 'D': System.out.print("The numeric value for grade " + ch + " is " + 1); break;
			case 'F': System.out.print("The numeric value for grade " + ch + " is " + 0); break;
			}
		}else{
			System.out.println(ch + " is an invalid grade");
		}
		
		
	}

}
