package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_12 {

    public static void main(String[] args) {

        final int array_Length = 10;

        int[] array = new int[array_Length];

        System.out.print("Enter " + array_Length + " numbers: ");

        fillArrayWithInputs(array);

        reverseArray(array);

        displayArray(array);

    }
    public static void fillArrayWithInputs(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
    }

    public static void reverseArray(int[] array) {

        for (int arrayIndex = 0, reversedArrayIndex = array.length - 1; arrayIndex < array.length / 2; arrayIndex++, reversedArrayIndex--) {

            int temp = array[reversedArrayIndex];

            array[reversedArrayIndex] = array[arrayIndex];

            array[arrayIndex] = temp;
        }
    }

    public static void displayArray(int[] arr) {

        for (int j : arr) {

            System.out.print(j + " ");
        }
    }

}
