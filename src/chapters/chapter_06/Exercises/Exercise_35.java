package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of a pentagon:");

        double side = input.nextDouble();

        double area = area(side);

        System.out.println("The area of the pentagon is " + area);

    }

    public static double area(double side){

        return (5 * (Math.pow(side, 2))) / (4 * Math.tan(Math.PI / 5));
    }
}
