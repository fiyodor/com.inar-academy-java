package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_15 {

    public static void main(String[] args) {

        final int array_Length = 10;

        int[] array = new int[array_Length];

        System.out.print("Enter " + array_Length + " numbers: ");

        fillArrayWithInputs(array);

        displayArray(eliminateDuplicates(array));

    }
    public static void fillArrayWithInputs(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
    }

    public static int[] eliminateDuplicates(int[] list){

        int[] duplicatesEliminated = new int[list.length];

        boolean isDuplicate;

        int counter = 0;

        for (int i = 0; i < list.length; i++) {

            isDuplicate = false;

            for (int j = i + 1; j < list.length; j++) {

                if (list[i] == list[j]) {

                    isDuplicate = true;

                    break;
                }
            }
            if (!isDuplicate){

                duplicatesEliminated[counter] = list[i];

                counter++;
            }
        }
        int[] distinctNumbers = new int[counter];

        System.arraycopy(duplicatesEliminated, 0, distinctNumbers, 0 , counter);

        return distinctNumbers;
    }
    public static void displayArray(int[] array){

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

}
