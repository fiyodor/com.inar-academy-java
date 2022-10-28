package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_26 {

    public static void main(String[] args) {

        final int ROW_AND_COL = 3;

        System.out.printf("Enter a %d-by-%d matrix row by row:\n", ROW_AND_COL, ROW_AND_COL);

        double[][] array = new double[ROW_AND_COL][ROW_AND_COL];

        fillArrayWithInputs(array);

        double[][] rowSortedArray = sortRows(array);

        System.out.println("The row-sorted array is");

        displayArray(rowSortedArray);

        System.out.println("-----------------------");


        System.out.println("The original array is");

        displayArray(array);





    }
    public static void displayArray(double[][] array){

        for (double[] doubles : array) {
            for (double aDouble : doubles) {

                System.out.print(aDouble + " ");
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
    public static double[][] sortRows(double[][] m){

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

                if (sortedArray[i][j] > sortedArray[i][j + 1]){

                    double temp = sortedArray[i][j];

                    sortedArray[i][j] = sortedArray[i][j + 1];

                    sortedArray[i][j + 1] = temp;

                    needNextPass = true;
                }
            }
        }
        return sortedArray;
    }
}
