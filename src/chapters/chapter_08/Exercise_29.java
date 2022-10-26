package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_29 {

    public static void main(String[] args) {

        final int ROW_AND_COL = 3;

        int[][] array1 = new int[ROW_AND_COL][ROW_AND_COL];

        int[][] array2 = new int[ROW_AND_COL][ROW_AND_COL];

        System.out.print("Enter list1: ");

        fillArrayWithInputs(array1);

        System.out.print("Enter list2: ");

        fillArrayWithInputs(array2);

        System.out.print("The two arrays are " + ((equals(array1, array2) ? "" : "not") + " identical"));
    }
    public static void fillArrayWithInputs(int[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextInt();
            }
        }
    }
    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int min = array[i];

            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (min > array[j]) {

                    min = array[j];

                    minIndex = j;
                }
            }

            if (minIndex != i) {

                array[minIndex] = array[i];

                array[i] = min;
            }
        }
    }
    public static boolean equals(int[][] m1, int[][] m2){

        int[] array1D1 = to1DArray(m1);

        int[] array1D2 = to1DArray(m2);

        selectionSort(array1D1);

        selectionSort(array1D2);

        for (int i = 0; i < array1D2.length; i++) {

            if (array1D1[i] != array1D2[i]){

                return false;
            }
        }
        return true;

    }
    public static int[] to1DArray(int[][] array2D){

        int[] array = new int[array2D.length * array2D[0].length];

        int counter = 0;

        for (int[] ints : array2D) {

            for (int anInt : ints) {

                array[counter] = anInt;

                counter++;
            }
        }
        return array;
    }
}
