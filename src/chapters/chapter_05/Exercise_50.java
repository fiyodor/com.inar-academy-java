package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_50 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String str = input.nextLine();
		
		int counter = 0;
		
		for(int i = 0; i < str.length(); i++){
			
			if(str.charAt(i) <= 'Z' && str.charAt(i) >= 'A'){
			
				counter++;
			}
		}
		System.out.println("The number of uppercase letters is " + counter);
	}

}
