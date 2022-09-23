package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_34 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int computerWinCounter = 0;
		int userWinCounter = 0;
		
		while(Math.abs(userWinCounter - computerWinCounter) < 2){
			
			int computerHand = (int)(Math.random() * 3);
			
			System.out.print("Enter 0 for scissor , 1 for rock , 2 for paper : ");
			
			int userHand = input.nextInt();
			
			if (computerHand == 0){
				
				System.out.println("The computer is scissor");
			}
			else if(computerHand == 1){
				
				System.out.println("The computer is rock");
			}
			else{
				
				System.out.println("The computer is paper");
			}
			if (userHand == 0){
				
				System.out.println("You are scissor");
			}
			else if (userHand == 1){
				
				System.out.println("You are rock");
			}
			else{
				
				System.out.println("You are paper");
			}
			if((userHand == 0 && computerHand == 2) || (userHand == 1 && computerHand == 0) || (userHand == 2 && computerHand == 1)){
				
				System.out.println("You won");
				
				userWinCounter++;
			}
			else if(userHand == computerHand){
				
				System.out.println("Draw");
			}
			else{
				
				System.out.println("The computer won");
				
				computerWinCounter++;
			}
		}
		System.out.println("Game has ended! You : " + userWinCounter + " and the computer : " + computerWinCounter);
	}
}
