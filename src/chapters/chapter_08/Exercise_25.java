package chapters.chapter_08;

import java.util.Arrays;

import java.util.Scanner;

public class Exercise_25 {

    public static void main(String[] args) {

        final int ROW_COL = 3;

        double[][] array = new double[ROW_COL][ROW_COL];

        System.out.println("Enter a " + ROW_COL + "-by-" + ROW_COL + " matrix row by row:");

        fillArrayWithInputs(array);

        System.out.println();

        displayArray(array);

        System.out.println();

        System.out.println("It is " + ((isMarkovMatrix(array) ? "" : "not") + " a Markov Matrix "));

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

        for (double[] ints : array) {

            System.out.println(Arrays.toString(ints));
        }
    }
    public static boolean isMarkovMatrix(double[][] array){

        return checkPositive(array) && checkColumnSum(array);
    }
    public static boolean checkPositive(double[][] array){

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array[i].length; j++){

                if(array[i][j] < 0){

                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkColumnSum(double[][] array) {

        for(int i = 0; i < array[0].length; i++){

            double sum = 0;

            for(int j = 0; j < array.length; j++){

                sum += array[j][i];
            }
            if(sum != 1){

                return false;
            }
        }
        return true;
    }
}
