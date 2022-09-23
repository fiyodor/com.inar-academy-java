package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double sum = 0 ;
		int positive = 0 ;
		int negative = 0 ;
		double average = 0 ;
		int count = negative + positive;
		
		System.out.println("Enter an integer, the input ends if it is 0:");
		
		int total = input.nextInt();
		
		if (total == 0){
			
			System.out.println("No numbers are entered except 0");
			
			System.exit(1);
		}
		
		
		while (total != 0){
			
			if(total < 0){
				negative++;
			}
			else if (total > 0 ){
				positive++ ;
			}
			
			sum += total;
			
			average = sum / count;
			
			System.out.println("Enter an integer, the input ends if it is 0:");
			
			total = input.nextInt();
			
		}
		System.out.println("The number of positives is " + positive);
	
		System.out.println("The number of negatives is " + negative);
		
		System.out.println("The total is " + sum);
		
		System.out.println("The average is " + average);
	}

}
