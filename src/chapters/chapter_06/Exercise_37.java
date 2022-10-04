package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_37 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number and its width: ");

        int number = input.nextInt();

        int width = input.nextInt();

        System.out.println(format(number, width));

    }
    public static String format(int number, int width){

        String result = number + "";

        if (result.length() < width){

            for (int i = width - result.length(); i > 0 ; i--) {

                result = 0 + result;

            }
        }
        return result;
    }
}
