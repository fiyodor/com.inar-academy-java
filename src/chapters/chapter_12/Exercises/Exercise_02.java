package chapters.chapter_12.Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 integer numbers: ");

        int num1;
        int num2;

        boolean next = true;

        while (next) {

            try {
                System.out.print("Enter 2 integer numbers: ");

                num1 = input.nextInt();
                num2 = input.nextInt();

                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

                next = false;
            }
            catch (InputMismatchException inputMismatchException){

                System.out.println("Wrong input. Please enter integer numbers");

               input.nextLine();
            }



        }



    }
}
