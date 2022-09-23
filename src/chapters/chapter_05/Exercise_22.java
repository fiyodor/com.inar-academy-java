package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_22 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the loan amount: ");
		
		int loanAmount = input.nextInt();
		
		System.out.print("Enter number of years: ");
		
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter annual interest rate: ");
		
		double annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		
		System.out.println("Monthly payment: " + ((int)(monthlyPayment * 10) / 10.0));
		
		System.out.println("Total Payment: " + ((int)(monthlyPayment * 10) / 10.0) * 12 * numberOfYears);
		
		double balance = loanAmount;
		double principal; 
		double interest;
		
		System.out.println("Payment#     Interest     Principal     Balance");
		
		for(int i = 1; i <= numberOfYears * 12; i++){
			
			interest = monthlyInterestRate * balance;
			
			principal = monthlyPayment - interest;
			
			balance -= principal;
			
			System.out.println(i + "            " + ((int)(interest * 10) / 10.0) + "          " + ((int)(principal * 10) / 10.0) + "           " + ((int)(balance * 10) / 10.0));
		}
		
		
	}

}
