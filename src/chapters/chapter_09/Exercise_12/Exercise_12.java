package chapters.chapter_09.Exercise_12;

import chapters.chapter_08.Exercise_01;
import chapters.chapter_09.Exercise_11.LinearEquation;

public class Exercise_12 {

    public static void main(String[] args) {

        final int ROW = 4;

        double[][] points = new double[ROW][2];

        System.out.print("Enter four coordinates: ");

        Exercise_01.fillArrayWithInputs(points);

        double a, b, c, d, e, f;

        a = points[0][1] - points[1][1];
        b = -1 * (points[0][0] - points[1][0]);
        c = points[2][1] - points[3][1];
        d = -1 * (points[2][0] - points[3][0]);
        e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        LinearEquation le = new LinearEquation(a, b, c, d, e, f);

        if(le.isSolvable()){

            System.out.println("x is " + le.getX() + " and y is: " + le.getY());
        }
        else {

            System.out.println("The two lines are parallel");
        }
    }
}
