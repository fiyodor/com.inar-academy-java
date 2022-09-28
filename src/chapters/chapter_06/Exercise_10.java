package chapters.chapter_06;

public class Exercise_10 {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 0; i <= 10000; i++) {

            if(isPrime(i)){
                counter++;
            }
        }
        System.out.println("The number of prime numbers less than 10000 is " + counter);
    }
    public static boolean isPrime(int number) {

        for (int divisor = 2; divisor <= number / 2; divisor++) {

             if (number % divisor == 0) { // If true, number is not prime

                 return false; // Number is not a prime
                 }
             }

         return true; // Number is prime
         }

    public static void printPrimeNumbers(int numberOfPrimes) {

        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
         int count = 0; // Count the number of prime numbers
         int number = 2; // A number to be tested for primeness

         // Repeatedly find prime numbers
        while (count < numberOfPrimes) {

         // Print the prime number and increase the count
         if (isPrime(number)) {

             count++; // Increase the count
                 if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {

                 // Print the number and advance to the new line
                  System.out.printf("%-5s\n", number);
                  }
                else
                    System.out.printf("%-5s", number);
              }

              // Check whether the next number is prime
              number++;
              }
         }
}
