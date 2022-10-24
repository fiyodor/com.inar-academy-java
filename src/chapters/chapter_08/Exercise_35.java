package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");

        final int ROW_AND_COL = input.nextInt();

        int[][] array = new int[ROW_AND_COL][ROW_AND_COL];

        System.out.println("Enter the matrix row by row");

        fillArrayWithInputs(array);

        int[] theLargestBlock = findLargestBlock(array);

        System.out.printf("The maximum square matrix is at (%d, %d) with size %d", theLargestBlock[0], theLargestBlock[1], theLargestBlock[2]);

    }
    public static void fillArrayWithInputs(int[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextInt();
            }
        }
    }

    public static int[] findLargestBlock(int[][] m){

        int[] result = new int[3];

        int edge = 2;

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                while (isSquare(m, i, j, edge)){

                    result[0] = i;

                    result[1] = j;

                    result[2] = edge;

                    edge++;
                }
            }
        }
        return result;
    }

    public static boolean isSquare(int[][] array, int row, int col, int edge){

        if (col + edge > array[row].length){

            return false;
        }
        if (row + edge > array.length){

            return false;
        }
        for (int i = row; i < row + edge; i++) {

            for (int j = col; j < col + edge; j++) {

                if (array[i][j] != 1){

                    return false;
                }
            }
        }
        return true;
    }
}
