package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the initial deposit amount: ");
		
		double initialDepositAmount = input.nextDouble();
		
		System.out.print("Enter the annual percentage yield: ");
		
		double annualPercentageYield = input.nextDouble();
		
		System.out.print("Enter maturity period (number of months): ");
		
		int month = input.nextInt();
		
		double cdValue = initialDepositAmount;
		
		System.out.println("Month   CD Value");
		
		for(int i = 1; i <= month; i++){
			
			cdValue = cdValue + (cdValue * annualPercentageYield / 1200);
		
			System.out.println(month + "      " + cdValue);
		}
		
		
		
		
		
		
	}
}
