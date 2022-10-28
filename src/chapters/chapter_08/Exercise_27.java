package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_27 {

    public static void main(String[] args) {

        final int ROW_AND_COL = 3;

        System.out.printf("Enter a %d-by-%d matrix row by row:\n", ROW_AND_COL, ROW_AND_COL);

        double[][] array = new double[ROW_AND_COL][ROW_AND_COL];

        fillArrayWithInputs(array);

        double[][] colSortedArray = sortColumns(array);

        System.out.println("The col-sorted array is");

        displayArray(colSortedArray);

        System.out.println("-----------------------");

        System.out.println("The original array is");

        displayArray(array);




    }
    public static void displayArray(double[][] array){

        for (double[] doubles : array) {
            for (double aDouble : doubles) {

                System.out.printf(aDouble + " ");
            }
            System.out.println();
        }
    }

    public static void fillArrayWithInputs(double[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextDouble();
            }
        }
    }
    public static double[][] sortColumns(double[][] m){

        double[][] sortedArray = new double[m.length][m.length];

        for (int i = 0; i < sortedArray.length; i++) {

            for (int j = 0; j < sortedArray[i].length; j++) {

                System.arraycopy(m[i], 0, sortedArray[i], 0, sortedArray.length);
            }
        }

        boolean needNextPass = true;

        for (int i = 0; i < sortedArray.length && needNextPass; i++) {

            needNextPass = false;

            for (int j = 0; j < sortedArray.length - 1; j++) {

                if (sortedArray[j][i] > sortedArray[j + 1][i]){

                    double temp = sortedArray[j][i];

                    sortedArray[j][i] = sortedArray[j + 1][i];

                    sortedArray[j + 1][i] = temp;

                    needNextPass = true;
                }
            }
        }
        return sortedArray;
    }
}
