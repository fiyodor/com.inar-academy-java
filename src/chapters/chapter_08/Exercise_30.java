package chapters.chapter_08;

import java.util.Arrays;

import java.util.Scanner;

public class Exercise_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a00, a01, a10, a11, b0, b1:");

        double[][] a = new double[2][2];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                a[i][j] = input.nextDouble();
            }
        }
        double[] b = new double[2];

        for (int i = 0; i < b.length; i++) {

            b[i] = input.nextDouble();
        }
        double[] roots = linearEquation(a, b);

        displayRoots(roots);
    }
    public static void displayRoots(double[] roots) {

        if (roots == null)

            System.out.println("The equation has no solution.");
        else {
            System.out.println(Arrays.toString(roots));
        }
    }
    public static double[] linearEquation(double[][] a, double[] b) {

        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)

            return null;

        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        double y = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        if(x == y) {

            return new double[]{x};
        }
        else {
            return new double[]{x, y};
        }
    }
}