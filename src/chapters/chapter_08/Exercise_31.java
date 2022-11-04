package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_31 {

    public static void main(String[] args) {

        double[][] points = new double[4][2];

        fillArrayWithInputs(points);

        double[] intersectingPoints = getIntersectingPoint(points);

        showResult(intersectingPoints);
    }
    public static void fillArrayWithInputs(double[][] array) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

        for (int i = 0; i < array.length; i++) {

            array[i][0] = input.nextDouble();

            array[i][1] = input.nextDouble();
        }
    }
    public static double[] getIntersectingPoint(double[][] points) {

        double[] intersectingPoints = new double[2];

        double a, b, c, d, e, f;

        a = points[0][1] - points[1][1];
        b = -(points[0][0] - points[1][0]);
        c = (points[2][1] - points[3][1]);
        d = -(points[2][0] - points[3][0]);
        e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        if (a * d - b * c == 0) {

            return intersectingPoints;
        }
        else {

            intersectingPoints[0] = (e * d - b * f) / (a * d - b * c);

            intersectingPoints[1] = (a * f - e * c) / (a * d - b * c);
        }
        return intersectingPoints;
    }
    public static void showResult(double[] intersectingPoints) {

        if (intersectingPoints == null) {

            System.out.println("The two lines are parallel.");
        }
        else {

            System.out.printf("The intersecting point is at (%.4f, %.4f)", intersectingPoints[0], intersectingPoints[1]);
        }
    }
}