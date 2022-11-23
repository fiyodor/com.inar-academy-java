package chapters.chapter_12.Exercises.Exercise_05;

import java.util.Scanner;

public class TriangleTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle: ");

        try {

            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();

            Triangle t1 = new Triangle(side1, side2, side3);

            // String t1color = t1.color;
            //boolean t1Filled = t1.filled;

            System.out.println(t1);

            System.out.println("--------------------------------------------------------------------");

            System.out.print("Enter the color of the triangle: ");

            String color = input.next();

            System.out.print("Is it filled or not(True/False): ");

            boolean filled = input.nextBoolean();

            t1.setColor(color);
            t1.setFilled(filled);

            System.out.println(t1);

            System.out.println("------------------------------------------------------------");

            t1.setColor("Orange");
            t1.setFilled(false);

            System.out.println(t1);
        } catch (IllegalTriangleException illegalTriangleException) {

            illegalTriangleException.printStackTrace();

        }
    }
}
