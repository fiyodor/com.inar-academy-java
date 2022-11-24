package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer to learn if it is a palindrome or not: ");

        int number = input.nextInt();

        System.out.println(number + (isPalindrome(number) ? " is" : " is not") +" a palindrome");


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
    public static boolean isPalindrome(int number){

        return (number == reverse(number));
    }
}
