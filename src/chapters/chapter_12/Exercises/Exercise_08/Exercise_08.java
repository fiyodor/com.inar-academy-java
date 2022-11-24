package chapters.chapter_12.Exercises.Exercise_08;

import java.util.Scanner;

public class Exercise_08 {

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
            } catch (HexFormatException hexFormatException) {

                System.out.print(hexFormatException.getMessage());
            }
        }

    }

    public static int hexToDecimal(String hex) throws HexFormatException {

        for (int i = 0; i < hex.length(); i++) {

            char c = hex.charAt(i);

            if (!(c >= 'A' && c <= 'F') && !(c >= '0' && c <= '9')) {

                throw new HexFormatException("The String you entered is not a hex (" + hex + ")");
            }
        }
        return Integer.parseInt(hex, 16);
    }

}