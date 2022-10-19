package chapters.chapter_07;

import java.util.Scanner;

public class Exercise_34 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");

        String str = input.nextLine();

        String sortedStr = sort(str);

        System.out.print("Sorted String is: " + sortedStr);
    }
    public static String sort(String s){

      char[] array = s.toCharArray();

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {

                    char temp = array[i];

                    array[i] = array[j];

                    array[j] = temp;
                }
            }
        }
        String str = "";

        for (int i = 0; i < array.length; i++) {

            str += array[i];
        }
        return str;
    }
}
