package chapters.chapter_12.Exercises.Exercise_07;

import java.util.Scanner;

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.print("Enter a binary number: ");

            String binaryNumber = input.nextLine();

            try {

                System.out.println("The decimal value of " + binaryNumber + ": " + bin2dec(binaryNumber));
                break;
            }catch (NumberFormatException numberFormatException){

                System.out.println("The number you entered is not a binary number (" + binaryNumber + ")");
            }
        }
    }
    public static int bin2dec(String binaryNumber) throws NumberFormatException {

        for (int i = 0; i < binaryNumber.length(); i++) {

            if (binaryNumber.charAt(i) != '0' && binaryNumber.charAt(i) != '1') {
                throw new NumberFormatException();
            }
        }
        return Integer.parseInt(binaryNumber, 2);
    }
}
