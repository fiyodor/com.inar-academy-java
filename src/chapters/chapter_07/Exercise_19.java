package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_19 {

    public static void main(String[] args) {

        int[] array = fillArrayWithInputsAndReturn();

        System.out.println("The list is " + (isSorted(array) ? "already sorted" : "not sorted"));


    }
    public static int[] fillArrayWithInputsAndReturn() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the list: ");

        final int array_Length = input.nextInt();

        int[] array = new int[array_Length];

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
        return array;
    }

    public static boolean isSorted(int[] array) {

        return isSortedDecreasing(array) || isSortedIncreasing(array);
    }
    public static boolean isSortedDecreasing(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] < array[i + 1]){

                return false;
            }
        }
        return true;
    }

    public static boolean isSortedIncreasing(int[] array){

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]){

                return false;
            }
        }
        return true;
    }

}
