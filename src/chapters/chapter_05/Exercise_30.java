package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount: ");
		
		double amount = input.nextDouble();
		
		System.out.print("Enter the annual interest rate: ");
		
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of months: ");
		
		int month = input.nextInt();
		
		double monthlyInterestRate = (annualInterestRate / 100 / 12);
		
		double savings = 0;
		
		for(int i = 1; i <= month; i++){
			
			savings = (amount + savings) * (1 + monthlyInterestRate);
		}
		System.out.println(month + " month later, the value in the account becomes " + savings);
		
		
		
		
		
	}
}
