package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_19 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 sides for a triangle: ");

        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.println(isValid(s1, s2, s3) ? area(s1, s2, s3) : "The input is invalid");



    }
    /** Return true if the sum of any two sides is
     * greater than the third side. */
    public static boolean isValid(double side1, double side2, double side3){

        return side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1;

    }
    /** Return the area of the triangle. */
    public static double area(double side1, double side2, double side3){

        double s = (side1 + side2 + side3) / 2;

        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);


    }
}



