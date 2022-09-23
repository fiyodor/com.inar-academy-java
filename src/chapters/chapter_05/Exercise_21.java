package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_21 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the loan amount: ");
		
		int loanAmount = input.nextInt();
		
		System.out.print("Enter number of years: ");
		
		int numberOfYears = input.nextInt();
		
		System.out.println("Interest Rate    Monthly Rate       Total Payment");
		
		System.out.println();
		
		for (double i = 5; i <= 8; i += 0.125){
			
			System.out.printf("%-5.3f", i);
			
			System.out.print("%           ");
			
			double monthInterestRate = i / 1200;
			
			double monthlyPayment = loanAmount * monthInterestRate / (1 - 1 / Math.pow(1 + monthInterestRate, numberOfYears * 12));
			
			System.out.printf("%-19.2f", monthlyPayment);
			
			System.out.printf("%-8.2f\n",(monthlyPayment * 12) * numberOfYears);
		}
	}

}
