package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_05 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the subtotal and a gratuity rate: ");

		double subtotal = input.nextDouble();
		
		double gratuity_rate = input.nextDouble();
		
		double gratuity = subtotal * (gratuity_rate / 100);
		
		System.out.println("The gratuity is " + "$" + gratuity + " and total is " + (subtotal + gratuity));
		
	}
}
