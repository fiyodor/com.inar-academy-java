package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String and a character: ");

        String str = input.nextLine();

        char ch = input.next().charAt(0);

        System.out.println(count(str, ch));

    }

    public static int count(String str, char a){

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {

            if(a == str.charAt(i)){

                counter++;
            }
        }
        return counter;
    }


}
