package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_13 {

    public static void main(String[] args) {

        final int array_Length = 10;

        System.out.print("Enter " + array_Length + " numbers that will be excluded: ");

        int[] array = new int[array_Length];

        fillArrayWithInputs(array);

        System.out.println(getRandom(array));


    }

    public static void fillArrayWithInputs(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
    }

    public static int getRandom(int... numbers){

        int randomNumber = 1 + (int)(Math.random() * 54);

        for (int number : numbers) {

            if (randomNumber == number) {

                return getRandom(numbers);
            }

        }
        return randomNumber;
    }
}
