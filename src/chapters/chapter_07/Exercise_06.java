package chapters.chapter_07;

public class Exercise_06 {

    public static void main(String[] args) {

        final int ARRAY_LENGTH = 50
                ;

        int[] primeNumbers = new int[ARRAY_LENGTH];

        addPrimeNumbers(primeNumbers);

        printArray(primeNumbers);

    }

    private static void addPrimeNumbers(int[] array) {

        int counter = 0;

        int prime = 2;

        while(counter < array.length ){

            if (isPrime(prime, counter,  array)){

                array[counter] = prime;

                counter++;
            }
            prime++;
        }
    }
    private static boolean isPrime(int number, int counter, int[] array) {

        for (int i = 0; i < counter; i++) {

            if (array[i] <= Math.sqrt(number)){

                if (number % array[i] == 0){

                    return false;
                }
            }
        }
        return true;
    }
    public static void printArray(int[] array){

        int counter = 0;

        for (int i : array) {

            System.out.printf("%-7d", i);

            counter++;

            if (counter % 10 == 0){

                System.out.println();
            }

        }
    }


}
