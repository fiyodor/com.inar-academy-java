package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix: ");

        final int ROW = input.nextInt();

        final int COL = ROW;

        int[][] array = new int[ROW][COL];

        fillArrayRandomly(array);

        displayArray(array);

        showResult(array);



    }
    public static void fillArrayRandomly(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = ((int)(Math.random() * 2));
            }
        }
    }

    public static void displayArray(int[][] array){

        for (int[] numbers : array) {
            for (int aInt : numbers) {

                System.out.print(aInt);
            }
            System.out.println();
        }
    }
    public static boolean allSameOnRow(int[][] array, int n){

        boolean same = false;

        for (int i = 0; i < array.length - 1; i++) {

           if (array[n][i] == array[n][i + 1] ){

               same = true;
           }
           else{

               return false;
           }
        }
        return same;
    }
    public static boolean allSameOnCol(int[][] array, int n){

        boolean same = false;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i][n] == array[i + 1][n]){

                same = true;
            }
            else{

                return false;
            }
        }
        return same;
    }
    public static boolean allSameOnMajDia(int[][] array){

        boolean same = false;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i][i] == array[i + 1][i + 1] ){

                same = true;
            }
            else{

                return false;

            }
        }
        return same;
    }
    public static boolean allSameOnSubDia(int[][] array){

        boolean same = false;

        for (int i = 0, j = array[i].length - 1; i < array.length - 1; i++, j--) {

            if (array[i][array.length - 1 - i] == array[i + 1][j] ){

                same = true;
            }
            else{

                return false;

            }
        }
        return same;
    }
    public static void showResultForRow(int[][] array){

        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if (allSameOnRow(array, i)) {

                System.out.println("All " + (array[i][0] == 0 ? "0" : "1") + "s on row " + i);

                counter++;
            }
        }
        if (counter == 0){

            System.out.println("No same numbers on a row");
        }
    }
    public static void showResultForCol(int[][] array){

        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if (allSameOnCol(array, i)) {

                System.out.println("All " + (array[0][i] == 0 ? "0" : "1") + "s on column " + i);

                counter++;
            }
        }
        if (counter == 0){

            System.out.println("No same numbers on a column");
        }
    }
    public static void showResultForMajDia(int[][] array){

        System.out.println(allSameOnMajDia(array) ? ("All " + (array[0][0] == 0 ? "0" : "1") + "s on the major diagonal") : "No same numbers on the major diagonal");

    }
    public static void showResultForSubDia(int[][] array){

        System.out.println(allSameOnSubDia(array) ? ("All " + (array[0][array.length - 1] == 0 ? "0" : "1") + "s on the sub-diagonal") : "No same numbers on the sub-diagonal");

    }
    public static void showResult(int[][] array) {

        showResultForRow(array);

        showResultForCol(array);

        showResultForMajDia(array);

        showResultForSubDia(array);
    }
}
