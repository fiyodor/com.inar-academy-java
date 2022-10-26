package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_15 {

    public static void main(String[] args) {

        double[][] array = new double[5][2];

        System.out.print("Enter five points: ");

        fillArrayWithInputs(array);

        System.out.print("The five points are " + (sameLine(array) ? "" : "not") + " on the same line");

    }
    public static void fillArrayWithInputs(double[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextDouble();
            }
        }
    }

    public static boolean sameLine(double[][] points){

        return (points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) == 0 &&

                (points[2][0] - points[1][0]) * (points[3][1] - points[1][1]) - (points[3][0] - points[1][0]) * (points[2][1] - points[1][1]) == 0 &&

                (points[3][0] - points[2][0]) * (points[4][1] - points[2][1]) - (points[4][0] - points[2][0]) * (points[3][1] - points[2][1]) == 0;
    }
}

