package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_07 {

    public static void main(String[] args) {

        double[][] points = {
                {-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9},
                {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};

        displayTheClosestTwoPoints(points);
    }
    public static double[][] getClosestPoints(double[][] array) {

        double[][] closestPoints = new double[2][3];

        double minDistance = Double.MAX_VALUE;

        for (int i = 0; i < closestPoints.length - 1; i++) {

            for (int j = i + 1; j < closestPoints[i].length; j++) {

                if (getDistance(array[i],array[j]) < minDistance){

                    closestPoints[0] = array[i];

                    closestPoints[1] = array[j];
                }
            }
        }
        return closestPoints;
    }
    public static double getDistance(double[] point1, double[] point2) {

        double distance = Math.sqrt((point2[0] - point1[0]) * (point2[0] - point1[0]) + (point2[1] - point1[1]) * (point2[1] - point1[1]) + (point2[2] - point1[2]) * (point2[2] - point1[2]));

        return distance;
    }
    public static void displayTheClosestTwoPoints(double[][] points) {

        double[][] nearestTwoPoints = getClosestPoints(points);

        System.out.println("The nearest points are (" + nearestTwoPoints[0][0] + ", " + nearestTwoPoints[0][1] + ", " + nearestTwoPoints[0][2] + ") " + "and (" + nearestTwoPoints[1][0] + ", " + nearestTwoPoints[1][1] + ", " + nearestTwoPoints[1][2] + ")");
    }
}
