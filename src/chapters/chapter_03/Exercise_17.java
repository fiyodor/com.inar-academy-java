package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int random = (int) (Math.random() * 3);

		System.out.print(" Enter 0 for scissor , 1 for rock , 2 for paper : ");

		int user = input.nextInt();

		if (random == 0)
			System.out.println("The computer is scissor.");
		else if (random == 1)
			System.out.println("The computer is rock.");
		else
			System.out.println("The computer is paper");

		if (user == 0)
			System.out.println("You are scissor.");
		else if (user == 1)
			System.out.println("You are rock.");
		else
			System.out.println("You are paper");

		if ((user == 0 && random == 2) || (user == 1 && random == 0) || (user == 2 && random == 1))
			System.out.println(" You won");
		else if (user == random)
			System.out.println("draw");
		else
			System.out.println("Computer won");

	}

}