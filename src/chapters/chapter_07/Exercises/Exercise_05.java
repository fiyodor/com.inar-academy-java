package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] args){

        System.out.print("Enter 10 integers: ");

        final int number_Of_Integers = 10;

        int[] array = new int[number_Of_Integers];

        fillArrayWithInputs(array);

        int[] distinctNumbers = new int[number_Of_Integers];

        int countOfDistinct = 0;

        for (int i = 0; i < array.length; i++){

            if (contains(distinctNumbers, array[i], countOfDistinct)){

                distinctNumbers[countOfDistinct] = array[i];

                countOfDistinct++;
            }
        }
        displayArray(distinctNumbers, countOfDistinct);
    }
    public static void fillArrayWithInputs(int[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
    }
    public static void displayArray(int[] numbers, int count){

        System.out.println("The number of distinct number is " + count);

        for (int i = 0; i < count; i++){

            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean contains(int[] numbers, int number, int countOfDistinctNumbers){

        for (int i = 0; i < countOfDistinctNumbers; i++) {

            if (numbers[i] == number)

                return false;
        }
        return true;
    }
}
