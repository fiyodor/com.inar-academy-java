package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_04 {

    public static void main(String[] args) {

        System.out.println("Enter a score(if you enter a negative number the program will end):");

        final int number_Of_Scores = 100;

        int[] scores = new int[number_Of_Scores];

        Scanner input = new Scanner(System.in);

        double sum = 0;

        double average;

        int scoreCounter = 0;

        int number;

        for (int i = 0; i < scores.length; i++) {

            number = input.nextInt();

            if (number < 0){

                break;
            }
            scores[i] = number;

            sum += scores[i];

            scoreCounter++;
        }
        average = (sum / scoreCounter);

        int aboveOrEqualToAverage = 0;

        int belowAverage = 0;

        for (int i = 0; i < scoreCounter; i++) {

            if (scores[i] >= average){

                aboveOrEqualToAverage++;
            }
            else{

                belowAverage++;
            }
        }
        System.out.println("The average of scores is " + average);

        System.out.println(belowAverage + " scores are below the average");

        System.out.println(aboveOrEqualToAverage + " scores are above or equal the average");
    }

}
