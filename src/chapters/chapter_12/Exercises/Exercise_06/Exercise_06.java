package chapters.chapter_12.Exercises.Exercise_06;

import java.util.Scanner;

public class Exercise_06 {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        while (true) {
            // Prompt the user to enter a string
            System.out.print("Enter a hex number: ");

            String hex = input.nextLine();

            try {


                System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));

                break;
            } catch (NumberFormatException numberFormatException) {

                System.out.printf("The String you entered is not a hex (%s)\n", hex);
            }
        }

    }

    public static int hexToDecimal(String hex) throws NumberFormatException {

        for (int i = 0; i < hex.length(); i++) {

            char c = hex.charAt(i);

            if (!(c >= 'A' && c <= 'F') && !(c >= '0' && c <= '9')) {

                throw new NumberFormatException();
            }
        }
        return Integer.parseInt(hex, 16);
    }

}
