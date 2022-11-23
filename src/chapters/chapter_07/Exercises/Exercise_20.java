package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_20 {

    public static void main(String[] args) {

        final int array_Length = 10;

        double[] array = new double[array_Length];

        System.out.print("Enter " + array_Length + " numbers: ");

        fillArrayWithInputs(array);

        selectionSort(array);

        displayArray(array);
    }
    public static void selectionSort(double[] array) {

        for (int i = array.length - 1; i >= 0; i--) {

            double max = array[i];

            int maxIndex = i;

            for (int j = i - 1; j >= 0; j--) {

                if (max < array[j]) {

                    max = array[j];

                    maxIndex = j;
                }
            }

            if (maxIndex != i) {

                array[maxIndex] = array[i];

                array[i] = max;
            }
        }
    }

    public static void fillArrayWithInputs(double[] array) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();
        }
    }
    public static void displayArray(double[] array){

        for (double i : array) {

            System.out.print(i + " ");

        }
    }

}
