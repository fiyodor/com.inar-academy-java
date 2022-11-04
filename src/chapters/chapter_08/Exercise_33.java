package chapters.chapter_08;

import java.util.Scanner;

public class Exercise_33 {

    public static void main(String[] args) {

        double[][] points = new double[4][2];

        System.out.print("Enter  x₀, y₀, x₁, y₁, x₂, y₂, x₃, y₃: ");

        fillArrayWithInputs(points);

        double[] areasOfTriangles = getAreas(points);

        sort(areasOfTriangles);

        displayAreas(areasOfTriangles);
    }

    public static void fillArrayWithInputs(double[][] array) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i][0] = input.nextDouble();

            array[i][1] = input.nextDouble();
        }
    }
    public static double[] getAreas(double[][] fourVertices) {

        double[] intersectingPoints = getIntersectingPoint(fourVertices);

        double[] areas = new double[4];

        for (int triangle = 0; triangle < fourVertices.length - 1; triangle++) {

            areas[triangle] = areaFormula(fourVertices[triangle], fourVertices[triangle + 1], intersectingPoints);
        }
        areas[areas.length - 1] = areaFormula(fourVertices[0], fourVertices[fourVertices.length - 1], intersectingPoints);

        return areas;
    }
    public static double areaFormula(double[] p1, double[] p2, double[] p3) {

        double side1 = Math.pow(Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2), 0.5);

        double side2 = Math.pow(Math.pow(p3[0] - p2[0], 2) + Math.pow(p3[1] - p2[1], 2), 0.5);

        double side3 = Math.pow(Math.pow(p3[0] - p1[0], 2) + Math.pow(p3[1] - p1[1], 2), 0.5);

        double s = (side1 + side2 + side3) / 2;

        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }
    public static void sort(double[] areasOfTriangles) {

        double area;

        for (int a1 = 0; a1 < areasOfTriangles.length - 1; a1++) {

            area = areasOfTriangles[a1];

            for (int a2 = a1 + 1; a2 < areasOfTriangles.length; a2++) {

                if (area > areasOfTriangles[a2]) {

                    areasOfTriangles[a1] = areasOfTriangles[a2];

                    areasOfTriangles[a2] = area;

                    area = areasOfTriangles[a1];
                }
            }
        }
    }
    private static void displayAreas(double[] areasOfTriangles) {

        System.out.print("The areas are ");

        for (double area : areasOfTriangles) {

            System.out.printf("%.2f ", area);
        }
    }
    public static double[] getIntersectingPoint(double[][] points) {

        double[] intersectingPoints = new double[2];

        double a, b, c, d, e, f;

        a = points[0][1] - points[2][1];
        b = -(points[0][0] - points[2][0]);
        c = (points[1][1] - points[3][1]);
        d = -(points[1][0] - points[3][0]);
        e = (points[0][1] - points[2][1]) * points[0][0] - (points[0][0] - points[2][0]) * points[0][1];
        f = (points[1][1] - points[3][1]) * points[1][0] - (points[1][0] - points[3][0]) * points[1][1];

        if (a * d - b * c == 0) {

            return intersectingPoints;
        }
        else {

            intersectingPoints[0] = (e * d - b * f) / (a * d - b * c);

            intersectingPoints[1] = (a * f - e * c) / (a * d - b * c);
        }
        return intersectingPoints;
    }
}