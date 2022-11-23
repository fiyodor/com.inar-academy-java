package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_14 {

    public static void main(String[] args) {

        final int ARRAY_LENGTH = 5;

        System.out.print("Enter " + ARRAY_LENGTH + " numbers: ");

        int[] array = new int[ARRAY_LENGTH];

        fillArrayWithInputs(array);

        System.out.print("The GCD is " + gcd(array));


    }

    public static void fillArrayWithInputs(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
    }

    public static int gcd(int... numbers){

        int gcd = 1;

        int divideWith = 2;

        selectionSort(numbers);

        boolean dividesAll;

        int min = numbers[0];

        while(divideWith <= min){

            dividesAll = true;

            for (int number : numbers) {

                if (number % divideWith != 0) {

                    dividesAll = false;

                    break;
                }
            }
            if (dividesAll){

                gcd = divideWith;
            }
            divideWith++;
        }
        return gcd;
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

}
