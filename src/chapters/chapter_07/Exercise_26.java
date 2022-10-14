package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_26 {

    public static void main(String[] args) {

        final int array_Length = 10;

        int[] array = new int[array_Length];

        int[] array2 = new int[array_Length];

        System.out.print("Enter list1: ");

        fillArrayWithInputs(array);

        System.out.print("Enter list2: ");

        fillArrayWithInputs(array2);

        System.out.print("Two lists are " + (equals(array, array2) ? "" : "not ") + "strictly identical");


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

    public static void fillArrayWithInputs(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
    }
}
