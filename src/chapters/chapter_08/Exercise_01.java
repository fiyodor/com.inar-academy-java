package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_01 {

    public static void main(String[] args) {

        final int ROW_LENGTH = 3;

        final int COL_LENGTH = 4;

        System.out.println("Enter a " + ROW_LENGTH + " by " + COL_LENGTH + " matrix row by row:");

        double[][] array = new double[ROW_LENGTH][COL_LENGTH];

        fillArrayWithInputs(array);

        displayArray(array);

        System.out.println();

        for (int i = 0; i < array[0].length; i++) {

            System.out.println("The sum of all the elements in " + i + " is: " + sumColumn(array, i));
        }
    }
    public static double sumColumn(double[][] m, int columnIndex){

        double columnSum = 0;

        for (double[] doubles : m) {

            columnSum += doubles[columnIndex];
        }
        return columnSum;
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

                System.out.printf("%-5.1f ", aDouble);
            }
            System.out.println();
        }
    }
}
