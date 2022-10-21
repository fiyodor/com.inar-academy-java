package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_10 {

    public static void main(String[] args) {

        final int ROW = 4;

        final int COL = 4;

        int[][] array = new int[ROW][COL];

        fillArrayRandomly(array);

        displayArray(array);

        int maxRow = getIndexOfMaxRow(array);

        int maxCol = getIndexOfMaxCol(array);

        System.out.println("The largest row index: " + maxRow);

        System.out.println("The largest column index: " + maxCol);




    }

    public static void fillArrayRandomly(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = ((int)(Math.random() * 2));
            }
        }
    }

    public static void fillArrayWithInputs(int[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextInt();
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
    public static int getIndexOfMaxRow(int[][] array){

        int sum = 0;

        int max = 0;

        int indexOfMaxRow = -1;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                sum += array[i][j];
            }
            if(sum > max){

                max = sum;

                indexOfMaxRow = i;
            }
            sum = 0;

        }
        // System.out.println("Index of max row is: " + );
        return indexOfMaxRow;
    }
    public static int getIndexOfMaxCol(int[][] array){

        int sum = 0;

        int max = 0;

        int indexOfMaxCol = -1;

        for (int i = 0; i < array[0].length; i++) {

            for (int[] ints : array) {

                sum += ints[i];
            }
            if(sum > max){

                max = sum;

                indexOfMaxCol = i;
            }
            sum = 0;

        }
        // System.out.println("Index of max row is: " + );
        return indexOfMaxCol;
    }
}
