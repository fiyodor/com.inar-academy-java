package chapters.chapter_06;

import java.util.Scanner;

public class Exercise_18 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Your password must have at least eight characters.");
        System.out.println("Your password must consist of only letters and digits.");
        System.out.println("Your password must contain at least two digits.");
        System.out.print("Enter a valid password: ");

        String password = input.nextLine();

        System.out.println(isValid(password) ? "Valid Password" : "Invalid Password");

    }

    public static boolean isValid(String str) {

        if (getPasswordLong(str) < 8) {

            return false;
        }
        if (!haveLettersAndDigits(str)) {

            return false;
        }
        return true;

    }

    public static int getPasswordLong(String str) {

        return str.length();
    }

    public static boolean haveLettersAndDigits(String str) {

        str = str.toUpperCase();

        int digitCounter = 0;

        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) >= 48 && str.charAt(i) <= 57) || (str.charAt(i) >= 65 && str.charAt(i) <= 90)) {

                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {

                    digitCounter++;
                }

            }else{
                return false;
            }
        }
        if (digitCounter < 2) {

            return false;
        }

    return true;
    }
}
