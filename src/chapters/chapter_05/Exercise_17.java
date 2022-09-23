package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer between 1 and 15 :");
		
		int number = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
		
			for (int j = number - i; j > 0; j--) {
			
				System.out.print("   ");
				
			}
			
			for (int j = i; j > 0; j--) {
			
				System.out.printf("%3d",j);
				
				if (j == 1) {
					
					for (int k = 2; k <= i; k++) {
					
						System.out.printf("%3d", k);
					}
				}
			}
			System.out.println();
		}

	}

}