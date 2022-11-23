package chapters.chapter_12.Exercises;

import java.util.Scanner;

public class Exercise_03 {

    public static void main(String[] args) {

        int[] array = fillArrayRandomly();

        displayArray(array);

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the index of the array: ");

        int indexOfArray = input.nextInt();

        try {
            System.out.println(indexOfArray + ". element of the array is " + array[indexOfArray]);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){

            System.out.println("Out of bounds.");
        }
    }

    public static int[] fillArrayRandomly(){

        int[] array = new int[100];

        for(int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void displayArray(int[] array){

        int counter = 0;

        for(int i = 0; i < array.length; i++) {

            System.out.printf("%2d  ", array[i]);

            counter++;

            if(counter % 10 == 0){

                System.out.println();
            }
        }
    }

}
