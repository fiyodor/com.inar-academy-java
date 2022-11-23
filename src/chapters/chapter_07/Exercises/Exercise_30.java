package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");

        final int NUMBER_OF_VALUES = input.nextInt();

        int[] array = new int[NUMBER_OF_VALUES];

        System.out.print("Enter the values: ");

        fillArrayWithInputs(array);

        System.out.print("The list has " + (isConsecutiveFour(array) ? "" : "no") + " consecutive fours");


    }

    public static boolean isConsecutiveFour(int[] values){

        int counter = 1;

        for (int i = 0; i < values.length - 1; i++) {

            if (values[i] == values[i + 1]){

                counter++;
            }
            else{

                counter = 1;
            }
            if (counter == 4){

                return true;
            }

        }
        return false;


    }

    public static void fillArrayWithInputs(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
    }
}
