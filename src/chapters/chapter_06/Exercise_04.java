package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_04 {

    public static void main(String[] args) {

        Scanner inout = new Scanner(System.in);

        System.out.print("Enter an integer to see its reversal: ");

        int number = inout.nextInt();

        System.out.println(number + "'s reversal is " + reverse(number));
    }

        public static int reverse(int number){

            int reversedNumber = 0;
            int numberLong = number;

            while(numberLong != 0){

                reversedNumber = (reversedNumber * 10) + numberLong % 10;

                numberLong /= 10;
            }
            return reversedNumber;

        }
    }

