package chapters.chapter_07.Exercises;

import java.util.Scanner;

public class Exercise_11 {

    public static void main(String[] args) {

        final int ARRAY_LENGTH = 10;

        double[] array = new double[ARRAY_LENGTH];

        System.out.print("Enter " + ARRAY_LENGTH + " numbers: ");

        fillArrayWithInputs(array);

        double mean = mean(array);

        double deviation = deviation(array);

        System.out.print("The mean is " + mean);

        System.out.print("The deviation is " + deviation);
        }



    public static void fillArrayWithInputs(double[] array) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();
        }
    }



    public static double mean(double[] x){

        double sum = 0;

        double mean = 0;

        for (int i = 0; i <x.length ; i++) {

            sum += x[i];
        }
        mean = sum / x.length;

        return mean;
    }

    public static double deviation(double[] x){

        double mean = mean(x);

        double deviation = 0;

        double sum = 0;

        for (int i = 0; i < x.length; i++) {

            sum += Math.pow(x[i] - mean, 2);
        }
        deviation = Math.sqrt(sum / (x.length - 1));

        return deviation;
    }

}
