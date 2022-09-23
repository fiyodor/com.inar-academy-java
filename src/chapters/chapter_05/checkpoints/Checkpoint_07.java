package chapters.chapter_05.checkpoints;

import java.util.Scanner;

public class Checkpoint_07 {
	
	// do-while loop executes itself at least one time.
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	int sum = 0;
	int number = 0;
	do{
	
		System.out.println("Enter an integer " + "(the input ends if it is 0)");
		number = input.nextInt();
		sum += number;
	}while (number != 0);
			
	System.out.println(sum);

	}
}
