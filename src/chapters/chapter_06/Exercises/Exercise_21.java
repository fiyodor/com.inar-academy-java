package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_21 {

    public static void main(String[] args) {

        Exercise_21 exercise_21 = new Exercise_21();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a phone number as a String: ");

        String phoneNumber = input.nextLine();

        phoneNumber = phoneNumber.toUpperCase();

        String result = "";

        for (int i = 0; i < phoneNumber.length(); i++) {

            if (phoneNumber.charAt(i) >= 65 && phoneNumber.charAt(i) <= 90){

                result += exercise_21.getNumber(phoneNumber.charAt(i));
            }
            else{

                result += phoneNumber.charAt(i);
            }

        }
        System.out.println(result);
    }

    int getNumber(char uppercaseLetter){

        if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C')
            return 2 ;
        else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F')
            return 3 ;
        else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I')
            return 4 ;
        else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L')
            return 5 ;
        else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O')
            return 6 ;
        else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S')
            return 7 ;
        else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V')
            return 8 ;
        else
            return 9 ;



    }


}
