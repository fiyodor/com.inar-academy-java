package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");

        long n = input.nextLong();

        System.out.print("Square root of " + n + " is: " + sqrt(n));

    }
    public static double sqrt(long n){

        double lastGuess = 1;

        double nextGuess = (lastGuess + (n / lastGuess)) / 2;

        while(!(nextGuess - lastGuess <= 0.000000000000000000000000000001)){

            lastGuess = nextGuess;

            nextGuess = (lastGuess + (n / lastGuess)) / 2;
        }
        return nextGuess;
    }

}
