package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");

        int numOfStudents = input.nextInt();

        int[] scores = new int[numOfStudents];

        char[] grades = new char[numOfStudents];

        System.out.print("Enter " + numOfStudents + " scores: ");

        for (int i = 0; i < numOfStudents; i++) {

            scores[i] = input.nextInt();
        }
        assignGrades(scores, grades);

        for (int i = 0; i < numOfStudents; i++) {

            System.out.println("Student " + i + "'s score is " + scores[i] + " and grade is " + grades[i]);
        }
    }
    public  static void assignGrades(int[] scores, char[] grades){

        int bestScore = getMaxScore(scores);

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] >= bestScore - 10){

                grades[i] = 'A';
            }
            else if (scores[i] >= bestScore - 20){

                grades[i] = 'B';
            }
            else if (scores[i] >= bestScore - 30){

                grades[i] = 'C';
            }
            else if (scores[i] >= bestScore - 40){

                grades[i] = 'D';
            }
            else{

                grades[i] = 'F';
            }

        }
    }

    public static int getMaxScore(int[] scores){

        int maxScore = scores[0];

        for (int i = 1; i < scores.length; i++) {

            if (scores[i] > maxScore){

                maxScore = scores[i];
            }
        }
        return maxScore;
    }
}
