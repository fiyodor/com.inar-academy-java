package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_20 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		
		double balance = input.nextDouble();
		
		double annualInterestRate = input.nextDouble() / 1200;
		
		double interest = balance * annualInterestRate;
		
		System.out.println("The interest is " + interest);
		
	}

}
