package chapters.chapter_11.Exercise_01;

import java.util.Scanner;

public class TriangleTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle: ");

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter the color of the triangle: ");

        String color = input.next();

        System.out.print("Is it filled or not(True/False): ");

        boolean filled = input.nextBoolean();

        Triangle t1 = new Triangle(color, filled, side1, side2, side3);

        System.out.println(t1);

        t1.setColor("Orange");
        t1.setFilled(false);

        System.out.println(t1);
    }



}
