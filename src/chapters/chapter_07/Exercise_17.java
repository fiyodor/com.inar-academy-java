package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");

        final int number_Of_Students = input.nextInt();

        String[] studentsName = new String[number_Of_Students];

        int[] studentsScores = new int[number_Of_Students];

        fillArrayWithInputs(studentsName, studentsScores);

        sortTheScoresDecreasing(studentsName, studentsScores);

        printArray(studentsName, studentsScores);
    }

    private static void sortTheScoresDecreasing(String[] str, int[] score) {

        for (int i = 0; i < str.length; i++) {

            int maxScore = score[i];

            int maxIndex = i;

            String temp;

            for (int j = i + 1; j < str.length; j++) {

                if (score[j] > maxScore) {

                    maxScore = score[j];

                    maxIndex = j;
                }
            }

            if (maxIndex != i) {

                temp = str[i];

                str[i] = str[maxIndex];

                str[maxIndex] = temp;

                score[maxIndex] = score[i];

                score[i] = maxScore;
            }
        }
    }

    public static void fillArrayWithInputs(String[] array, int[] array2) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            int studentNumber = i + 1;

            System.out.print("Student " + studentNumber + "'s name: ");

            array[i] = input.next();

            System.out.print("Student " + studentNumber + "'s score: ");

            array2[i] = input.nextInt();
        }
    }

    public static void printArray(String[] array, int[] array2) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i] + " --> " + array2[i]);
        }
    }

}
