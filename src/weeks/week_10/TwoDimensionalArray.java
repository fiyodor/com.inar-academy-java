package weeks.week_10;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array's row: ");

        final int ROW = input.nextInt();

        System.out.print("Enter array's column: ");

        final int COL = input.nextInt();



        int[][] array = new int[ROW][COL];

        int[][] array2 = new int[ROW][COL];

        fill2DArrWithRandomValues(array, 1,4 );

        print2DArr(array);

        System.out.print("Maximum row index is: " + getIndexOfMaxRow(array));

        System.out.println();

        System.out.print("Maximum column index is: " + getIndexOfMaxCol(array));

    }

    public static void fill2DArrWithRandomValues(int[][] arr, int start, int limit){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = start + (int)(Math.random() * limit);
            }
        }
    }

    public static void print2DArr(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
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

            for (int j = 0; j < array.length; j++) {

                sum += array[j][i];
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
