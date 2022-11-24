package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer to be displayed the sum of all its digits: ");

        int number = input.nextInt();

        System.out.println("The sum of all " + number + "'s digits is " + sumDigits(number));


    }

    public static int sumDigits(int n){

        int sum = 0;

        do {
            sum += n % 10;

            n = (n / 10);

        }
        while(n % 10 != 0);

        return sum;
    }
}

