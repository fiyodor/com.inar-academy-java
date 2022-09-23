package chapters.chapter_05.checkpoints;

import java.util.Scanner;

public class Listing_05_02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 101);
		
		System.out.println("Guess a magic number between 0 and 100");
		
		boolean guessTF = true;
		
		
		while(guessTF){
		
		System.out.print("Enter your guess: ");
		
		int guess = input.nextInt();
		
			if(guess == number1){
				
				guessTF = false;
			}
			if(guess > number1){
				
				System.out.println("Your guess is too high");
			}
			else if(guess < number1){
				
				System.out.println("Your guess is too low");
			}
		}
		System.out.println("Yes, the number is " + number1);
		
	}

}
