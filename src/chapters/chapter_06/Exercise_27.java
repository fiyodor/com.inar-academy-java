package chapters.chapter_06;

public class Exercise_27 {

    public static void main(String[] args) {

        int i = 2;

        int counter = 0;

        while(counter <= 100){

            if (isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)) {

                System.out.printf("%-5d  ", i);

                counter++;

                if (counter % 10 == 0) {

                    System.out.println();
                    // System.out.println();
                }
            }
            i++;
        }
    }
    public static int reverse(int number){

        int reversedNumber = 0;
        int numberLong = number;

        while(numberLong != 0){

            reversedNumber = (reversedNumber * 10) + numberLong % 10;

            numberLong /= 10;
        }
        return reversedNumber;

    }

    public static boolean isPrime(int number) {

        for (int divisor = 2; divisor <= number / 2; divisor++) {

            if (number % divisor == 0) { // If true, number is not prime

                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }

    public static boolean isPalindrome(int number){

        return (number == reverse(number));
    }
}
