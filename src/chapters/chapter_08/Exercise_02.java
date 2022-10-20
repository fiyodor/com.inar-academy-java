package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        final int ROW_LENGTH = 4;

        final int COL_LENGTH = 4;

        System.out.println("Enter " + ROW_LENGTH + " by " + COL_LENGTH + "matrix row by row:");

        double[][] array = new double[ROW_LENGTH][COL_LENGTH];

        fillArrayWithInputs(array);

        displayArray(array);

        double result = sumMajorDiagonal(array);

        System.out.print("Sum of the elements in the major diagonal is " + result);

    }

    public static double sumMajorDiagonal(double[][] m){

        double sum = 0;

        for (int i = 0; i < m.length; i++) {

            sum += m[i][i];
        }
    return sum;
    }

    public static void fillArrayWithInputs(double[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextDouble();
            }
        }
    }

    public static void displayArray(double[][] array){

        for (double[] doubles : array) {
            for (double aDouble : doubles) {

                System.out.printf("%-5.1f", aDouble);
            }
            System.out.println();
        }
    }
}
