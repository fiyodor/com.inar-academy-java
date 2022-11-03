package chapters.chapter_09.Exercise_10;

import java.util.Scanner;

public class QuadraticEquationTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter values for a, b and c: ");

        QuadraticEquation qe1 = new QuadraticEquation(input.nextDouble(), input.nextDouble(), input.nextDouble());

        System.out.print("The equation has ");

        if(qe1.getDiscriminant() > 0){

            System.out.println("two roots :" + qe1.getRoot1() + " and " + qe1.getRoot2());

        } else if(qe1.getDiscriminant() == 0) {

            System.out.println("one root: " + qe1.getRoot1());
        }
        else {

            System.out.println("no real roots.");
        }
    }
}
