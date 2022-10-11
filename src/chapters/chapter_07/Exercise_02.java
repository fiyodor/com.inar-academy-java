package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        System.out.print("Enter 10 integers: ");

        final int number_Of_Integers = 10;

        int[] array = new int[number_Of_Integers];

        fillArray(array);

        printArray(reverseArray(array));

    }
    public static int[] reverseArray(int[] array){

        int[] reversedArray = new int[array.length];

        for (int i = 0; i <reversedArray.length ; i++) {

            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
    public static void fillArray(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
    }

    public static void printArray(int[] array){

        for (int i : array) {

            System.out.print(i + " ");

        }
    }
}


