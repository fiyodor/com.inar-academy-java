package chapters.chapter_10.Exercises.Exercise_06;

import chapters.chapter_10.Exercises.Exercise_05.StackOfIntegers;

import java.util.Scanner;

public class Exercise_06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = input.nextInt();

        StackOfIntegers primeNumbers = addPrimeNumbers(number);
        
        display(primeNumbers);
    }

    public static StackOfIntegers addPrimeNumbers(int number){
        
        StackOfIntegers primeNumbers = new StackOfIntegers();

        for(int i = 2; i < number; i++) {

            if(isPrime(i)){

                primeNumbers.push(i);
            }
        }
        return primeNumbers;
    }
    public static boolean isPrime(int number){

        if(number == 2){

            return true;

        }
        else if(number % 2 == 0) {

            return false;
        }
        else {

            for(int i = 3; i < Math.sqrt(number); i += 2) {

                if(number % i == 0){

                    return false;
                }
            }
            return true;
        }
    }
    public static void display(StackOfIntegers primeNumbers){

        while(!primeNumbers.empty()){

            System.out.print(primeNumbers.pop() + " ");
        }
    }
}
