package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_41 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = 0;
        int count = 0;
        int number = 0;

        do {
            System.out.print("Enter a number: ");

            number = input.nextInt();

            if (number > max) {
               
            	count = 1;
                
            	max = number;
                
            	//continue;
            }
            if (number == max) {
                count++;
            }

        } while (number != 0);

        System.out.println("Max is: " + max + "\nThe count for max is: " + count);
    }
}