package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_11 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double yearInSecond = 365 * 24 * 60 * 60 ;
		
		double death= yearInSecond /13;
		
		double birth= yearInSecond / 7;
		
		double newImmigrant = yearInSecond / 45;
		
		int population = 312032486 ;
		
		System.out.println("Enter the number of years: ");
		
		int years = input.nextInt();
		
		population = (int) (population + ( years * ( birth - death + newImmigrant ) ) );

		System.out.println("The population in " + years + " years is " + population);
		
	}

}
