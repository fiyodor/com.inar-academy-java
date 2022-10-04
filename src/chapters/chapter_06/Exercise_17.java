package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");

        int n = input.nextInt();

        printMatrix(n);

    }

    public static void printMatrix(int number){

        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {

                System.out.print((int)(Math.random() * 2) + "  ");
            }
            System.out.println();

        }


    }
}
