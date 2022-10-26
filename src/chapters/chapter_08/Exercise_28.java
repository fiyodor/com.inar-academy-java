package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_28 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int ROW_AND_COL = 3;

        int[][] array1 = new int[ROW_AND_COL][ROW_AND_COL];

        int[][] array2 = new int[ROW_AND_COL][ROW_AND_COL];

        System.out.print("Enter list1: ");

        fillArrayWithInputs(array1);

        System.out.print("Enter list2: ");

        fillArrayWithInputs(array2);

        System.out.print("The two arrays are " + ((equals(array1, array2) ? "" : "not") + " strictly identical"));


    }
    public static void fillArrayWithInputs(int[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextInt();
            }
        }
    }
    public static boolean equals(int[][] m1, int[][] m2){

        if (m1.length != m2.length){

            return false;
        }
        for (int i = 0; i < m1.length; i++) {

            for (int j = 0; j < m1[i].length; j++) {

                if (m1[i][j] != m2[i][j]){

                    return false;
                }
            }
        }
        return true;
    }
}
