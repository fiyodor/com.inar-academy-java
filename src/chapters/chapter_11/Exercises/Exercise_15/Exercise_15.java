package chapters.chapter_11.Exercises.Exercise_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the points: ");

        int numberOfPoints = input.nextInt();

        ArrayList<Double> points = new ArrayList<>();

        System.out.print("Enter the coordinates of the points: ");

        for (int i = 0; i < numberOfPoints * 2; i++) {

            points.add(input.nextDouble());
        }

        System.out.println("The total area is " + getArea(points));
    }

    public static double getArea(ArrayList<Double> points){

        //formula of polygon : 0.5|(x1*y2 + x2*y3 + x3*y4 + x4*y5) - (y1*x1 + y2*x3 + y3*x4 + y4*x5)

        double a = 0;

        for (int i = 0; i < points.size() - 3; i += 2) { //x1*y2 + x2*y3 + x3*y4 + x4*y5...

            a += points.get(i) * points.get(i + 3);
        }
        double b = 0;

        for (int i = 1; i < points.size() - 1; i += 2) {

            b += points.get(i) * points.get(i + 1);  //y1*x1 + y2*x3 + y3*x4 +...
        }
        double area = 0.5 * (a - b);

        return Math.abs(area);
    }
}
