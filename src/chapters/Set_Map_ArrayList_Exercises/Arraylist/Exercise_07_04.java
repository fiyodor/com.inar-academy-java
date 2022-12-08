package chapters.Set_Map_ArrayList_Exercises.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_07_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();
        System.out.println("Enter a score(if you enter a negative number the program will end):");
        double number;
        do {
            number = input.nextDouble();
            scores.add(number);

        } while (number >= 0);
        scores.remove(scores.size() - 1);
        displayNumberOfScoresAboveOrEqualTheAverage(scores);
    }

    public static void displayNumberOfScoresAboveOrEqualTheAverage(ArrayList<Double> scores) {
        double average = getAverage(scores);
        System.out.println("Average : " + average);
        for (double score : scores
        ) {
            if (score >= average) {
                System.out.print(score + " ");
            }
        }
    }

    private static double getAverage(ArrayList<Double> scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.size();
    }
}
