package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] array = new double[3][2];

        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");

        fillArrayWithInputs(array);

        System.out.printf(isOnTheSameLine(array) ? "The three points are on the same line" : "The area of the triangle is %5.2f", getTriangleArea(array));


    }
    public static void fillArrayWithInputs(double[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextDouble();
            }
        }
    }
    public static double getTriangleArea(double[][] points){

        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];

        if (isOnTheSameLine(points)){

            return 0;
        }
        double side1 = Math.pow (Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2), 0.5);
        double side2 = Math.pow (Math.pow (x3 - x2, 2) + Math.pow (y3 - y2, 2), 0.5);
        double side3 = Math.pow (Math.pow (x1 - x3, 2) + Math.pow (y1 - y3, 2), 0.5);

        double s = (side1 + side2 + side3) / 2;

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }
    private static boolean isOnTheSameLine(double[][] points) {

        return (points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) == 0;

    }
}
/* s = (side1 + side2 + side3)/2;
area = 2s(s - side1)(s - side2)(s - side3)*/