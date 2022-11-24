package chapters.chapter_12.Exercises.Exercise_09;

import java.util.Scanner;

public class Exercise_09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.print("Enter a binary number: ");

            String binaryNumber = input.nextLine();

            try {

                System.out.println("The decimal value of " + binaryNumber + ": " + bin2dec(binaryNumber));
                break;
            }catch (BinaryFormatException binaryFormatException){

                System.out.println(binaryFormatException.getMessage());


            }
        }
    }
    public static int bin2dec(String binaryNumber) throws BinaryFormatException {

        for (int i = 0; i < binaryNumber.length(); i++) {

            if (binaryNumber.charAt(i) != '0' && binaryNumber.charAt(i) != '1') {

                throw new BinaryFormatException("The number you entered is not a binary number (" + binaryNumber + ")");
            }
        }
        return Integer.parseInt(binaryNumber, 2);
    }
}
