package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount as integer: ");
		
		int amount = input.nextInt();
		
		int amountRemains = amount;
		
		int dollar = amountRemains / 100;
		
		amountRemains %= 100 ;
		
		int cent = amountRemains;
		
		System.out.println("The input " + amount + " represents "+ dollar + " dollars and " + cent + " cents");
		

	}

}
