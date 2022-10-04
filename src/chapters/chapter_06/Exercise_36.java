package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_36 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");

        int numberOfSides = input.nextInt();

        System.out.print("Enter the side: ");

        double lengthOfSide = input.nextDouble();

        double area = area(numberOfSides, lengthOfSide);

        System.out.println("The area of the polygon is " + area);
    }

    public static double area(int n, double side){

        double areaOfThePolygon = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));

        return areaOfThePolygon;
    }
}
