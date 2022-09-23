package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_42 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the goal amount: ");

		double goalAmount = input.nextDouble();
		
		double salesAmount;
		
		double commission = 0;
		
		double balance;
		
		salesAmount = 0;
		
		for(salesAmount = 0.01; commission < goalAmount; salesAmount += 0.01){
		 	
			balance = commission = 0.0;	

			
			if(salesAmount >= 10000.01){
				
				commission += (balance = salesAmount - 10000) * 0.12;
			}

			
			else if(salesAmount >= 5000.01){
				
				commission += (balance -= balance - 5000) * 0.10;
			}
			else if(salesAmount >= 0.01){
				
				commission += balance * 0.08;
			}
			
		}

		
		System.out.printf(
			"Minimum sales to earn $%.0f: $%.0f\n", goalAmount, salesAmount);
	}
	
}