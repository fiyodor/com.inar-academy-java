package chapters.chapter_05.checkpoints;

import java.util.Scanner;

public class Listing_05_04 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of questions: ");
		
		int numberOfQuestions = input.nextInt();
		
		int correctCounter = 0;
		int counter = 0;
		
		long startTime = System.currentTimeMillis();
		
		String result = "";
		
		while(counter < numberOfQuestions){
			
			int number1 = (int)(Math.random() * 1001);
			int number2 = (int)(Math.random() * 1001);
			
			if(number2 > number1){
				
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			System.out.println("What is " + number1 + " - " + number2 + " ? ");
			
			int answer = input.nextInt();
			
			if(number1 - number2 == answer){
				
				System.out.println("You are correct!");
				
				correctCounter++;
			}
			else{
				
				System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2));
				
				counter++;
			}
			result += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " correct" : " wrong");
		}
		long endTime = System.currentTimeMillis();
		
		long testTime = (endTime - startTime) / 1000;
		
		System.out.println(correctCounter + " correct answer(s)" + "\nTest time is " + testTime + " seconds\n" + result);
		
		
	}

}
