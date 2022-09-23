package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		
		int number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		
		int number2 = input.nextInt();
		
		int gcd = 0;
		
		if(number1 < number2){
			
			gcd = number1;
		}
		else{
			
			gcd = number2;
		}
		
		while(number1 % gcd != 0 || number2 % gcd !=0){
			
			gcd--;
		}
		System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + gcd);
		
		
		
	}
}
