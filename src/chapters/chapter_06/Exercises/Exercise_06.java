package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter row number to display the pattern: ");

        int row = input.nextInt();

        displayPattern(row);

    }
    public static void displayPattern(int n){

        for(int i = 1; i <= n; i++){

            for(int j = n - i; j >= 1; j--){

                System.out.print("  ");
                }
                for(int k = i; k >= 1; k--){

                    System.out.print(k + " ");
                }

                System.out.println();
            }



        }
    }

