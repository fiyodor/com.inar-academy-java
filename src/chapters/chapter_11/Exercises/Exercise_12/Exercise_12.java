package chapters.chapter_11.Exercises.Exercise_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_12 {

    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_NUMBERS = 5;

        System.out.print("Enter " + NUMBER_OF_NUMBERS + " numbers: ");

        for(int i = 0; i < NUMBER_OF_NUMBERS; i++) {

            list.add(input.nextDouble());
        }
        System.out.println(list);

        System.out.println("Sum of the list is " + sum(list));

    }

    public static double sum(ArrayList<Double> list){

        double sum = 0;

        for(int i = 0; i < list.size(); i++) {

            sum += list.get(i);
        }
        return sum;


    }
}
