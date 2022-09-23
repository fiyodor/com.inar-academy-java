package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_16 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		int number = input.nextInt();
		
		int factor = 2;
		
		String factors = "";
		
		while(number / factor != 1){
			
			if(number % factor == 0){
				
				System.out.print(factor + " ");
				
				number /= factor;
			}
			else{
				
				factor++;
			}
		}
	}

}
