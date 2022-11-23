package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_18 {

    public static void main(String[] args) {

        final int array_Length = 10;

        double[] array = new double[array_Length];

        System.out.print("Enter " + array_Length + " double numbers: ");

        fillArrayWithInputs(array);

        bubbleSort(array);

        printArray(array);
    }
    public static void fillArrayWithInputs(double[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();
        }
}
    public static void bubbleSort(double[] array){

        double temp;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - 1; j++) {

                if (array[j] > array[j + 1]){

                    temp = array[j];

                    array[j] = array[j + 1];

                    array[j + 1] = temp;
                }

            }

        }
    }
    public static void printArray(double[] array){

        for (double i : array) {

            System.out.print(i + " ");

        }
    }
}

