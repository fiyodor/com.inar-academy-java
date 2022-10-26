package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_34 {

    public static void main(String[] args) {

        final int ROW = 6;

        double[][] coordinatesOfPoints = new double[ROW][2];

        System.out.print("Enter " + ROW + " points: ");

        fillArrayWithInputs(coordinatesOfPoints);

        double[] theRightmostLowestPoint =  getRightmostLowestPoint(coordinatesOfPoints);

        System.out.printf("The rightmost lowest point is (%4.1f, %4.1f)", theRightmostLowestPoint[0], theRightmostLowestPoint[1]);

    }
    public static void fillArrayWithInputs(double[][] array){

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                array[i][j] = input.nextDouble();
            }
        }
    }
    public static double[] getRightmostLowestPoint(double[][] points){

        double minx = points[0][0];

        double miny = points[0][1];

        for (double[] point : points) {

            if (miny > point[1]) {

                miny = point[1];

                minx = point[0];
            }
            if (miny == point[1]) {

                if (minx < point[0]) {

                    minx = point[0];

                    miny = point[1];
                }
            }
        }
        double[] result = {minx, miny};

        return result;
    }
}
