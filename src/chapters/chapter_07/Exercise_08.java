package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_08 {

    public static void main(String[] args) {

        System.out.print("Enter ten double values: ");

        double[] array = new double[10];

        fillArrayWithInputs(array);

        System.out.println("The average is " + average(array));

    }
    public static int average(int[] array){

        int average = 0;

        for (int j : array) {

            average += j;
        }
        return average / array.length;
    }

    public static double average(double[] array){

        double average = 0;

        for (double v : array) {

            average += v;
        }
        return average / array.length;
    }

    public static void fillArrayWithInputs(double[] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }
    }
}
