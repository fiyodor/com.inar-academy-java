package chapters.chapter_06.Exercises;

import java.util.Scanner;

public class Exercise_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long: ");

        long creditCardNumber = input.nextLong();

        System.out.println(creditCardNumber + " is " + (isValid(creditCardNumber) ? "valid" : "invalid"));


    }
    /** Return true if the card number is valid */
    public static boolean isValid(long number){

        return ((getSize(number) <= 16 && getSize(number) >= 13) && (prefixMatched(number, 4)|| prefixMatched(number, 5) ||
                prefixMatched(number, 37) || prefixMatched(number, 6)) && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0));
    }
    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){

        String str = Long.toString(number);

        int sum = 0;

        for (int i = str.length() - 2; i >= 0 ; i -= 2) {

            int num = Integer.parseInt(String.valueOf(str.charAt(i))) * 2;

            sum += getDigit(num) ;
        }
        return sum;
    }
    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number){

        int result = 0;

        if (number >= 10){

            result += (number / 10) + (number % 10);
        }
        else {

            result += number;
        }

        return result;
    }
    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {

        String str = Long.toString(number);

        int sum = 0;

        for (int i = str.length() - 1; i >= 0; i -= 2) {

            int num = Integer.parseInt(str.valueOf(str.charAt(i)));

            sum += getDigit(num);
        }
        return sum;
    }
    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d){

        return getPrefix(number, getSize(d)) == d;
    }
    /** Return the number of digits in d */
    public static int getSize(long d){

        String str = Long.toString(d);

        int size = str.length();

        return size;
    }
    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k){

        String str = Long.toString(number);

        if (str.length() < k) {

            return number;
        }
        str = str.substring(0, k);

        return Long.parseLong(str);


    }

}
