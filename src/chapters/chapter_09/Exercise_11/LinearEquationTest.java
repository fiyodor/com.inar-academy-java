package chapters.chapter_09.Exercise_11;

import java.util.Scanner;

public class LinearEquationTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e and f: ");

        LinearEquation le = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());

        if(!le.isSolvable()){

            System.out.println("The equation has no solution.");
        }
        else {

            System.out.println("x is " + le.getX() + " y is " + le.getY());
        }
    }
}
