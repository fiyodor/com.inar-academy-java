package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");

        double number1 = input.nextDouble();

        System.out.print("Enter number2: ");

        double number2 = input.nextDouble();

        System.out.print("Enter number3: ");

        double number3 = input.nextDouble();

        System.out.print(number1 + ", " + number2 + " and " + number3 + " in increasing order: ");

        displaySortedNumbers(number1, number2, number3);

    }

        public static void displaySortedNumbers(double num1, double num2, double num3){

        double temp;

        if (num1 < num2){

            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 < num3){

            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 < num2){

            temp = num1;
            num1 = num2;
            num2 = temp;
        }
            System.out.println(num1 + " > " + num2 + " > " + num3);
        }

}
