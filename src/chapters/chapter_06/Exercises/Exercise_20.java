package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");

        String str = input.nextLine();

        System.out.println("Number of letters in the String '" + str + "' is " + countLetters(str));



    }

    public static int countLetters(String s){

        s = s.toUpperCase();

        int letterCounter= 0;

        for (int i = 0; i < s.length(); i++) {

           if (s.charAt(i) >= 65 && s.charAt(i) <= 90){

               letterCounter++;
           }

        }
        return letterCounter;
    }
}
