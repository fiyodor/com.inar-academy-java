package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a, b and c:");

        double[] equation = new double[3];

        for (int i = 0; i < equation.length; i++) {

            equation[i] = input.nextDouble();
        }
        if (solveDiscriminant(equation) > 1) {

            System.out.println("The equation has 2 roots");

            System.out.println("Root 1 is " + getRoot1(equation) + " Root 2 is " + getRoot2(equation));
        }
        else if (solveDiscriminant(equation) == 0 ) {

            System.out.println("The equation has 1 root. Root is " + getRoot1(equation));
        }
        else {

            System.out.println("The equation has no real roots");
        }
    }
    public static double solveDiscriminant(double[] equation) {

        return Math.pow(equation[1], 2) - (4 * equation[0] * equation[2]);
    }
    public static double getRoot1(double[] equation) {

        return (-equation[1] + Math.sqrt(solveDiscriminant(equation)))/ (2 * equation[0]);
    }
    public static double getRoot2(double[] eqn) {

        return (-eqn[1] -  Math.sqrt(solveDiscriminant(eqn))) / (2 * eqn[0]);
    }
}