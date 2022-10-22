package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       System.out.print("Enter row and column length: ");

        final int ROW = input.nextInt();

        final int COL = input.nextInt();

        int[][] array = new int[ROW][COL];

        System.out.println("Enter " + ROW + " by " + COL + " matrix row by row:");

        fillArrayWithInputs(array);

        displayArray(array);

        sort(array);

        System.out.println();;

        displayArray(array);
    }
    public static void fillArrayWithInputs(int[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextInt();
            }
        }
    }
    public static void sort(int m[][]){

        for (int i = 0; i < m.length; i++) {

            int min0 = m[i][0];

            int min1 = m[i][1];

            int minIndex = i;

            for (int j = i + 1; j < m.length; j++){

                if (m[j][0] < min0 || m[j][1] < min1 && m[j][0] == min0){

                    min0 = m[j][0];

                    min1 = m[j][1];

                    minIndex = j;
                }
            }
            if (minIndex != i){

                m[minIndex][0] = m[i][0];

                m[minIndex][1] = m[i][1];

                m[i][0] = min0;

                m[i][1] = min1;
            }
        }
    }

    public static void displayArray(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.print("   ");
        }
    }
}
