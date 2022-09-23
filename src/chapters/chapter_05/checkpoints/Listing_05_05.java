package chapters.chapter_05.checkpoints;

import java.util.Scanner;

public class Listing_05_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int result = 0;
		
		int data;
		
		System.out.print("Enter an integer (the input ends if it is 0): ");
		
		data = input.nextInt();
		
		while(!(data == 0)){
			
			result += data;
			
			System.out.print("Enter an integer (the input ends if it is 0): ");
			
			data = input.nextInt();
		}
		System.out.print("\nThe result is " + result);
	}
}
