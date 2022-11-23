package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_28 {

    public static void main(String[] args) {

        final int ARRAY_LENGTH = 10;

        int[] array = new int[ARRAY_LENGTH];

        System.out.print("Enter 10 integers: ");

        fillArrayWithInputs(array);

        showCombinations(array);






    }
    public static void fillArrayWithInputs(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
    }

    public static void showCombinations(int[] array){

        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                System.out.printf("(%d,%d) ",array[i],array[j]);

                //System.out.print("(" + array[i] + "," + array[j] + ")");

                counter++;

                if(counter % 10 == 0){

                    System.out.println();
                }
            }
        }
    }


}
