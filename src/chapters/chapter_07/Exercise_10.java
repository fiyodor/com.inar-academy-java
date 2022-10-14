package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_10 {

    public static void main(String[] args) {

        final int array_Length = 10;

        double[] array = new double[array_Length];

        System.out.print("Enter " + array_Length + " numbers: ");

        fillArrayWithInputs(array);

        System.out.println("The index of the smallest element in array is " + indexOfSmallestElement(array));

    }
    public static int indexOfSmallestElement(double[] array){

        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[minIndex] > array[i]){

                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void fillArrayWithInputs(double[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();
        }
    }
}
