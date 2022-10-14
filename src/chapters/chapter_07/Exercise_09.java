package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_09 {

    public static void main(String[] args) {

        final int array_Length = 10;

        double[] array = new double[array_Length];

        System.out.print("Enter " + array_Length + " numbers: ");

        fillArrayWithInputs(array);

        System.out.println("The minimum number is " + min(array));


    }
    public static double min(double[] array){

        double min = array[0];

        for (int i = 1; i < array.length; i++) {

            if (min > array[i]){

                min = array[i];
            }
        }
        return min;
    }

    public static void fillArrayWithInputs(double[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();
        }
    }
}
