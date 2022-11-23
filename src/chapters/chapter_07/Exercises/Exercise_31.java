package chapters.chapter_07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_31 {
    public static void main(String[] args) {

        System.out.print("Enter list1: ");

        int[] array = fillArrayWithInputsAndReturn();

        System.out.print("Enter list2: ");

        int[] array2 = fillArrayWithInputsAndReturn();

        int[] arrayMerged = merge(array, array2);

        System.out.print("The merged list is ");

        displayArray(arrayMerged);


    }

    public static int[] fillArrayWithInputsAndReturn() {

        Scanner input = new Scanner(System.in);

        final int array_Length = input.nextInt();

        int[] array = new int[array_Length];

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
        return array;
    }

    public static int[] merge(int[] list1, int[] list2) {

        int[] arrayMerged = new int[list1.length + list2.length];

        System.arraycopy(list1, 0, arrayMerged, 0, list1.length);

        System.arraycopy(list2, 0, arrayMerged, list1.length, list2.length);

        Arrays.sort(arrayMerged);

        return arrayMerged;
    }

    public static void displayArray(int[] array) {

        for (int i : array) {

            System.out.print(i + " ");

        }
    }

}
