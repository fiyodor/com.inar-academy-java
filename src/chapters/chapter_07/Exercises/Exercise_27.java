package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_27 {

    public static void main(String[] args) {

        System.out.print("Enter list1: ");

        int[] array = fillArrayWithInputs();

        System.out.print("Enter list2: ");

        int[] array2 = fillArrayWithInputs();

        selectionSort(array);

        selectionSort(array2);

        System.out.print("Two lists are " + (equals(array, array2) ? "" : "not ") + "identical");

    }
    public static int[] fillArrayWithInputs(){

        Scanner input = new Scanner(System.in);

        int arrayLength = input.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
        return array;
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

    public static boolean equals(int[] list1, int[] list2){

        if (list1.length != list2.length){

            return false;
        }
        for (int i = 0; i < list1.length; i++) {

            if (list1[i] != list2[i]){

                return false;
            }
        }
        return true;
    }
}
